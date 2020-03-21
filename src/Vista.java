import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Vista extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	
	private JTextField txtUsr;
	private JPasswordField txtPwd;
	private JButton btnLogin;
	private JLabel lblRespuesta;
	
	public Vista () {
		setTitle("Login MVC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setBounds(60, 74, 93, 14);
		getContentPane().add(lblUsr);
		
		JLabel lblPwd = new JLabel("Contrase\u00F1a");
		lblPwd.setBounds(60, 113, 93, 14);
		getContentPane().add(lblPwd);
		
		txtUsr = new JTextField();
		txtUsr.setBounds(163, 71, 109, 20);
		getContentPane().add(txtUsr);
		txtUsr.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(163, 111, 109, 20);
		getContentPane().add(txtPwd);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				miControlador.login();
			}
		});
		btnLogin.setBounds(163, 173, 109, 23);
		getContentPane().add(btnLogin);
		
		lblRespuesta = new JLabel("");
		lblRespuesta.setForeground(Color.RED);
		lblRespuesta.setBounds(60, 148, 212, 14);
		getContentPane().add(lblRespuesta);
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
			lblRespuesta.setText("Usuario o contraseña incorrectos");
		} else {
			System.exit(0);
		}
		
	}
}
