import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class empresas extends JFrame {
	public empresas() {
getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("INICIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 90, 55);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EMPRESAS");
		btnNewButton_1.setBounds(90, 0, 90, 55);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ALUMNOS");
		btnNewButton_2.setBounds(180, 0, 90, 55);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CALENDARIO");
		btnNewButton_3.setBounds(270, 0, 90, 55);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("NOTAS");
		btnNewButton_4.setBounds(360, 0, 90, 55);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\distr\\git\\uf5-2-tarea-2-aplicacion-swing-pi-lauulu\\IMG\\PERFIL_PEQUE\u00D1O.png"));
		btnNewButton_5.setBounds(450, 0, 55, 55);
		getContentPane().add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 66, 382, 184);
		getContentPane().add(scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
	}
}
