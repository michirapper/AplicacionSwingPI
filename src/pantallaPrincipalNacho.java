import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class pantallaPrincipal extends JFrame {
	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnNotas;
	private JButton btnCalendario;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private JButton btnInicio;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;
	private JLabel btnIcono2;

	public pantallaPrincipal() {
		setTitle("Cambio contraseņa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnInicio = new JButton("INICIO");
		btnInicio.setBounds(121, 11, 90, 55);
		getContentPane().add(btnInicio);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.setBounds(221, 11, 90, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.setBounds(321, 11, 90, 55);
		getContentPane().add(btnAlumnos);

		btnCalendario = new JButton("CALENDARIO");
		btnCalendario.setBounds(421, 11, 126, 55);
		getContentPane().add(btnCalendario);

		btnNotas = new JButton("NOTAS");
		btnNotas.setBounds(557, 11, 90, 55);
		getContentPane().add(btnNotas);

		btnPerfil = new JButton("");
		btnPerfil.setBounds(900, 11, 55, 55);
		ImageIcon ico1 = new ImageIcon(getClass().getResource("perfilPequeno.png"));
		ImageIcon img1 = new ImageIcon(ico1.getImage().getScaledInstance(btnPerfil.getWidth(),btnPerfil.getHeight(),Image.SCALE_SMOOTH));
		btnPerfil.setIcon(img1);
		getContentPane().add(btnPerfil);
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Carlos");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel.setBounds(255, 111, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Juan");
		lblNewJgoodiesLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_1.setBounds(351, 112, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Antonio");
		lblNewJgoodiesLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_2.setBounds(441, 112, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_2);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("Jaime");
		lblNewJgoodiesLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_3.setBounds(351, 251, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_3);
		
		JLabel lblNewJgoodiesLabel_4 = DefaultComponentFactory.getInstance().createLabel("Alvaro");
		lblNewJgoodiesLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_4.setBounds(255, 184, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_4);
		
		JLabel lblNewJgoodiesLabel_5 = DefaultComponentFactory.getInstance().createLabel("Andres");
		lblNewJgoodiesLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_5.setBounds(441, 185, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_5);
		
		JLabel lblNewJgoodiesLabel_6 = DefaultComponentFactory.getInstance().createLabel("Miguel");
		lblNewJgoodiesLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_6.setBounds(441, 251, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_6);
		
		JLabel lblNewJgoodiesLabel_7 = DefaultComponentFactory.getInstance().createLabel("Carla");
		lblNewJgoodiesLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewJgoodiesLabel_7.setBounds(255, 251, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_7);
		
		JLabel lblNewJgoodiesLabel_8 = DefaultComponentFactory.getInstance().createLabel("Nacho");
		lblNewJgoodiesLabel_8.setBounds(351, 185, 95, 14);
		getContentPane().add(lblNewJgoodiesLabel_8);
		
		JLabel btnIcono = new JLabel("Icono");
		btnIcono.setBounds(341, 67, 48, 45);
		ImageIcon ico = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(btnIcono.getWidth(),btnIcono.getHeight(),Image.SCALE_SMOOTH));
		btnIcono.setIcon(img);
		getContentPane().add(btnIcono);
		
		JLabel btnIcono2;
		btnIcono2 = new JLabel("Icono");
		btnIcono2.setBounds(431, 53, 48, 72);
		ImageIcon ico2 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img2 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono2.setIcon(img);
		getContentPane().add(btnIcono2);
		
		JLabel btnIcono3;
		btnIcono3 = new JLabel("Icono");
		btnIcono3.setBounds(431, 126, 48, 72);
		ImageIcon ico3 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img3 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono3.setIcon(img);
		getContentPane().add(btnIcono3);
		
		JLabel btnIcono4;
		btnIcono4 = new JLabel("Icono");
		btnIcono4.setBounds(245, 126, 48, 72);
		ImageIcon ico4 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img4 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono4.setIcon(img);
		getContentPane().add(btnIcono4);
		
		JLabel btnIcono5;
		btnIcono5 = new JLabel("Icono");
		btnIcono5.setBounds(341, 182, 48, 72);
		ImageIcon ico5 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img5 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono5.setIcon(img);
		getContentPane().add(btnIcono5);
		
		JLabel btnIcono6;
		btnIcono6 = new JLabel("Icono");
		btnIcono6.setBounds(341, 126, 48, 72);
		ImageIcon ico6 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img6 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono6.setIcon(img);
		getContentPane().add(btnIcono6);
		
		JLabel btnIcono7;
		btnIcono7 = new JLabel("Icono");
		btnIcono7.setBounds(245, 193, 48, 72);
		ImageIcon ico7 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img7 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono7.setIcon(img);
		getContentPane().add(btnIcono7);
		
		JLabel btnIcono8;
		btnIcono8 = new JLabel("Icono");
		btnIcono8.setBounds(431, 184, 48, 72);
		ImageIcon ico8 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img8 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono8.setIcon(img);
		getContentPane().add(btnIcono8);
		
		JLabel btnIcono9;
		btnIcono9 = new JLabel("Icono");
		btnIcono9.setBounds(245, 53, 48, 72);
		ImageIcon ico9 = new ImageIcon(getClass().getResource("iconfinder_user-alt_285645.png"));
		ImageIcon img9 = new ImageIcon(ico.getImage().getScaledInstance(btnIcono2.getWidth(),btnIcono2.getHeight(),Image.SCALE_SMOOTH));
		btnIcono9.setIcon(img);
		getContentPane().add(btnIcono9);
		

	}
}
