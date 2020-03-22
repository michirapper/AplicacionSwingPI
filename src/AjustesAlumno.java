import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AjustesAlumno {

	private JFrame frame;
	private JTextField textCurriculum;
	private JTextField textEmpresas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjustesAlumno window = new AjustesAlumno();
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
	public AjustesAlumno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(AjustesAlumno.class.getResource("/img/iconfinder_user-alt_285645.png")));
		lblIcono.setBounds(10, 40, 92, 57);
		frame.getContentPane().add(lblIcono);
		
		JLabel lblAjustes = new JLabel("Miguel");
		lblAjustes.setBounds(20, 98, 37, 14);
		frame.getContentPane().add(lblAjustes);
		
		textCurriculum = new JTextField();
		textCurriculum.setBounds(80, 77, 96, 20);
		frame.getContentPane().add(textCurriculum);
		textCurriculum.setColumns(10);
		
		JButton btnEnviar = new JButton("");
		btnEnviar.setIcon(new ImageIcon(AjustesAlumno.class.getResource("/img/iconfinder_icon-arrow-right-c_211621.png")));
		btnEnviar.setBounds(186, 64, 54, 41);
		frame.getContentPane().add(btnEnviar);
		
		JLabel lblEmpresas = new JLabel("Empresas favoritas");
		lblEmpresas.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmpresas.setBounds(65, 116, 178, 33);
		frame.getContentPane().add(lblEmpresas);
		
		textEmpresas = new JTextField();
		textEmpresas.setBounds(65, 149, 178, 68);
		frame.getContentPane().add(textEmpresas);
		textEmpresas.setColumns(10);
		
		JButton btnEnviar1 = new JButton("");
		btnEnviar1.setIcon(new ImageIcon(AjustesAlumno.class.getResource("/img/iconfinder_icon-arrow-right-c_211621.png")));
		btnEnviar1.setBounds(104, 217, 89, 33);
		frame.getContentPane().add(btnEnviar1);
	}
}