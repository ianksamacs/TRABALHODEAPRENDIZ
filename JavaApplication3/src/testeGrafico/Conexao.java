/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeGrafico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
    private static String url;
 private static String user;
 private static String password;
 private static Connection con;
 private static Statement stt;
 
 
    public Conexao()
    {
         url = "jdbc:mysql://localhost:3306/banco"; 
         user = "root";
         password = "";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
            stt = con.createStatement();
        }catch (Exception e){
         e.printStackTrace();
        }
        
        
    }
    
    public boolean addVideo(String nome, String urlB, String urlR, String uploader){
     
     
     try{
    
     stt.execute("INSERT INTO video (nome, urlB, urlR, pontuacao, uploader) VALUES ('"+nome+"', '"+urlB+"', '"+urlR+"',"+ 0 +",'"+uploader+"')"); 
     return true;
     }catch (Exception e){
      e.printStackTrace();
      return false;
     }
    }

    
    
    public boolean addUsuario(String login, String senha){
        Criptografia crip = new Criptografia();
     senha = crip.criptografar(senha);
     try{
         
         stt.execute("INSERT INTO login(usuario, senha) VALUES ('"+login+"','"+senha+"')");
         return true;
         }catch (Exception e){ 
          e.printStackTrace();
          return false; 
         }
    }
    
    public boolean addPontuacao(String nomeUser, int idVideo, int valor){
     ResultSet res;
     float valor2 = 0, i =0;
     try{
         stt.execute("INSERT INTO pontuados(nickUser, idVideo, valor) VALUES ('"+nomeUser+"',"+idVideo+","+valor+")");
         PreparedStatement prep = con.prepareStatement("SELECT * FROM pontuados WHERE idVideo = "+ idVideo);

         res = prep.executeQuery();
         while(res.next()){
          i++;
                valor2 = valor2+ res.getFloat("valor");
             System.out.println(valor2);
            }
            
            if(i!=0)
             valor2 = valor2/i;
            else
             valor2=0;
            
            stt.execute("UPDATE video SET pontuacao = "+valor2+" WHERE id = "+idVideo);
         return true;
         }catch (Exception e){
          e.printStackTrace();
          return false;
         }
    }
    
    public boolean addUsuario(String nome, String email, String senha){
     
       
     
     try{
     stt.execute("INSERT INTO usuario (nome, email, senha) VALUES ('"+nome+"','"+email+"','"+senha+"')");
     return true;
     }catch (Exception e){
      e.printStackTrace();
      return false;
     }
     
    }
    
    public static boolean login(String email, String senha){
     boolean logar = false;
     ResultSet res;
     try{
     PreparedStatement prep = con.prepareStatement("SELECT * FROM login ");
     res = prep.executeQuery();
     Criptografia crip = new Criptografia();
     senha = crip.criptografar(senha);
             
     while(res.next()){
      if(senha.equals(res.getString("senha")) && email.equals(res.getString("usuario")))
      logar = true;
     }
         }catch (Exception e){
          e.printStackTrace();
          return false;
         }
     return logar;
    }
    
    public static String ordemPonto(boolean crescente){
     ResultSet res;
     String result = "";
     try{
     PreparedStatement prep;
     if(crescente)
      prep = con.prepareStatement("SELECT * FROM video ORDER BY pontuacao ASC");
     else
      prep = con.prepareStatement("SELECT * FROM video ORDER BY pontuacao DESC");
     res = prep.executeQuery();
     
     while(res.next()){
      result= result + res.getString("nome") + ";";
     }
     }
     catch(Exception e){
      e.printStackTrace();
      return null;
     }
     return result;
    }
    
    public static String busca(String busc){
     
     String result = "";
     ResultSet res;
     try{
     PreparedStatement prep = con.prepareStatement("SELECT * FROM video WHERE nome LIKE "+ busc);
     res = prep.executeQuery();
     
     while(res.next()){
      result = result + res.getString("nome")+";";
     }
     }catch(Exception e){
      
      return null;
     }
     return result;
    }
    
    public String getUrl(int id, int qualidade){
     
     ResultSet res;
     String result = null;
     
     try{
     PreparedStatement prep = con.prepareStatement("SELECT * FROM video");
     res = prep.executeQuery();
     
     while(res.next()){
      if(res.getInt("id") == id){
       if( qualidade == 0 ){
        result = res.getString("urlR");
       }
       else
        result = res.getString("urlB");
      }
     }
     }catch(Exception e){
      e.printStackTrace();
     }
     return result;
    }
}
