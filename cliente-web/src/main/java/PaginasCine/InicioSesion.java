package PaginasCine;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

import javax.swing.*;

import org.json.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioSesion {

	private JFrame frame;
	private JTextField usuariotxt;
	private JTextField contrtxt;

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
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INICIO DE SESI\u00D3N");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(147, 11, 174, 22);
		frame.getContentPane().add(lblNewLabel);
		
		usuariotxt = new JTextField();
		usuariotxt.setBounds(159, 173, 231, 20);
		frame.getContentPane().add(usuariotxt);
		usuariotxt.setColumns(10);
		
		contrtxt = new JTextField();
		contrtxt.setColumns(10);
		contrtxt.setBounds(159, 224, 231, 20);
		frame.getContentPane().add(contrtxt);
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funciones_get_put usr = new funciones_get_put();
				
				
				
				if(usr.inicio_sesion(usuariotxt.getText(), contrtxt.getText()) == true) {
					
					
					JSONObject jo  =  funciones_get_put.puesto (usuariotxt.getText(),contrtxt.getText());
					
					System.out.println(jo);
					if (jo.getInt("puesto_id")==1) {
						PrincipalPagina.puesto =1;
						VistaBoletos.puesto=1;
						Clientes.puesto=1;
					}else {
						PrincipalPagina.puesto =2;
						VistaBoletos.puesto=2;
						Clientes.puesto=2;
					}
					
					
					JOptionPane.showMessageDialog(null, "Ingreso de session exitoso","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
					
					frame.dispose();
					
					PrincipalPagina window2 = new PrincipalPagina();
					window2.frmCinema.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "REVISA USUARIO O CONTRASEÑA INVALIDOS","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(335, 261, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTRARSE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(216, 261, 105, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
