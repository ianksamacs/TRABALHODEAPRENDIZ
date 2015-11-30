package controle;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import conexao.Conexao;

import conexao.Conexao;


public class testeControle {
    private Conexao con; 
    
    public testeControle() {
    con = new Conexao();
}
    public boolean addPlaca(String nome, String descricao, String cnpj, int tipo, int codigo, int codigoTipo, 
        String tipoCi, int qtdCi) { 
        
        return con.addPlaca(nome, descricao, cnpj, tipo, codigo, codigoTipo, tipoCi, qtdCi);
            
            
    }
    
    
}
