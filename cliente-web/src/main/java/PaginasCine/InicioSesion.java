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

	private JFrame frmInicioDeSesin;
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
					window.frmInicioDeSesin.setVisible(true);
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
		frmInicioDeSesin = new JFrame();
		frmInicioDeSesin.setTitle("Inicio de Sesión");
		frmInicioDeSesin.getContentPane().setBackground(new Color(255, 245, 238));
		frmInicioDeSesin.setBounds(100, 100, 509, 427);
		frmInicioDeSesin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicioDeSesin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio de Sesión");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(169, 11, 174, 22);
		frmInicioDeSesin.getContentPane().add(lblNewLabel);
		
		usuariotxt = new JTextField();
		usuariotxt.setFont(new Font("Arial", Font.PLAIN, 12));
		usuariotxt.setBounds(182, 222, 231, 20);
		frmInicioDeSesin.getContentPane().add(usuariotxt);
		usuariotxt.setColumns(10);
		
		contrtxt = new JTextField();
		contrtxt.setFont(new Font("Arial", Font.PLAIN, 12));
		contrtxt.setColumns(10);
		contrtxt.setBounds(182, 273, 231, 20);
		frmInicioDeSesin.getContentPane().add(contrtxt);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(47, 225, 65, 14);
		frmInicioDeSesin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(47, 276, 99, 14);
		frmInicioDeSesin.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_3.setBounds(173, 55, 166, 127);
		
		
		ImageIcon ico = new ImageIcon(getClass().getResource("usuario.png"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), Image.SCALE_SMOOTH));
		frmInicioDeSesin.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setIcon(img);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
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
					
					frmInicioDeSesin.dispose();
					
					PrincipalPagina window2 = new PrincipalPagina();
					window2.frmCinema.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "REVISA USUARIO O CONTRASEÑA INVALIDOS","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(356, 342, 115, 35);
		frmInicioDeSesin.getContentPane().add(btnNewButton);
	}
}
