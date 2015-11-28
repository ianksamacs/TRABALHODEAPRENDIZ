 

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

public class Clientes extends JFrame { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTextField jtfNome;
	private JTextField jtfEmail;
	private JTextField jtfTelefone;
	private JTextField jtfEndereco;
	private JTextField jtfCep;
	private JTextField jtfNumero;
	private JTextField jtfCpf;
	private JTextField jtfRg;
	private JTextField jtfEmissorRg;
	private JTextField jtfUf;
	private JTextField jtfdataNasc;
	private JRadioButton fem, masc;
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
	public Clientes() {
		setTitle("Clientes"); //Título da janela
		setBounds(100, 100, 710, 550); //Tamanho do frame
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Cliente - Pessoa Física");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(27, 20, 293, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblCliente = new JLabel("Nome");
		lblCliente.setBounds(27, 79, 120, 14);
		contentPane.add(lblCliente);
		
		jtfNome = new JTextField();
		jtfNome.setBounds(27, 98, 351, 26);
		jtfNome.setColumns(10);
		contentPane.add(jtfNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(27, 180, 71, 14);
		contentPane.add(lblCpf);
		
		JLabel lbldataNasc = new JLabel("Data de Nasc.");
		lbldataNasc.setBounds(27, 132, 120, 14);
		contentPane.add(lbldataNasc);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(132, 132, 80, 14);
		contentPane.add(lblSexo);
		
		fem = new JRadioButton("Feminino");
		fem.setBounds(132, 132, 76, 45);
		contentPane.add(fem);
		
		masc = new JRadioButton("Masculino");
		masc.setBounds(215, 132, 90, 45);
		contentPane.add(masc);
		
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
			mascaraTelefone = new MaskFormatter("(##) ####-####");
			mascaraCep = new MaskFormatter("#####-###");
			mascaraCelular = new MaskFormatter("(##) #####-####");
			mascaraRg = new MaskFormatter("##.###.###-#");
			mascaradataNasc = new MaskFormatter(" ##/##/#### ");
			mascaraCpf.setPlaceholderCharacter('_');
			mascaraTelefone.setPlaceholderCharacter('_');
			mascaraCep.setPlaceholderCharacter('_');	
			mascaraCelular.setPlaceholderCharacter('_');
			mascaraRg.setPlaceholderCharacter('_');
			mascaradataNasc.setPlaceholderCharacter('_');
			
		}
		
		catch(ParseException excp) {}
			cpf = new JFormattedTextField(mascaraCpf);
			telefone = new JFormattedTextField(mascaraTelefone);
			cep = new JFormattedTextField(mascaraCep);
			celular = new JFormattedTextField(mascaraCelular);
			rg = new JFormattedTextField(mascaraRg);
			dataNasc = new JFormattedTextField(mascaradataNasc);
			cpf.setBounds(27, 199, 99, 26);
			cep.setBounds(401, 250, 68, 26);
			telefone.setBounds(27, 304, 93, 26);
			celular.setBounds(135, 304, 98, 26);
			rg.setBounds(135, 199, 86, 26);
			dataNasc.setBounds(27, 150, 75, 26);
			getContentPane().add(cpf);
			getContentPane().add(telefone);
			getContentPane().add(cep);
			getContentPane().add(celular);
			getContentPane().add(rg);
			getContentPane().add(dataNasc);
			setVisible(true);
			
		
		jtfCpf = new JTextField();
		jtfCpf.setColumns(10);
		contentPane.add(jtfCpf);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(135, 180, 120, 20);
		contentPane.add(lblRg);
		
		jtfRg = new JTextField();
		jtfRg.setColumns(10);
		contentPane.add(jtfRg);
		
		JLabel lblEmissorRg = new JLabel("Emissor do RG");
		lblEmissorRg.setBounds(230, 180, 85, 20);
		contentPane.add(lblEmissorRg);
		
		jtfEmissorRg = new JTextField();
		jtfEmissorRg.setColumns(10);
		jtfEmissorRg.setBounds(230, 199, 85, 26);
		contentPane.add(jtfEmissorRg);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(330, 180, 80, 20);
		contentPane.add(lblUf);
		
		jtfUf = new JTextField();
		jtfUf.setColumns(10);
		jtfUf.setBounds(330, 199, 50, 26);
		contentPane.add(jtfUf);
		
		JLabel lblCodigo = new JLabel("Código");
		lblCodigo.setBounds(401, 79, 71, 14);
		contentPane.add(lblCodigo);
		
		jtfCodigo = new JTextField();
		jtfCodigo.setColumns(10);
		jtfCodigo.setBounds(401, 98, 75, 26);
		contentPane.add(jtfCodigo);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(135, 285, 100, 14);
		contentPane.add(lblCelular);
		
		jtfCelular = new JTextField();
		jtfCelular.setColumns(10);
		contentPane.add(jtfCelular);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(27, 230, 71, 14);
		contentPane.add(lblEndereco);
		
		jtfEndereco = new JTextField();
		jtfEndereco.setColumns(10);
		jtfEndereco.setBounds(27, 250, 295, 26);
		contentPane.add(jtfEndereco);
		
		JLabel lblNumero = new JLabel("N°");
		lblNumero.setBounds(331, 230, 71, 14);
		contentPane.add(lblNumero);
		
		jtfNumero = new JTextField();
		jtfNumero.setColumns(10);
		jtfNumero.setBounds(331, 250, 60, 26);
		contentPane.add(jtfNumero);
		
		String[] CaixaLista = {" ","AC","AL", "AP", "AM", "BA", "CE", "DF", "ES",
				"GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RS",
				"RO", "RR", "SC", "SP", "SE", "TO"};
		jtfEstado = new JComboBox(CaixaLista);
		jtfEstado.setBounds(480, 250,70,26);
		getContentPane().add(jtfEstado);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(480, 230, 71, 14);
		contentPane.add(lblEstado);
		
			
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(401, 230, 71, 14);
		contentPane.add(lblCep);
		
		jtfCep = new JTextField();
		jtfCep.setColumns(10);
		contentPane.add(jtfCep);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(560, 230, 100, 14);
		contentPane.add(lblComplemento);
				
		JTextField jtfComplemento = new JTextField();
		jtfComplemento.setColumns(20);
		jtfComplemento.setBounds(560, 250, 100, 26);
		contentPane.add(jtfComplemento);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(27, 285, 71, 14);
		contentPane.add(lblTelefone);
		
		jtfTelefone = new JTextField();
		jtfTelefone.setColumns(10);	
		contentPane.add(jtfTelefone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(27, 335, 46, 14);
		contentPane.add(lblEmail);
		
		jtfEmail = new JTextField();
		jtfEmail.setColumns(10);
		jtfEmail.setBounds(27, 355, 351, 26);
		contentPane.add(jtfEmail);	
		
		JLabel lblLimiteCredito = new JLabel("Limite de Crédito");
		lblLimiteCredito.setBounds(27, 387, 100, 14);
		contentPane.add(lblLimiteCredito);
		
		jtfLimiteCredito = new JTextField();
		jtfLimiteCredito.setColumns(10);
		jtfLimiteCredito.setBounds(27, 409, 170, 26);
		contentPane.add(jtfLimiteCredito);
		
		JButton btnCadastrar = new JButton("Cadastrar");		
		btnCadastrar.setBounds(290, 445, 97, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(188, 445, 89, 25);
		contentPane.add(btnLimpar);
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtfNome.setText("");
				jtfEmail.setText("");
				jtfTelefone.setText("");
				jtfEndereco.setText("");
				jtfCep.setText("");
				jtfNumero.setText("");
				jtfEndereco.setText("");
				jtfCpf.setText("");
				jtfRg.setText("");
				jtfdataNasc.setText("");
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
					Clientes frame = new Clientes();
					frame.setVisible(true);
				
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}

