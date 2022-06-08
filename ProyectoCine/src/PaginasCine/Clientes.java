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



public class Clientes extends JFrame{

	public JFrame frmCinema;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes window = new Clientes();
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
	public Clientes() {
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
		
		JLabel lblNewLabel = new JLabel("Datos del Cliente");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(112, 28, 129, 14);
		panel_muestras.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(112, 81, 129, 14);
		panel_muestras.add(lblNombre);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de tarjeta");
		lblNumeroDeTarjeta.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumeroDeTarjeta.setBounds(112, 122, 129, 14);
		panel_muestras.add(lblNumeroDeTarjeta);
		
		JLabel lblFechaDeCumpleaos = new JLabel("Fecha de Cumplea\u00F1os");
		lblFechaDeCumpleaos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaDeCumpleaos.setBounds(112, 169, 129, 14);
		panel_muestras.add(lblFechaDeCumpleaos);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(112, 225, 129, 14);
		panel_muestras.add(lblTelefono);
		
		JLabel lblPuntos = new JLabel("Puntos");
		lblPuntos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPuntos.setBounds(112, 281, 129, 14);
		panel_muestras.add(lblPuntos);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 49, 364, 426);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JPanel panel_peli1_4 = new JPanel();
		panel_peli1_4.setLayout(null);
		panel_peli1_4.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4.setBounds(10, 289, 344, 68);
		panel_resumen.add(panel_peli1_4);
		
		JLabel lbl_pelicula_4 = new JLabel("Frase Promocional");
		lbl_pelicula_4.setBounds(10, 11, 122, 20);
		panel_peli1_4.add(lbl_pelicula_4);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre_1.setBounds(33, 32, 129, 14);
		panel_resumen.add(lblNombre_1);
		
		JLabel lblTelefono_1 = new JLabel("Telefono:");
		lblTelefono_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono_1.setBounds(33, 191, 129, 14);
		panel_resumen.add(lblTelefono_1);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaDeNacimiento.setBounds(33, 242, 129, 14);
		panel_resumen.add(lblFechaDeNacimiento);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoPaterno.setBounds(33, 85, 129, 14);
		panel_resumen.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoMaterno.setBounds(33, 140, 129, 14);
		panel_resumen.add(lblApellidoMaterno);
		
		textField = new JTextField();
		textField.setBounds(172, 29, 182, 20);
		panel_resumen.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 82, 182, 20);
		panel_resumen.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 137, 182, 20);
		panel_resumen.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(172, 188, 182, 20);
		panel_resumen.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(172, 239, 182, 20);
		panel_resumen.add(textField_4);
		
		JButton btn_confirmar = new JButton("Registrar");
		btn_confirmar.setBounds(266, 376, 88, 39);
		panel_resumen.add(btn_confirmar);
		btn_confirmar.setForeground(Color.WHITE);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
		JButton btn_clientes_1 = new JButton("Almacen");
		btn_clientes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Almacen s = new Almacen ();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_clientes_1.setForeground(Color.WHITE);
		btn_clientes_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_1.setBorder(null);
		btn_clientes_1.setBackground(new Color(40, 75, 99));
		btn_clientes_1.setBounds(293, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_1);
		
		JButton btn_clientes_2 = new JButton("Peliculas");
		btn_clientes_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Peliculas s = new Peliculas ();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_clientes_2.setForeground(Color.WHITE);
		btn_clientes_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_2.setBorder(null);
		btn_clientes_2.setBackground(new Color(40, 75, 99));
		btn_clientes_2.setBounds(393, 0, 100, 38);
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
		btn_clientes_3.setBounds(493, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_3);
		
	}
}
