package PaginasCine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Almacen {

	public JFrame frmCinema;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Almacen window = new Almacen();
					window.frmCinema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 Vista de los boletos
	 */

	/**
	 * Create the application.
	 */
	public Almacen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCinema = new JFrame();
		frmCinema.getContentPane().setBackground(new Color(240, 255, 240));
		frmCinema.setBackground(new Color(40, 75, 99));
		frmCinema.setTitle("Cinema");
		frmCinema.setBounds(100, 100, 1050, 650);
		frmCinema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn_ventas = new JButton("Ventas");
		btn_ventas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrincipalPagina s = new PrincipalPagina ();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_ventas.setBounds(100, 0, 100, 38);
		btn_ventas.setBorder(null);
		btn_ventas.setForeground(Color.white);
		btn_ventas.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_ventas.setBackground(new Color(40, 75, 99));
		
		JButton btn_boletos = new JButton("Boletos");
		btn_boletos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VistaBoletos s = new VistaBoletos ();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_boletos.setBounds(0, 0, 100, 38);
		btn_boletos.setBorder(null);
		btn_boletos.setForeground(Color.white);
		btn_boletos.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_boletos.setBackground(new Color(40, 75, 99));
		frmCinema.getContentPane().setLayout(null);
		frmCinema.getContentPane().add(btn_ventas);
		frmCinema.getContentPane().add(btn_boletos);
		
		JPanel panel_general = new JPanel();
		panel_general.setBounds(0, 38, 1034, 573);
		panel_general.setBorder(null);
		panel_general.setBackground(new Color(40, 75, 99));
		frmCinema.getContentPane().add(panel_general);
		panel_general.setLayout(null);
		
		JPanel panel_muestras = new JPanel();
		panel_muestras.setBounds(37, 49, 364, 426);
		panel_general.add(panel_muestras);
		panel_muestras.setBackground(new Color(217, 217, 217));
		panel_muestras.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(241, 11, 57, 14);
		panel_muestras.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(62, 11, 57, 14);
		panel_muestras.add(lblNombre);
		
		JPanel panel_peli1_4_1 = new JPanel();
		panel_peli1_4_1.setLayout(null);
		panel_peli1_4_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4_1.setBounds(10, 36, 165, 379);
		panel_muestras.add(panel_peli1_4_1);
		
		JPanel panel_peli1_4_2 = new JPanel();
		panel_peli1_4_2.setLayout(null);
		panel_peli1_4_2.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4_2.setBounds(189, 36, 165, 379);
		panel_muestras.add(panel_peli1_4_2);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 49, 364, 185);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre_1.setBounds(33, 32, 129, 14);
		panel_resumen.add(lblNombre_1);
		
		JLabel lblApellidoPaterno = new JLabel("Cantidad");
		lblApellidoPaterno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoPaterno.setBounds(33, 85, 129, 14);
		panel_resumen.add(lblApellidoPaterno);
		
		textField = new JTextField();
		textField.setBounds(172, 29, 182, 20);
		panel_resumen.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 82, 182, 20);
		panel_resumen.add(textField_1);
		
		JButton btn_confirmar = new JButton("Registrar");
		btn_confirmar.setBounds(266, 129, 88, 39);
		panel_resumen.add(btn_confirmar);
		btn_confirmar.setForeground(Color.WHITE);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		
		JButton btn_deshabilitar = new JButton("Deshabilitar");
		btn_deshabilitar.setForeground(Color.WHITE);
		btn_deshabilitar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_deshabilitar.setBorder(null);
		btn_deshabilitar.setBackground(new Color(60, 110, 113));
		btn_deshabilitar.setBounds(869, 429, 101, 46);
		panel_general.add(btn_deshabilitar);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes s = new Clientes();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
		JButton btn_clientes_1 = new JButton("Almacen");
		btn_clientes_1.setForeground(Color.WHITE);
		btn_clientes_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_1.setBorder(null);
		btn_clientes_1.setBackground(new Color(40, 75, 99));
		btn_clientes_1.setBounds(299, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_1);
		
		JButton btn_clientes_2 = new JButton("Peliculas");
		btn_clientes_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Peliculas s = new  Peliculas();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_clientes_2.setForeground(Color.WHITE);
		btn_clientes_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_2.setBorder(null);
		btn_clientes_2.setBackground(new Color(40, 75, 99));
		btn_clientes_2.setBounds(399, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_2);
		
		JButton btn_clientes_3 = new JButton("Reportes");
		btn_clientes_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reportes s = new Reportes ();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_clientes_3.setForeground(Color.WHITE);
		btn_clientes_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_3.setBorder(null);
		btn_clientes_3.setBackground(new Color(40, 75, 99));
		btn_clientes_3.setBounds(499, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_3);
		
	}
}
