package testeGrafico;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.text.*;

import javax.swing.text.*;



public class Fornecedores extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField jtfNome;
	private JTextField jtfEmail;
	private JTextField jtfTelefone;
	private JTextField jtfFax;
	private JTextField jtfEndereco;
	private JTextField jtfCep;
	private JTextField jtfNumero;
	private JTextField jtfCnpj;
	//private JTextField jtfRazao;
	private JTextField jtfCodigo;
	private JTextField jtfNomeFantasia;
	private JTextField jtfNomeRepresentante;
	@SuppressWarnings("rawtypes")
	private JComboBox jtfEstado;
	@SuppressWarnings({ "rawtypes", "unused" })
	private JComboBox jtfPais;
	private JTextField jtfCelular;
	JFormattedTextField telefone, fax, cep, cnpj, celular;
	MaskFormatter mascaraTelefone, mascaraFax, mascaraCep, mascaraCnpj, mascaraCelular; 
	
		
		
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Fornecedores() {
		setTitle("Fornecedores");
		setBounds(100, 100, 710, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Fornecedor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(27, 11, 233, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do fornecedor:");
		lblNewLabel_1.setBounds(27, 79, 120, 14);
		contentPane.add(lblNewLabel_1);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(27, 98, 351, 26);
		jtfNome.setColumns(10);
		contentPane.add(jtfNome);
		
		JLabel lblCnpj = new JLabel("CNPJ");
		lblCnpj.setBounds(390, 79, 71, 14);
		contentPane.add(lblCnpj);
		
		try {
			mascaraCnpj = new MaskFormatter("##.###.###/####-##");
			mascaraTelefone = new MaskFormatter("(##) ####-####");
			mascaraFax = new MaskFormatter("(##) ####-####");
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCelular = new MaskFormatter("(##) #####-####");
			mascaraCnpj.setPlaceholderCharacter('_');
			mascaraTelefone.setPlaceholderCharacter('_');
			mascaraFax.setPlaceholderCharacter('_');
			mascaraCep.setPlaceholderCharacter('_');	
			mascaraCelular.setPlaceholderCharacter('_');
			
		}
		
		catch(ParseException excp) {}
			cnpj = new JFormattedTextField(mascaraCnpj);
			telefone = new JFormattedTextField(mascaraTelefone);
			fax = new JFormattedTextField(mascaraFax);
			cep = new JFormattedTextField(mascaraCep);
			celular = new JFormattedTextField(mascaraCelular);
			cnpj.setBounds(390, 98, 120, 26);
			cep.setBounds(401, 199, 68, 26);
			telefone.setBounds(27, 250, 93, 26);
			fax.setBounds(135, 250, 93, 26);
			celular.setBounds(245, 250, 98, 26);
			getContentPane().add(cnpj);
			getContentPane().add(telefone);
			getContentPane().add(fax);
			getContentPane().add(cep);
			getContentPane().add(celular);
			setVisible(true);
			
		
		jtfCnpj = new JTextField();
		jtfCnpj.setColumns(10);
		contentPane.add(jtfCnpj);
		
		JLabel lblCodigo = new JLabel("Código");
		lblCodigo.setBounds(520, 79, 71, 14);
		contentPane.add(lblCodigo);
		
		jtfCodigo = new JTextField();
		jtfCodigo.setColumns(10);
		jtfCodigo.setBounds(520, 98, 75, 26);
		contentPane.add(jtfCodigo);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(245, 230, 100, 14);
		contentPane.add(lblCelular);
		
		jtfCelular = new JTextField();
		jtfCelular.setColumns(10);
		contentPane.add(jtfCelular);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(27, 132, 46, 14);
		contentPane.add(lblEmail);
		
		jtfEmail = new JTextField();
		jtfEmail.setColumns(10);
		jtfEmail.setBounds(27, 150, 351, 26);
		contentPane.add(jtfEmail);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(27, 180, 71, 14);
		contentPane.add(lblEndereco);
		
		jtfEndereco = new JTextField();
		jtfEndereco.setColumns(10);
		jtfEndereco.setBounds(27, 199, 295, 26);
		contentPane.add(jtfEndereco);
		
		JLabel lblNumero = new JLabel("N°");
		lblNumero.setBounds(331, 180, 71, 14);
		contentPane.add(lblNumero);
		
		jtfNumero = new JTextField();
		jtfNumero.setColumns(10);
		jtfNumero.setBounds(331, 199, 60, 26);
		contentPane.add(jtfNumero);
		
		String[] CaixaLista = {" ","AC","AL", "AP", "AM", "BA", "CE", "DF", "ES",
				"GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RS",
				"RO", "RR", "SC", "SP", "SE", "TO"};
		jtfEstado = new JComboBox(CaixaLista);
		jtfEstado.setBounds(480, 199, 70, 26);
		getContentPane().add(jtfEstado);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(480, 180, 71, 14);
		contentPane.add(lblEstado);
		
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(401, 180, 71, 14);
		contentPane.add(lblCep);
		
		jtfCep = new JTextField();
		jtfCep.setColumns(10);
		contentPane.add(jtfCep);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(27, 230, 71, 14);
		contentPane.add(lblTelefone);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setColumns(10);	
		contentPane.add(jtfTelefone);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(135, 230, 71, 14);
		contentPane.add(lblFax);
		
		jtfFax = new JTextField();
		jtfFax.setColumns(10);
		contentPane.add(jtfFax);		
				
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia");
		lblNomeFantasia.setBounds(27, 285, 100, 14);
		contentPane.add(lblNomeFantasia);
		
		jtfNomeFantasia = new JTextField();
		jtfNomeFantasia.setColumns(10);
		jtfNomeFantasia.setBounds(27, 305, 351, 26);
		contentPane.add(jtfNomeFantasia);
		
		JLabel lblNomeRepresentante = new JLabel("Nome do Representante");
		lblNomeRepresentante.setBounds(27, 337, 150, 14);
		contentPane.add(lblNomeRepresentante);
		
		jtfNomeRepresentante = new JTextField();
		jtfNomeRepresentante.setColumns(10);
		jtfNomeRepresentante.setBounds(27, 357, 351, 26);
		contentPane.add(jtfNomeRepresentante);
		
	
				
		JButton btnCadastrar = new JButton("Cadastrar");		
		btnCadastrar.setBounds(290, 400, 97, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(188, 400, 89, 23);
		contentPane.add(btnLimpar);
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfNome.setText("");
				jtfEmail.setText("");
				jtfTelefone.setText("");
				jtfEndereco.setText("");
			}
		});
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(400, 400, 89, 23);
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
					Fornecedores frame = new Fornecedores();
					frame.setVisible(true);
				
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}

