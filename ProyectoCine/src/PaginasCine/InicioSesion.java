package PaginasCine;

import java.awt.EventQueue;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class InicioSesion extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion window = new InicioSesion();
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
	public InicioSesion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 245, 238));
		frame.setBounds(100, 100, 450, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIO DE SESI\u00D3N");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(147, 11, 174, 22);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(159, 173, 231, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(159, 224, 231, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		lblNewLabel_1.setBounds(24, 176, 65, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_2.setBounds(24, 227, 99, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		
		lblNewLabel_3.setBounds(95, 35, 242, 127);
		
		
		ImageIcon ico = new ImageIcon(getClass().getResource("usuario.png"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setIcon(img);
		
		JButton btnNewButton = new JButton("INGRESAR");
		btnNewButton.setBounds(335, 261, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VistaBoletos s = new VistaBoletos();
				s.frmCinema.setVisible(true);
				InicioSesion window = new InicioSesion();
				window.frame.setVisible(false);
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("REGISTRARSE");
		btnNewButton_1.setBounds(216, 261, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
	
}
