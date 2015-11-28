 
package testeGrafico;

 

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

//import sistema.conexao.Conexao;

import java.sql.*;

public class ItensVendidos extends JFrame{
  public ItensVendidos(){
    super("Itens Vendidos");
    JButton imprimir;
		
    final DefaultTableModel modelo = new DefaultTableModel();
    
    // constrói a tabela
    JTable tabela = new JTable(modelo);
    
    // Cria duas colunas
    modelo.addColumn("Código");
    modelo.addColumn("Vendedor");
    modelo.addColumn("Produto");
    modelo.addColumn("Quantidade");
    
    imprimir = new JButton("Imprimir");
    imprimir.setBounds(100, 450, 30, 24);
    
    
    
    // exibe os dados da tabela MySQL
    //Conexao banco = new Conexao();
	String retorno = "erro";
    try{
    	//Connection ExConn = (Connection) banco.abrirBDconn();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
        Statement stmt = conexao.createStatement();
           
      // procedimentos para obter os dados de uma tabela
     
      String query = "SELECT * FROM venda2";
      ResultSet rs = stmt.executeQuery(query);
      
      while(rs.next()){ 
        int id = rs.getInt("idVendedor");
        String nome = rs.getString("nomeVendedor");
        String produto = rs.getString("produto");
        int qtd = rs.getInt("qtd");
        modelo.addRow(new Object[]{new Integer(id), nome, produto, new Integer(qtd)});
      }
           
      // fim procedimento para obter os dados
      } 
      catch(SQLException ex){
           System.out.println("SQLException: " + ex.getMessage());
           System.out.println("SQLState: " + ex.getSQLState());
           System.out.println("VendorError: " + ex.getErrorCode());
      }
      catch(Exception e){
        System.out.println("Problemas ao tentar conectar com o banco de dados");	
    }
    // fim MySQL
    
    tabela.setPreferredScrollableViewportSize(new Dimension(350, 50));
	
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
			
    JScrollPane scrollPane = new JScrollPane(tabela);
    c.add(scrollPane);
    c.add(imprimir);
    	
    setSize(400, 300);
    setVisible(true);
  }
	
  public static void main(String args[]){
    ItensVendidos app = new ItensVendidos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    String tema_padrao = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";  
    
    try {    
          UIManager.setLookAndFeel(tema_padrao);    
        } catch (Exception e) {    
    }  
  }
}


