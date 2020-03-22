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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class Empresas extends JFrame {
	private Controlador miControlador;

	private JPanel contentPane;
	private JButton btnPerfil;
	private JButton btnNotas;
	private JButton btnCalendario;
	private JButton btnAlumnos;
	private JButton btnEmpresas;
	private JButton btnInicio;
	private ImageIcon imagenBoton;
	private Icon iconoBoton;

	public Empresas() {

		setTitle("Empresas");
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

		btnCalendario = new JButton("CALENDARIO");
		btnCalendario.setBounds(443, 11, 126, 55);
		getContentPane().add(btnCalendario);

		btnNotas = new JButton("NOTAS");
		btnNotas.setBounds(579, 11, 90, 55);
		getContentPane().add(btnNotas);
		Icon foto = new ImageIcon(getClass().getResource("/img/fotoPerfil.png"));
		btnPerfil = new JButton("");
		btnPerfil.setIcon(foto);
		btnPerfil.setBounds(900, 11, 55, 55);
		getContentPane().add(btnPerfil);
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gologin();
			}
		});
		btnCerrarSesion.setBounds(775, 11, 115, 23);
		contentPane.add(btnCerrarSesion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(68, 111, 760, 343);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
	}

	public void gologin() {
		miControlador.goLoginPantallaPrincipal();

	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
}
