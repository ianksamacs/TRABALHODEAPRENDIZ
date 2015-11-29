package testeGrafico;

import java.awt.*; 

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Image.*;


public class InterfacePrincipal extends JFrame {
	
	
	private static final long serialVersionUID = 1L;
	
	


	private JButton btPrimeiro, btSegundo, btTerceiro, btQuarto, btQuinto, btSexto;
	private static InterfacePrincipal frame;
	private JLabel imgLogin;
	private JLabel image;
	
	
	
	  	       
		  	
	
	public InterfacePrincipal() {
		
		
			 
	      
		
		setTitle("Controle de Vendas/Estoque"); 
		setSize(new Dimension(800, 500));
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
				
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar); 
		
		JMenu cadastrosMenu = new JMenu("Cadastros ");
		JMenu estoqueMenu = new JMenu("Produtos/Estoque ");
		JMenu pedidosMenu = new JMenu("Pedidos de Vendas ");
		JMenu financeiroMenu = new JMenu("Financeiro ");
		JMenu ajudaMenu = new JMenu("Ajuda");
		
		menuBar.add(cadastrosMenu);
		menuBar.add(estoqueMenu);
		menuBar.add(pedidosMenu);
		menuBar.add(financeiroMenu);
		menuBar.add(ajudaMenu);
		
		JMenuItem ItensVend = new JMenuItem("Itens Vendidos");
		ItensVend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		estoqueMenu.add(ItensVend);
		
		
		
			
		
		
		JMenuItem fornecedoresAction = new JMenuItem("Fornecedores");
		fornecedoresAction.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				Fornecedores p = new Fornecedores();
				p.show();
			}
		});
		
				
		JMenuItem ProdutosAction = new JMenuItem("Produtos");
		ProdutosAction.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CadastrarProdutos p = new CadastrarProdutos();
				p.show();
			}
		});
		
		JMenuItem SairAction = new JMenuItem("Sair");
		SairAction.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		
		
		cadastrosMenu.add(fornecedoresAction);
		cadastrosMenu.add(ProdutosAction);
		cadastrosMenu.addSeparator();
		cadastrosMenu.add(SairAction);
		
		
		
		
		
		
		
		
			
		
		 
				 
		
		Icon Adm = new ImageIcon("src/user_admin.png");
		imgLogin = new JLabel(Adm);
		imgLogin.setBounds(510, 100, 300, 270);
		add(imgLogin);
		
		 		
			       
		JLabel lblTitulo = new JLabel("MENU RÁPIDO");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTitulo.setBounds(100, 30, 233, 45);
		getContentPane().add(lblTitulo);
		
		btPrimeiro = new JButton("Realizar Venda");
		btPrimeiro.setBounds(350, 95, 175, 65);
		btPrimeiro.setIcon(new ImageIcon("src/add_to_shopping_cart.png"));
		getContentPane().add(btPrimeiro);
		
		btPrimeiro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				}
		});
		
		btSegundo = new JButton("Consultar Acervo");
		btSegundo.setBounds(150, 95, 175, 65);
		btSegundo.setIcon(new ImageIcon("src/search_database.png"));
		getContentPane().add(btSegundo);
		
		btSegundo.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btTerceiro = new JButton("Cadastrar Produto");
		btTerceiro.setBounds(150, 175, 175, 65);
		btTerceiro.setIcon(new ImageIcon("src/cadastro-produtos.png"));
		getContentPane().add(btTerceiro);
		
		btTerceiro.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CadastrarProdutos p = new CadastrarProdutos();
				p.show();
			}
		});
		
		btQuarto = new JButton("Cadastrar Cliente");
		btQuarto.setBounds(350, 175, 175, 65);
		btQuarto.setIcon(new ImageIcon("src/add_user.png"));
		getContentPane().add(btQuarto);
		
		btQuarto.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Clientes p = new Clientes();
				
				dispose();
				
				
			}
		
		});
		
		btQuinto = new JButton("Registro de Vendas");
		btQuinto.setBounds(150, 255, 175, 65);
		btQuinto.setIcon(new ImageIcon("src/chart_up.png"));
		getContentPane().add(btQuinto);
		
		btQuinto.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		btSexto = new JButton("Fazer Logoff            ");
		btSexto.setBounds(350, 255, 175, 65);
		btSexto.setIcon(new ImageIcon("src/off.png"));
		getContentPane().add(btSexto); 
		
		btSexto.addActionListener(new ActionListener () {
			@SuppressWarnings({ "deprecation", "static-access" })
			public void actionPerformed(ActionEvent e) {
				frmLogin p = new frmLogin();
				p.show();
				dispose(); 
				frame.setState(frame.ICONIFIED);
			}
		});
		
	
	}
	


	public static void main(String[] args) {
		String tema_padrao = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";  
        
        try {    
              UIManager.setLookAndFeel(tema_padrao);    
            } catch (Exception e) {    
        }  
			
		
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame = new InterfacePrincipal();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation((tela.width - frame.getSize().width) / 2,
						(tela.height - frame.getSize().height) / 2);
				frame.setVisible(true);
				
				
			}
		});
		
		
		
	}
	
	

}


