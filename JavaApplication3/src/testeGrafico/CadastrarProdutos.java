package testeGrafico;


import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class CadastrarProdutos extends JFrame {
	private JTextField tfProduto;
	private JLabel lbSenha;
	private JLabel lbTipoProd;
	private JButton btCadastrar;
	private JButton btCancelar;
	private JLabel imgProduto;
	private static CadastrarProdutos frame;
	private JComboBox Produto;
	
	public CadastrarProdutos() {
		setLocationRelativeTo(null);
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Cadastro de Produtos");
		setBounds(0,0,350,250);
		setLayout(null);
		
		
		tfProduto = new JTextField(5);
		lbTipoProd = new JLabel("Tipo de Produto");
		btCadastrar = new JButton("Cadastrar");
		btCancelar = new JButton("Sair");
		lbTipoProd.setBounds(135, 50, 100, 25);
		btCadastrar.setBounds(85, 145, 85, 25);
		btCancelar.setBounds(185, 145, 85, 25);
		add(tfProduto);
		add(lbTipoProd);
		add(btCadastrar);
		add(btCancelar);
		
		
		Icon produto = new ImageIcon("src/prod.png");
		imgProduto = new JLabel(produto);
		imgProduto.setBounds(15, 35, 100, 100);
		add(imgProduto);
		
		String[] Produtos = {"", "Placa","Periféricos"};
		Produto = new JComboBox(Produtos);
		Produto.setBounds(135, 75, 120, 25);
		getContentPane().add(Produto);
		
	}
	
	private void definirEventos() {
		
		
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = (String)(Produto.getSelectedItem());
								
				if(Produto.getSelectedItem().equals("Livros")) {
					btCadastrar.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							
							
						}
					});
					
				}
				else if(Produto.getSelectedItem().equals("CD's/Dvd's")) {
					btCadastrar.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							
						}
					});
				}
				else {
					JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
				}
			}
		});
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame = new CadastrarProdutos();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation((tela.width - frame.getSize().width) / 2,
						(tela.height - frame.getSize().height) / 2);
				frame.setVisible(true);
				
				
			}
		});
	}
}

