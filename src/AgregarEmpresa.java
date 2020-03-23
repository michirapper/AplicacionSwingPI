import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class AgregarEmpresa {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 794, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAgregarEmpresas = new JButton("AGREGAR EMPRESAS");
		btnAgregarEmpresas.setBounds(-245, 11, 182, 55);
		frame.getContentPane().add(btnAgregarEmpresas);
		
		JButton btnPerfil = new JButton("");
		btnPerfil.setBounds(698, 33, 55, 55);
		frame.getContentPane().add(btnPerfil);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(562, 11, 115, 23);
		frame.getContentPane().add(btnCerrarSesion);
		
		JButton btnEmpresas = new JButton("EMPRESAS");
		btnEmpresas.setBounds(10, 11, 115, 55);
		frame.getContentPane().add(btnEmpresas);
		
		JButton btnAlumnos = new JButton("ALUMNOS");
		btnAlumnos.setBounds(135, 11, 112, 55);
		frame.getContentPane().add(btnAlumnos);
		
		JButton btnNotas = new JButton("NOTAS");
		btnNotas.setBounds(257, 11, 90, 55);
		frame.getContentPane().add(btnNotas);
		
		JButton btnAsegnarEmpresas = new JButton("ASIGNAR EMPRESAS");
		btnAsegnarEmpresas.setBounds(357, 11, 182, 55);
		frame.getContentPane().add(btnAsegnarEmpresas);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(45, 196, 48, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblContacto = new JLabel("Contacto");
		lblContacto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContacto.setBounds(45, 253, 66, 14);
		frame.getContentPane().add(lblContacto);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescripcion.setBounds(45, 304, 66, 14);
		frame.getContentPane().add(lblDescripcion);
		
		textField = new JTextField();
		textField.setBounds(45, 221, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 278, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 329, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLocalidad.setBounds(199, 197, 55, 14);
		frame.getContentPane().add(lblLocalidad);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 221, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(199, 254, 55, 14);
		frame.getContentPane().add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setBounds(199, 278, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(199, 329, 96, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCorreo.setBounds(199, 305, 55, 14);
		frame.getContentPane().add(lblCorreo);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(299, 391, 176, 71);
		frame.getContentPane().add(btnNewButton);
		
		textField_6 = new JTextField();
		textField_6.setBounds(319, 221, 269, 128);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Subir Imagen");
		btnNewButton_1.setBounds(357, 349, 202, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
