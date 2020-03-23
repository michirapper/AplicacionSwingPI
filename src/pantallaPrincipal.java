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
import java.awt.Font;
import javax.swing.SwingConstants;

public class pantallaPrincipal extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;

	public pantallaPrincipal() {

		setTitle("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goEmpresas();
			}
		});
		btnEmpresas.setBounds(167, 11, 115, 55);
		getContentPane().add(btnEmpresas);

		btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.setBounds(550, 11, 112, 55);
		getContentPane().add(btnAlumnos);
		Icon foto = new ImageIcon(getClass().getResource("/img/fotoPerfil.png"));
		btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goPerfil();
			}
		});
		btnPerfil.setIcon(foto);
		btnPerfil.setBounds(900, 11, 55, 55);
		getContentPane().add(btnPerfil);

		JLabel lblUsuario_1 = new JLabel("Miguel");
		lblUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_1.setBounds(228, 172, 90, 19);
		contentPane.add(lblUsuario_1);

		JButton btnUsuario_1 = new JButton("");
		btnUsuario_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goAjustesAlumno();

			}
		});
		btnUsuario_1.setBounds(244, 106, 55, 55);
		btnUsuario_1.setIcon(foto);
		contentPane.add(btnUsuario_1);

		JButton btnUsuario_2 = new JButton("");
		btnUsuario_2.setBounds(396, 106, 55, 55);
		btnUsuario_2.setIcon(foto);
		contentPane.add(btnUsuario_2);

		JButton btnUsuario_3 = new JButton("");
		btnUsuario_3.setBounds(557, 106, 55, 55);
		btnUsuario_3.setIcon(foto);
		contentPane.add(btnUsuario_3);

		JButton btnUsuario_6 = new JButton("");
		btnUsuario_6.setBounds(557, 210, 55, 55);
		btnUsuario_6.setIcon(foto);
		contentPane.add(btnUsuario_6);

		JButton btnUsuario_5 = new JButton("");
		btnUsuario_5.setBounds(396, 210, 55, 55);
		btnUsuario_5.setIcon(foto);
		contentPane.add(btnUsuario_5);

		JButton btnUsuario_4 = new JButton("");
		btnUsuario_4.setBounds(244, 210, 55, 55);
		btnUsuario_4.setIcon(foto);
		contentPane.add(btnUsuario_4);

		JButton btnUsuario_7 = new JButton("");
		btnUsuario_7.setBounds(244, 335, 55, 55);
		btnUsuario_7.setIcon(foto);
		contentPane.add(btnUsuario_7);

		JButton btnUsuario_8 = new JButton("");
		btnUsuario_8.setBounds(396, 335, 55, 55);
		btnUsuario_8.setIcon(foto);
		contentPane.add(btnUsuario_8);

		JButton btnUsuario_9 = new JButton("");
		btnUsuario_9.setBounds(557, 335, 55, 55);
		btnUsuario_9.setIcon(foto);
		contentPane.add(btnUsuario_9);

		JLabel lblUsuario_2 = new JLabel("Carlos");
		lblUsuario_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_2.setBounds(380, 176, 90, 19);
		contentPane.add(lblUsuario_2);

		JLabel lblUsuario_3 = new JLabel("Juan");
		lblUsuario_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_3.setBounds(540, 176, 90, 19);
		contentPane.add(lblUsuario_3);

		JLabel lblUsuario_6 = new JLabel("Andres");
		lblUsuario_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_6.setBounds(540, 280, 90, 19);
		contentPane.add(lblUsuario_6);

		JLabel lblUsuario_5 = new JLabel("Nacho");
		lblUsuario_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_5.setBounds(380, 276, 90, 19);
		contentPane.add(lblUsuario_5);

		JLabel lblUsuario_4 = new JLabel("Alvaro");
		lblUsuario_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_4.setBounds(221, 276, 90, 19);
		contentPane.add(lblUsuario_4);

		JLabel lblUsuario_7 = new JLabel("Carla");
		lblUsuario_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_7.setBounds(221, 405, 90, 19);
		contentPane.add(lblUsuario_7);

		JLabel lblUsuario_8 = new JLabel("Jaime");
		lblUsuario_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_8.setBounds(380, 405, 90, 19);
		contentPane.add(lblUsuario_8);

		JLabel lblUsuario_9 = new JLabel("Antonio");
		lblUsuario_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuario_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario_9.setBounds(540, 401, 90, 19);
		contentPane.add(lblUsuario_9);
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gologin();
			}
		});
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
	}

	protected void goAjustesAlumno() {
		miControlador.goAjustesAlumnoPantallaPrincipal();
		
	}

	public void goPerfil() {
		miControlador.goPerfilPantallaPrincipal();
	}

	public void goEmpresas() {
		miControlador.goEmpresasPantallaPrincipal();

	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public void gologin() {
		miControlador.goLoginPantallaPrincipal();

	}

}
