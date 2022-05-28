package PaginasCine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;


public class VistaBoletos {

	private JFrame frmCinema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaBoletos window = new VistaBoletos();
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
	public VistaBoletos() {
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
		btn_ventas.setBounds(100, 0, 100, 38);
		btn_ventas.setBorder(null);
		btn_ventas.setForeground(Color.white);
		btn_ventas.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_ventas.setBackground(new Color(40, 75, 99));
		
		JButton btn_boletos = new JButton("Boletos");
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
		
		JPanel panel_peli1 = new JPanel();
		panel_peli1.setBounds(10, 11, 344, 92);
		panel_peli1.setBackground(new Color(180, 180, 180));
		panel_muestras.add(panel_peli1);
		panel_peli1.setLayout(null);
		
		JLabel lbl_pelicula = new JLabel("Spiderman");
		lbl_pelicula.setBounds(92, 11, 80, 20);
		panel_peli1.add(lbl_pelicula);
		
		JLabel lbl_idioma = new JLabel("Idioma");
		lbl_idioma.setBounds(92, 32, 46, 14);
		panel_peli1.add(lbl_idioma);
		
		JLabel lbl_sala = new JLabel("Sala");
		lbl_sala.setBounds(92, 51, 46, 14);
		panel_peli1.add(lbl_sala);
		
		JLabel lbl_horario = new JLabel("Horario");
		lbl_horario.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario.setBounds(92, 67, 46, 14);
		panel_peli1.add(lbl_horario);
		
		JLabel lbl_clasifi = new JLabel("Clasificacion");
		lbl_clasifi.setBounds(239, 14, 80, 14);
		panel_peli1.add(lbl_clasifi);
		
		JPanel panel_peli1_1 = new JPanel();
		panel_peli1_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_1.setBounds(10, 114, 344, 92);
		panel_muestras.add(panel_peli1_1);
		panel_peli1_1.setLayout(null);
		
		JLabel lbl_pelicula_1 = new JLabel("Spiderman");
		lbl_pelicula_1.setBounds(95, 11, 85, 20);
		panel_peli1_1.add(lbl_pelicula_1);
		
		JLabel lbl_idioma_1 = new JLabel("Idioma");
		lbl_idioma_1.setBounds(95, 30, 46, 14);
		panel_peli1_1.add(lbl_idioma_1);
		
		JLabel lbl_sala_1 = new JLabel("Sala");
		lbl_sala_1.setBounds(95, 42, 46, 14);
		panel_peli1_1.add(lbl_sala_1);
		
		JLabel lbl_horario_1 = new JLabel("Horario");
		lbl_horario_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_1.setBounds(95, 55, 46, 14);
		panel_peli1_1.add(lbl_horario_1);
		
		JLabel lbl_clasifi_1 = new JLabel("Clasificacion");
		lbl_clasifi_1.setBounds(239, 14, 80, 14);
		panel_peli1_1.add(lbl_clasifi_1);
		
		JPanel panel_peli1_2 = new JPanel();
		panel_peli1_2.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_2.setBounds(10, 217, 344, 92);
		panel_muestras.add(panel_peli1_2);
		panel_peli1_2.setLayout(null);
		
		JLabel lbl_pelicula_2 = new JLabel("Spiderman");
		lbl_pelicula_2.setBounds(101, 11, 89, 20);
		panel_peli1_2.add(lbl_pelicula_2);
		
		JLabel lbl_idioma_2 = new JLabel("Idioma");
		lbl_idioma_2.setBounds(101, 31, 46, 14);
		panel_peli1_2.add(lbl_idioma_2);
		
		JLabel lbl_sala_2 = new JLabel("Sala");
		lbl_sala_2.setBounds(101, 49, 46, 14);
		panel_peli1_2.add(lbl_sala_2);
		
		JLabel lbl_horario_2 = new JLabel("Horario");
		lbl_horario_2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_2.setBounds(101, 67, 46, 14);
		panel_peli1_2.add(lbl_horario_2);
		
		JLabel lbl_clasifi_2 = new JLabel("Clasificacion");
		lbl_clasifi_2.setBounds(242, 14, 80, 14);
		panel_peli1_2.add(lbl_clasifi_2);
		
		JPanel panel_peli1_3 = new JPanel();
		panel_peli1_3.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_3.setBounds(10, 320, 344, 92);
		panel_muestras.add(panel_peli1_3);
		panel_peli1_3.setLayout(null);
		
		JLabel lbl_pelicula_3 = new JLabel("Spiderman");
		lbl_pelicula_3.setBounds(105, 11, 80, 20);
		panel_peli1_3.add(lbl_pelicula_3);
		
		JLabel lbl_idioma_3 = new JLabel("Idioma");
		lbl_idioma_3.setBounds(105, 30, 46, 14);
		panel_peli1_3.add(lbl_idioma_3);
		
		JLabel lbl_sala_3 = new JLabel("Sala");
		lbl_sala_3.setBounds(105, 51, 46, 14);
		panel_peli1_3.add(lbl_sala_3);
		
		JLabel lbl_horario_3 = new JLabel("Horario");
		lbl_horario_3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_3.setBounds(105, 67, 46, 14);
		panel_peli1_3.add(lbl_horario_3);
		
		JLabel lbl_clasifi_3 = new JLabel("Clasificacion");
		lbl_clasifi_3.setBounds(243, 14, 80, 14);
		panel_peli1_3.add(lbl_clasifi_3);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 49, 364, 426);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JLabel lbl_total = new JLabel("Total: $");
		lbl_total.setBounds(238, 410, 59, 14);
		lbl_total.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_resumen.add(lbl_total);
		
		JPanel panel_peli1_4 = new JPanel();
		panel_peli1_4.setLayout(null);
		panel_peli1_4.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4.setBounds(10, 11, 344, 92);
		panel_resumen.add(panel_peli1_4);
		
		JLabel lbl_pelicula_4 = new JLabel("Spiderman");
		lbl_pelicula_4.setBounds(92, 11, 82, 20);
		panel_peli1_4.add(lbl_pelicula_4);
		
		JLabel lbl_cantidad = new JLabel("Cantidad");
		lbl_cantidad.setBounds(92, 32, 71, 14);
		panel_peli1_4.add(lbl_cantidad);
		
		JLabel lbl_asientos = new JLabel("Asientos");
		lbl_asientos.setBounds(92, 51, 82, 14);
		panel_peli1_4.add(lbl_asientos);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
	}
}
