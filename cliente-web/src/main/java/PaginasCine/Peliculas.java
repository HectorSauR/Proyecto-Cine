package PaginasCine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ImageIcon;



public class Peliculas {

	JFrame frmCinema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas window = new Peliculas();
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
	public Peliculas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCinema = new JFrame();
		frmCinema.getContentPane().setBackground(new Color(240, 255, 240));
		frmCinema.setBackground(new Color(40, 75, 99));
		frmCinema.setTitle("Cinema - Peliculas");
		frmCinema.setBounds(100, 100, 1050, 650);
		frmCinema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn_ventas = new JButton("Ventas");
		btn_ventas.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\ventasb.png"));
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
		btn_boletos.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\boletosb.png"));
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
		panel_muestras.setBounds(37, 49, 640, 426);
		panel_general.add(panel_muestras);
		panel_muestras.setBackground(new Color(217, 217, 217));
		panel_muestras.setLayout(null);
		
		JLabel lblNombre = new JLabel("Programaci\u00F3n diaria");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(257, 11, 125, 14);
		panel_muestras.add(lblNombre);
		
		JPanel panel_peli1 = new JPanel();
		panel_peli1.setLayout(null);
		panel_peli1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1.setBounds(10, 36, 620, 85);
		panel_muestras.add(panel_peli1);
		
		JLabel lblnom_peli = new JLabel("Nombre");
		lblnom_peli.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli.setBounds(10, 11, 125, 14);
		panel_peli1.add(lblnom_peli);
		
		JLabel lblSala = new JLabel("Sala");
		lblSala.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSala.setBounds(10, 60, 125, 14);
		panel_peli1.add(lblSala);
		
		JLabel lblClasificacion = new JLabel("Clasificacion");
		lblClasificacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClasificacion.setBounds(485, 11, 125, 14);
		panel_peli1.add(lblClasificacion);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHora.setBounds(485, 60, 125, 14);
		panel_peli1.add(lblHora);
		
		JPanel panel_peli1_4_2 = new JPanel();
		panel_peli1_4_2.setLayout(null);
		panel_peli1_4_2.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4_2.setBounds(10, 132, 620, 85);
		panel_muestras.add(panel_peli1_4_2);
		
		JLabel lblnom_peli1 = new JLabel("Nombre");
		lblnom_peli1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli1.setBounds(10, 11, 125, 14);
		panel_peli1_4_2.add(lblnom_peli1);
		
		JLabel lblSala_1 = new JLabel("Sala");
		lblSala_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSala_1.setBounds(10, 60, 125, 14);
		panel_peli1_4_2.add(lblSala_1);
		
		JLabel lblClasificacion_1 = new JLabel("Clasificacion");
		lblClasificacion_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClasificacion_1.setBounds(485, 11, 125, 14);
		panel_peli1_4_2.add(lblClasificacion_1);
		
		JLabel lblHora_1 = new JLabel("Hora");
		lblHora_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHora_1.setBounds(485, 60, 125, 14);
		panel_peli1_4_2.add(lblHora_1);
		
		JPanel panel_peli1_4_2_1 = new JPanel();
		panel_peli1_4_2_1.setLayout(null);
		panel_peli1_4_2_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4_2_1.setBounds(10, 330, 620, 85);
		panel_muestras.add(panel_peli1_4_2_1);
		
		JLabel lblnom_peli3 = new JLabel("Nombre");
		lblnom_peli3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli3.setBounds(10, 11, 125, 14);
		panel_peli1_4_2_1.add(lblnom_peli3);
		
		JLabel lblSala_3 = new JLabel("Sala");
		lblSala_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSala_3.setBounds(10, 60, 125, 14);
		panel_peli1_4_2_1.add(lblSala_3);
		
		JLabel lblClasificacion_3 = new JLabel("Clasificacion");
		lblClasificacion_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClasificacion_3.setBounds(485, 11, 125, 14);
		panel_peli1_4_2_1.add(lblClasificacion_3);
		
		JLabel lblSala_5 = new JLabel("Sala");
		lblSala_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSala_5.setBounds(485, 60, 125, 14);
		panel_peli1_4_2_1.add(lblSala_5);
		
		JPanel panel_peli1_4_1_1 = new JPanel();
		panel_peli1_4_1_1.setLayout(null);
		panel_peli1_4_1_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4_1_1.setBounds(10, 234, 620, 85);
		panel_muestras.add(panel_peli1_4_1_1);
		
		JLabel lblnom_peli2 = new JLabel("Nombre");
		lblnom_peli2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli2.setBounds(10, 11, 125, 14);
		panel_peli1_4_1_1.add(lblnom_peli2);
		
		JLabel lblSala_2 = new JLabel("Sala");
		lblSala_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSala_2.setBounds(10, 60, 125, 14);
		panel_peli1_4_1_1.add(lblSala_2);
		
		JLabel lblClasificacion_2 = new JLabel("Clasificacion");
		lblClasificacion_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClasificacion_2.setBounds(485, 11, 125, 14);
		panel_peli1_4_1_1.add(lblClasificacion_2);
		
		JLabel lblSala_4 = new JLabel("Sala");
		lblSala_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSala_4.setBounds(485, 60, 125, 14);
		panel_peli1_4_1_1.add(lblSala_4);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(742, 49, 228, 426);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JLabel lblNombre_1 = new JLabel("Lista de peliculas disponibles");
		lblNombre_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre_1.setBounds(32, 11, 165, 14);
		panel_resumen.add(lblNombre_1);
		
		JPanel panel_peli1_1 = new JPanel();
		panel_peli1_1.setLayout(null);
		panel_peli1_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_1.setBounds(10, 36, 208, 379);
		panel_resumen.add(panel_peli1_1);
		
		JLabel lblnom_peli_1 = new JLabel("Dragon Ball Super: Hero");
		lblnom_peli_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli_1.setBounds(10, 11, 143, 14);
		panel_peli1_1.add(lblnom_peli_1);
		
		JLabel lblnom_peli_1_1 = new JLabel("Dragon Ball Super: Hero");
		lblnom_peli_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli_1_1.setBounds(10, 36, 143, 14);
		panel_peli1_1.add(lblnom_peli_1_1);
		
		JLabel lblnom_peli_1_2 = new JLabel("Dragon Ball Super: Hero");
		lblnom_peli_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli_1_2.setBounds(10, 61, 143, 14);
		panel_peli1_1.add(lblnom_peli_1_2);
		
		JLabel lblnom_peli_1_3 = new JLabel("Dragon Ball Super: Hero");
		lblnom_peli_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblnom_peli_1_3.setBounds(10, 86, 143, 14);
		panel_peli1_1.add(lblnom_peli_1_3);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\clienteb.png"));
		btn_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes s = new Clientes ();
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
		btn_clientes_1.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\almacenb.png"));
		btn_clientes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Almacen s = new Almacen();
				s.frmCinema.setVisible(true);
				frmCinema.setVisible(false);
			}
		});
		btn_clientes_1.setForeground(Color.WHITE);
		btn_clientes_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_1.setBorder(null);
		btn_clientes_1.setBackground(new Color(40, 75, 99));
		btn_clientes_1.setBounds(299, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_1);
		
		JButton btn_clientes_2 = new JButton("Peliculas");
		btn_clientes_2.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\peliculasb.png"));
		btn_clientes_2.setForeground(Color.WHITE);
		btn_clientes_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_2.setBorder(null);
		btn_clientes_2.setBackground(new Color(40, 75, 99));
		btn_clientes_2.setBounds(399, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_2);
		
		JButton btn_clientes_3 = new JButton("Reportes");
		btn_clientes_3.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\reporteb.png"));
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
