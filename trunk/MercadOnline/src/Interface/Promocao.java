package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Promocao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promocao frame = new Promocao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Promocao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel("home");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("Folks", Font.BOLD, 16));
		lblHome.setBounds(260, 25, 51, 20);
		contentPane.add(lblHome);
		
		JLabel lblProdutos = new JLabel("produtos");
		lblProdutos.setForeground(Color.WHITE);
		lblProdutos.setFont(new Font("Folks", Font.BOLD, 16));
		lblProdutos.setBounds(313, 25, 74, 20);
		contentPane.add(lblProdutos);
		
		JLabel lblCadastro = new JLabel("cadastro");
		lblCadastro.setForeground(Color.WHITE);
		lblCadastro.setFont(new Font("Folks", Font.BOLD, 16));
		lblCadastro.setBounds(388, 25, 68, 20);
		contentPane.add(lblCadastro);
		
		JLabel lblPromocao = new JLabel("promo\u00E7\u00E3o");
		lblPromocao.setForeground(Color.WHITE);
		lblPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		lblPromocao.setBounds(465, 25, 81, 20);
		contentPane.add(lblPromocao);
		
		JLabel lblSugeridos = new JLabel("sugeridos");
		lblSugeridos.setForeground(Color.WHITE);
		lblSugeridos.setFont(new Font("Folks", Font.BOLD, 16));
		lblSugeridos.setBounds(550, 25, 81, 20);
		contentPane.add(lblSugeridos);
		
		JLabel lblContato = new JLabel("contato");
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Folks", Font.BOLD, 16));
		lblContato.setBounds(634, 25, 70, 20);
		contentPane.add(lblContato);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblLogin.setBounds(714, 15, 34, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenhaLogin = new JLabel("Senha:");
		lblSenhaLogin.setFont(new Font("Arial", Font.BOLD, 12));
		lblSenhaLogin.setBounds(861, 14, 42, 14);
		contentPane.add(lblSenhaLogin);
		
		txtLogin = new JTextField();
		txtLogin.setName("txtLogin");
		txtLogin.setColumns(10);
		txtLogin.setBounds(755, 12, 96, 18);
		contentPane.add(txtLogin);
		
		txtSenhaLogin = new JPasswordField();
		txtSenhaLogin.setBounds(902, 11, 96, 18);
		contentPane.add(txtSenhaLogin);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEntrar.setBackground(SystemColor.menu);
		btnEntrar.setBounds(921, 39, 67, 18);
		contentPane.add(btnEntrar);
		
		JLabel lblPadaria = new JLabel("Padaria");
		lblPadaria.setFont(new Font("Calibri", Font.BOLD, 15));
		lblPadaria.setBounds(36, 85, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(205, 85, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(290, 85, 121, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(445, 85, 51, 14);
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMercearia.setBounds(535, 85, 64, 14);
		contentPane.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
		lblHigiene.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHigiene.setBounds(635, 85, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_14 = new JLabel("I");
		label_14.setForeground(new Color(255, 153, 0));
		label_14.setFont(new Font("Folks", Font.BOLD, 15));
		label_14.setBounds(95, 85, 4, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("I");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Folks", Font.BOLD, 15));
		label_15.setBounds(185, 85, 4, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("I");
		label_16.setForeground(new Color(255, 153, 0));
		label_16.setFont(new Font("Folks", Font.BOLD, 15));
		label_16.setBounds(270, 85, 4, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("I");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Folks", Font.BOLD, 15));
		label_17.setBounds(425, 85, 4, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("I");
		label_18.setForeground(new Color(255, 153, 0));
		label_18.setFont(new Font("Folks", Font.BOLD, 15));
		label_18.setBounds(515, 85, 4, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("I");
		label_19.setForeground(new Color(255, 153, 0));
		label_19.setFont(new Font("Folks", Font.BOLD, 15));
		label_19.setBounds(615, 85, 4, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("I");
		label_20.setForeground(new Color(255, 153, 0));
		label_20.setFont(new Font("Folks", Font.BOLD, 15));
		label_20.setBounds(700, 85, 4, 14);
		contentPane.add(label_20);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(115, 85, 64, 14);
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCosmeticos.setBounds(720, 85, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel lblCarrinhoCompras = new JLabel("New label");
		lblCarrinhoCompras.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		lblCarrinhoCompras.setBounds(841, 72, 157, 33);
		contentPane.add(lblCarrinhoCompras);
		
		JLabel lblPromocao_1 = new JLabel("PROMO\u00C7\u00C3O");
		lblPromocao_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblPromocao_1.setBounds(482, 140, 113, 20);
		contentPane.add(lblPromocao_1);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}
