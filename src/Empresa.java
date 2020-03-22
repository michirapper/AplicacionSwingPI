import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Empresa extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnNotas;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private JButton btnInicio;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	public Empresa() {
		setTitle("Cambio contraseña");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnInicio = new JButton("INICIO");
		btnInicio.setBounds(96, 11, 90, 55);
		getContentPane().add(btnInicio);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.setBounds(196, 11, 115, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.setBounds(321, 11, 112, 55);
		getContentPane().add(btnAlumnos);

		btnNotas = new JButton("NOTAS");
		btnNotas.setBounds(443, 11, 90, 55);
		getContentPane().add(btnNotas);

		btnPerfil = new JButton("");
		btnPerfil.setIcon(new ImageIcon(getClass().getResource("/img/fotoPerfil.png")));
		btnPerfil.setBounds(900, 11, 55, 55);
		getContentPane().add(btnPerfil);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Empresa.class.getResource("/img/oracle-logo.png")));
		lblNewLabel.setBounds(29, 77, 646, 209);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Empresa.class.getResource("/img/Deloitte.jpg")));
		lblNewLabel_1.setBounds(29, 297, 744, 229);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnOracleCorporationEs = new JTextPane();
		txtpnOracleCorporationEs.setText("Oracle Corporation \r\nCo-Founder & CTO\r\nOracle Corporation es una compa\u00F1\u00EDa especializada en el desarrollo de soluciones de nube y locales.\r\n\r\n");
		txtpnOracleCorporationEs.setBounds(685, 77, 270, 104);
		contentPane.add(txtpnOracleCorporationEs);
		
		JTextPane txtpnDeloitteToucheCofounder = new JTextPane();
		txtpnDeloitteToucheCofounder.setText("Deloitte Touche \r\nCo-Founder & CTO\r\nDeloitte Touche es la firma privada n\u00FAmero uno de servicios profesionales del mundo, por volumen de facturaci\u00F3n,  la m\u00E1s importante y prestigiosa del mundo y tambi\u00E9n una de las llamadas Cuatro Grandes Auditoras, junto a PricewaterhouseCoopers, Ernst & Young, y KPMG.\r\n");
		txtpnDeloitteToucheCofounder.setBounds(783, 297, 172, 174);
		contentPane.add(txtpnDeloitteToucheCofounder);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_Instagram_381384.png")));
		btnNewButton.setBounds(685, 185, 90, 73);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_twitter_square_107066.png")));
		btnNewButton_1.setBounds(783, 185, 90, 73);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(Empresa.class.getResource("/img/iconfinder_square-facebook_317727.png")));
		btnNewButton_1_1.setBounds(875, 185, 90, 73);
		contentPane.add(btnNewButton_1_1);
	}
}