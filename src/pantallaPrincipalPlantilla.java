import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class pantallaPrincipalPlantilla extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnNotas;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private JButton btnInicio;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;

	public pantallaPrincipalPlantilla() {
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
	}
}
