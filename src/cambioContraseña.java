import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class cambioContraseņa extends JFrame {
	private JTextField txtUsuario;
	private JTextField txtNuevaContrasena;
	private JTextField txtConfirmarContrasena;
	private JButton btnGuardar;
	private JButton btnCancelar;
	public cambioContraseņa() {
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblUsuario.setBounds(35, 35, 70, 14);
		getContentPane().add(lblUsuario);
		
		JLabel lblNuevaContrasea = new JLabel("Nueva contrase\u00F1a:");
		lblNuevaContrasea.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblNuevaContrasea.setBounds(35, 77, 137, 14);
		getContentPane().add(lblNuevaContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmarContrasea.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblConfirmarContrasea.setBounds(35, 117, 158, 14);
		getContentPane().add(lblConfirmarContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(202, 35, 167, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtNuevaContrasena = new JTextField();
		txtNuevaContrasena.setColumns(10);
		txtNuevaContrasena.setBounds(202, 77, 167, 20);
		getContentPane().add(txtNuevaContrasena);
		
		txtConfirmarContrasena = new JTextField();
		txtConfirmarContrasena.setColumns(10);
		txtConfirmarContrasena.setBounds(203, 117, 167, 20);
		getContentPane().add(txtConfirmarContrasena);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(335, 227, 89, 23);
		getContentPane().add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(35, 227, 89, 23);
		getContentPane().add(btnCancelar);
		
	}
}

