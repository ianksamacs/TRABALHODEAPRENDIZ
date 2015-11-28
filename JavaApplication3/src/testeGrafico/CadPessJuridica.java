 package testeGrafico;
 

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.text.*;

import javax.swing.text.*;

public class CadPessJuridica extends JFrame { 
	 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField jtfRazao, jtfNFantasia, InscEstadual;
	private JTextField jtfEmail;
	private JTextField jtfTelefone, jtfFax;
	private JTextField jtfEndereco;
	private JTextField jtfCep;
	private JTextField jtfNumero;
	private JTextField jtfCnpj;
	private JTextField jtfRg;
	private JTextField jtfCidade, jtfBairro;
	private JTextField jtfCodigo;
	private JTextField jtfLimiteCredito;
	@SuppressWarnings("rawtypes")
	private JComboBox jtfEstado;
	@SuppressWarnings({ "unused", "rawtypes" })
	private JComboBox jtfPais;
	private JTextField jtfCelular;
	JFormattedTextField telefone, cep, cpf, celular, rg, dataNasc;
	MaskFormatter mascaraTelefone, mascaraCep, mascaraCpf, mascaraCelular, mascaraRg, mascaradataNasc;
	
		 
		
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CadPessJuridica() {
		setTitle("Clientes"); //Título da janela
		setBounds(100, 100, 710, 550); //Tamanho do frame
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente - Pessoa Jurídica");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(27, 11, 280, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblRazao = new JLabel("Razão Social");
		lblRazao.setBounds(27, 79, 120, 14);
		contentPane.add(lblRazao);
		
		jtfRazao = new JTextField();
		jtfRazao.setBounds(27, 98, 275, 26);
		jtfRazao.setColumns(10);
		contentPane.add(jtfRazao);
		
		JLabel lblNFantasia = new JLabel("Nome Fantasia");
		lblNFantasia.setBounds(320, 79, 90, 14);
		contentPane.add(lblNFantasia);
		
		jtfNFantasia = new JTextField();
		jtfNFantasia.setColumns(10);
		jtfNFantasia.setBounds(320, 98, 275, 26);
		contentPane.add(jtfNFantasia);
		
						
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(27, 132, 120, 14);
		contentPane.add(lblCnpj);
		
		jtfCnpj = new JTextField();
		jtfCnpj.setColumns(10);
		jtfCnpj.setBounds(27, 151, 99, 26);
		contentPane.add(jtfCnpj);
		
		JLabel lblInscEstadual = new JLabel("Inscrição Estadual");
		lblInscEstadual.setBounds(150, 132, 130, 14);
		contentPane.add(lblInscEstadual);
		
		InscEstadual = new JTextField();
		InscEstadual.setBounds(150, 151, 120, 26);
		contentPane.add(InscEstadual);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(27, 190, 71, 14);
		contentPane.add(lblTelefone);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setColumns(10);	
		jtfTelefone.setBounds(27, 209, 93, 26);
		contentPane.add(jtfTelefone);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(140, 190, 71, 14);
		contentPane.add(lblFax);
		
		jtfFax = new JTextField();
		jtfFax.setBounds(140, 209, 93, 26);
		contentPane.add(jtfFax);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(255, 190, 46, 14);
		contentPane.add(lblEmail);
		
		jtfEmail = new JTextField();
		jtfEmail.setColumns(10);
		jtfEmail.setBounds(255, 209, 351, 26);
		contentPane.add(jtfEmail);	
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(27, 245, 71, 14);
		contentPane.add(lblEndereco);
		
		jtfEndereco = new JTextField();
		jtfEndereco.setColumns(10);
		jtfEndereco.setBounds(27, 264, 275, 26);
		contentPane.add(jtfEndereco);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(325, 245, 71, 14);
		contentPane.add(lblCep);
		
		jtfCep = new JTextField();
		jtfCep.setColumns(10);
		jtfCep.setBounds(325, 264, 60, 26);
		contentPane.add(jtfCep);
		
		JLabel lblNumero = new JLabel("N°");
		lblNumero.setBounds(405, 245, 71, 14);
		contentPane.add(lblNumero);
		
		jtfNumero = new JTextField();
		jtfNumero.setColumns(10);
		jtfNumero.setBounds(405, 264, 68, 26);
		contentPane.add(jtfNumero);
		
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(27, 300, 100, 14);
		contentPane.add(lblCidade);
		
		jtfCidade = new JTextField();
		jtfCidade.setColumns(50);
		jtfCidade.setBounds(27, 319, 170, 26);
		contentPane.add(jtfCidade);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(220, 300, 100, 14);
		contentPane.add(lblBairro);
		
		jtfBairro = new JTextField();
		jtfBairro.setColumns(50);
		jtfBairro.setBounds(220, 319, 170, 26);
		contentPane.add(jtfBairro);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(410, 300, 71, 14);
		contentPane.add(lblEstado);
		
		String[] CaixaLista = {" ","AC","AL", "AP", "AM", "BA", "CE", "DF", "ES",
				"GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RS",
				"RO", "RR", "SC", "SP", "SE", "TO"};
		jtfEstado = new JComboBox(CaixaLista);
		jtfEstado.setBounds(410, 319,70,26);
		getContentPane().add(jtfEstado);
		
				
		
		JLabel lblLimiteCredito = new JLabel("Limite de Crédito");
		lblLimiteCredito.setBounds(27, 360, 100, 14);
		contentPane.add(lblLimiteCredito);
		
		jtfLimiteCredito = new JTextField();
		jtfLimiteCredito.setColumns(10);
		jtfLimiteCredito.setBounds(27, 379, 170, 26);
		contentPane.add(jtfLimiteCredito);
		
		
		
		
		
		/*try {
			
			mascaraTelefone = new MaskFormatter("(##) ####-####");
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCelular = new MaskFormatter("(##) #####-####");
			mascaraRg = new MaskFormatter("##.###.###-#");
			mascaradataNasc = new MaskFormatter(" ##/##/#### ");
			
			mascaraTelefone.setPlaceholderCharacter('_');
			mascaraCep.setPlaceholderCharacter('_');	
			mascaraCelular.setPlaceholderCharacter('_');
			mascaraRg.setPlaceholderCharacter('_');
			mascaradataNasc.setPlaceholderCharacter('_');
			
		}
		
		catch(ParseException excp) {}
			
			telefone = new JFormattedTextField(mascaraTelefone);
			cep = new JFormattedTextField(mascaraCep);
			celular = new JFormattedTextField(mascaraCelular);
			rg = new JFormattedTextField(mascaraRg);
		
			
			cep.setBounds(401, 250, 68, 26);
			telefone.setBounds(27, 304, 93, 26);
			celular.setBounds(135, 304, 98, 26);
			rg.setBounds(135, 199, 86, 26);
			dataNasc.setBounds(27, 150, 75, 26);
			
			getContentPane().add(telefone);
			getContentPane().add(cep);
			getContentPane().add(celular);
			getContentPane().add(rg);
			getContentPane().add(dataNasc);
			setVisible(true);*/
			
		
		
		JButton btnCadastrar = new JButton("Cadastrar");		
		btnCadastrar.setBounds(290, 445, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(188, 445, 89, 25);
		contentPane.add(btnLimpar);
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfRazao.setText("");
				jtfEmail.setText("");
				jtfTelefone.setText("");
				jtfEndereco.setText("");
				jtfCep.setText("");
				jtfNumero.setText("");
				jtfEndereco.setText("");
				jtfCnpj.setText("");
				jtfRg.setText("");
				
				jtfCodigo.setText("");
				jtfCelular.setText(""); 
				
			}
		});
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(400, 445, 89, 25);
		contentPane.add(btnSair); 
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			} 
		});
			
		
	}
		
	
	public static void main (String [] args) {
		
		String tema_padrao = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";  
        
        try {    
              UIManager.setLookAndFeel(tema_padrao);    
            } catch (Exception e) {    
        }  
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadPessJuridica frame = new CadPessJuridica();
					frame.setVisible(true);
				
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}


 
