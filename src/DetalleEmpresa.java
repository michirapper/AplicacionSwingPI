import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class DetalleEmpresa {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetalleEmpresa window = new DetalleEmpresa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DetalleEmpresa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("/img/oracle-226044.png")));
		lblNewLabel.setBounds(246, 69, 268, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane txtpnOracleCorporationEs = new JTextPane();
		txtpnOracleCorporationEs.setText("Oracle Corporation es una compa\u00F1\u00EDa especializada en el desarrollo de soluciones de nube y locales. Oracle tiene su sede en la localidad californiana de Redwood City, Estados Unidos. Seg\u00FAn la clasificaci\u00F3n correspondiente al a\u00F1o 2006, ocupa el primer lugar en la categor\u00EDa de las bases de datos y el s\u00E9ptimo lugar a nivel mundial de las compa\u00F1\u00EDas de tecnolog\u00EDas de la informaci\u00F3n.6\u200B La tecnolog\u00EDa Oracle se encuentra pr\u00E1cticamente en muchas industrias del mundo y en las oficinas de 98 de las 100 empresas Fortune 100.");
		txtpnOracleCorporationEs.setBounds(72, 124, 413, 104);
		frame.getContentPane().add(txtpnOracleCorporationEs);
		
		JButton btnAgregarEmpresa = new JButton("AGREGAR EMPRESA");
		btnAgregarEmpresa.setBounds(10, 11, 151, 55);
		frame.getContentPane().add(btnAgregarEmpresa);
		
		JButton btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.setBounds(177, 11, 115, 55);
		frame.getContentPane().add(btnEmpresas);
		
		JButton btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.setBounds(302, 11, 112, 55);
		frame.getContentPane().add(btnAlumnos);
		
		JButton btnNotas = new JButton("NOTAS");
		btnNotas.setBounds(424, 11, 90, 55);
		frame.getContentPane().add(btnNotas);
		
		JButton btnAsegnarEmpresas = new JButton("ASIGNAR EMPRESAS");
		btnAsegnarEmpresas.setBounds(524, 11, 182, 55);
		frame.getContentPane().add(btnAsegnarEmpresas);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(756, 11, 115, 23);
		frame.getContentPane().add(btnCerrarSesion);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("/img/Captura.PNG")));
		lblNewLabel_1.setBounds(569, 124, 182, 185);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DetalleEmpresa.class.getResource("/img/Captura1.PNG")));
		lblNewLabel_2.setBounds(82, 234, 394, 283);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
