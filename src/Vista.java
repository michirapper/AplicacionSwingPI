import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Vista extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	
	private JTextField txtUsr;
	private JPasswordField txtPwd;
	private JButton btnLogin;
	private JLabel lblRespuesta;
	private JButton btnCancelar;
	private JLabel lblHeOlvidadoMi;
	
	public Vista () {
		setTitle("Login MVC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblUsr = new JLabel("Usuario :");
		lblUsr.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblUsr.setBounds(60, 74, 93, 14);
		getContentPane().add(lblUsr);
		
		JLabel lblPwd = new JLabel("Contrase\u00F1a");
		lblPwd.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblPwd.setBounds(60, 113, 93, 14);
		getContentPane().add(lblPwd);
		
		txtUsr = new JTextField();
		txtUsr.setBounds(176, 74, 138, 20);
		getContentPane().add(txtUsr);
		txtUsr.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(176, 113, 138, 20);
		getContentPane().add(txtPwd);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.login();
			}
		});
		btnLogin.setBounds(257, 173, 78, 23);
		getContentPane().add(btnLogin);
		
		lblRespuesta = new JLabel("");
		lblRespuesta.setForeground(Color.RED);
		lblRespuesta.setBounds(60, 148, 212, 14);
		getContentPane().add(lblRespuesta);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(50, 172, 78, 23);
		getContentPane().add(btnCancelar);
		
		lblHeOlvidadoMi = new JLabel("He olvidado mi contrase\u00F1a.");
		lblHeOlvidadoMi.setBounds(145, 144, 169, 14);
		getContentPane().add(lblHeOlvidadoMi);
	}
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public String getUsr() {
		return txtUsr.getText();
	}

	public String getPwd() {
		return String.valueOf(txtPwd.getPassword());
	}

	public void actualizar() {
		String resultado = miModelo.getResultado();
		if (resultado.equals("Correcto")) {
			miControlador.bienvenida();
		} else if (resultado.equals("Incorrecto")) {
			lblRespuesta.setText("Usuario o contraseņa incorrectos");
		} else {
			System.exit(0);
		}
		
	}
}
