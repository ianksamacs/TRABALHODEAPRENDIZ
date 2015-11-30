package conexao;

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
	
    public Conexao() {

         url = "jdbc:mysql://localhost:3306/projeto"; 
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
    
    
    
    public boolean addPlaca(String nome, String descricao, String cnpj, int tipo, int codigo, int codigoTipo, 
            String tipoCi, int qtdCi){
        
     try{
         
         stt.execute("INSERT INTO cadastroplaca(nome, descricao, cnpj, tipo, codigo, codigoTipo, tipoCi, qtdCi) VALUES ('"+nome+"','"+descricao+"', '"+cnpj+"',"+tipo+","+codigo+","+codigoTipo+",'"+tipoCi+"', "+qtdCi+")"); 
         return true;
         }catch (Exception e){ 
          e.printStackTrace();
          return false; 
         }
    }
    
    
    

}

