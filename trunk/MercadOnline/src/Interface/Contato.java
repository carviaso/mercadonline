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
import javax.swing.text.Document;

public class Contato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenhaLogin;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contato frame = new Contato();
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
	public Contato() {
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
		
		JLabel lmlPromocao = new JLabel("promo\u00E7\u00E3o");
		lmlPromocao.setForeground(Color.WHITE);
		lmlPromocao.setFont(new Font("Folks", Font.BOLD, 16));
		lmlPromocao.setBounds(465, 25, 81, 20);
		contentPane.add(lmlPromocao);
		
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
		lblPadaria.setBounds(33, 87, 53, 14);
		contentPane.add(lblPadaria);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setFont(new Font("Calibri", Font.BOLD, 15));
		lblBebidas.setBounds(202, 87, 56, 14);
		contentPane.add(lblBebidas);
		
		JLabel lblFrios = new JLabel("Frios e Congelados");
		lblFrios.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFrios.setBounds(287, 87, 121, 14);
		contentPane.add(lblFrios);
		
		JLabel lblLimpeza = new JLabel("Limpeza");
		lblLimpeza.setFont(new Font("Calibri", Font.BOLD, 15));
		lblLimpeza.setBounds(442, 87, 51, 14);
		contentPane.add(lblLimpeza);
		
		JLabel lblMercearia = new JLabel("Mercearia");
		lblMercearia.setFont(new Font("Calibri", Font.BOLD, 15));
		lblMercearia.setBounds(532, 87, 64, 14);
		contentPane.add(lblMercearia);
		
		JLabel lblHigiene = new JLabel("Higiene");
		lblHigiene.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHigiene.setBounds(632, 87, 56, 14);
		contentPane.add(lblHigiene);
		
		JLabel label_14 = new JLabel("I");
		label_14.setForeground(new Color(255, 153, 0));
		label_14.setFont(new Font("Folks", Font.BOLD, 15));
		label_14.setBounds(92, 87, 4, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("I");
		label_15.setForeground(new Color(255, 153, 0));
		label_15.setFont(new Font("Folks", Font.BOLD, 15));
		label_15.setBounds(182, 87, 4, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("I");
		label_16.setForeground(new Color(255, 153, 0));
		label_16.setFont(new Font("Folks", Font.BOLD, 15));
		label_16.setBounds(267, 87, 4, 14);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("I");
		label_17.setForeground(new Color(255, 153, 0));
		label_17.setFont(new Font("Folks", Font.BOLD, 15));
		label_17.setBounds(422, 87, 4, 14);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("I");
		label_18.setForeground(new Color(255, 153, 0));
		label_18.setFont(new Font("Folks", Font.BOLD, 15));
		label_18.setBounds(512, 87, 4, 14);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("I");
		label_19.setForeground(new Color(255, 153, 0));
		label_19.setFont(new Font("Folks", Font.BOLD, 15));
		label_19.setBounds(612, 87, 4, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("I");
		label_20.setForeground(new Color(255, 153, 0));
		label_20.setFont(new Font("Folks", Font.BOLD, 15));
		label_20.setBounds(697, 87, 4, 14);
		contentPane.add(label_20);
		
		JLabel lblHortifruti = new JLabel("Hortifruti");
		lblHortifruti.setFont(new Font("Calibri", Font.BOLD, 15));
		lblHortifruti.setBounds(112, 87, 64, 14);
		contentPane.add(lblHortifruti);
		
		JLabel lblCosmeticos = new JLabel("Cosm\u00E9ticos");
		lblCosmeticos.setFont(new Font("Calibri", Font.BOLD, 15));
		lblCosmeticos.setBounds(717, 87, 74, 14);
		contentPane.add(lblCosmeticos);
		
		JLabel label_23 = new JLabel("Carrinho");
		label_23.setForeground(new Color(255, 153, 0));
		label_23.setFont(new Font("Calibri", Font.BOLD, 15));
		label_23.setBounds(844, 82, 56, 14);
		contentPane.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\carro.png"));
		label_24.setBounds(880, 78, 56, 23);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("Compras");
		label_25.setForeground(new Color(255, 153, 0));
		label_25.setFont(new Font("Calibri", Font.BOLD, 15));
		label_25.setBounds(925, 82, 63, 14);
		contentPane.add(label_25);
		
		JLabel lblContato_1 = new JLabel("CONTATO");
		lblContato_1.setFont(new Font("AR BONNIE", Font.BOLD, 24));
		lblContato_1.setBounds(482, 140, 81, 20);
		contentPane.add(lblContato_1);
		
		JLabel lblDadosPessoais = new JLabel("Dados Pessoais: ");
		lblDadosPessoais.setForeground(new Color(255, 153, 0));
		lblDadosPessoais.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDadosPessoais.setBounds(243, 196, 121, 14);
		contentPane.add(lblDadosPessoais);
		
		JLabel lblTelefone = new JLabel("Telefone*:");
		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblTelefone.setBounds(242, 310, 68, 14);
		contentPane.add(lblTelefone);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(332, 308, 114, 20);
		contentPane.add(textField_1);
		
		JLabel label_26 = new JLabel("Nome*:");
		label_26.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_26.setBounds(242, 228, 56, 14);
		contentPane.add(label_26);
		
		textField_2 = new JTextField((Document) null, (String) null, 0);
		textField_2.setName("txtNome");
		textField_2.setColumns(10);
		textField_2.setBounds(332, 226, 426, 20);
		contentPane.add(textField_2);
		
		JLabel label_28 = new JLabel("E-mail*:");
		label_28.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_28.setBounds(242, 269, 56, 14);
		contentPane.add(label_28);
		
		textField_3 = new JTextField();
		textField_3.setName("txtEmail");
		textField_3.setColumns(10);
		textField_3.setBounds(332, 267, 426, 20);
		contentPane.add(textField_3);
		
		JLabel lblAssunto = new JLabel("Assunto*:");
		lblAssunto.setForeground(new Color(255, 153, 0));
		lblAssunto.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblAssunto.setBounds(242, 358, 74, 14);
		contentPane.add(lblAssunto);
		
		textField_4 = new JTextField();
		textField_4.setBounds(242, 376, 514, 23);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblResposta = new JLabel("Resposta*:");
		lblResposta.setForeground(new Color(255, 153, 0));
		lblResposta.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblResposta.setBounds(242, 409, 74, 14);
		contentPane.add(lblResposta);
		
		textField_5 = new JTextField();
		textField_5.setBounds(242, 448, 514, 180);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(503, 660, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblBackGround = new JLabel("");
		lblBackGround.setIcon(new ImageIcon("C:\\EclipseProjects\\MercadOnline\\imagem\\BackGround.png"));
		lblBackGround.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblBackGround.setBounds(0, 0, 1024, 768);
		contentPane.add(lblBackGround);
	}
}