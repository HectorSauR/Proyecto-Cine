package PaginasCine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JTextField;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.JComboBox;




public class Reportes {

	JFrame frmCinema;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reportes window = new Reportes();
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
	public Reportes() {
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
		
		JLabel lblReportes = new JLabel("Reportes:");
		lblReportes.setForeground(Color.WHITE);
		lblReportes.setFont(new Font("Arial", Font.PLAIN, 12));
		lblReportes.setBounds(413, 191, 57, 14);
		panel_general.add(lblReportes);
		
		final JComboBox comboBox = new JComboBox();
		
		comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox.setMaximumRowCount(3);
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Reporte Clientes","Reporte Productos Mayor Ganancia" ,"Ultimo Ticket Venta Producto", "Ultimo Ticket Venta Boleto" }));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(480, 187, 189, 22);
		panel_general.add(comboBox);
		
		JButton btn_buscar = new JButton("Buscar");
		btn_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int seleccionado = comboBox.getSelectedIndex();
				
				switch(seleccionado) {
					case 1:{
						generaReporte("reporteClientes");
						break;
					}
					case 2:{
						generaReporte("reporteVentasProductos");
						break;
					}
					case 3:{
						generaReporte("ticketVentaProducto");
						break;
					}
					case 4:{
						generaReporte("ticketVentaBoleto");
						break;
					}
				}
				
			}
		});
		btn_buscar.setForeground(Color.WHITE);
		btn_buscar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_buscar.setBorder(null);
		btn_buscar.setBackground(new Color(60, 110, 113));
		btn_buscar.setBounds(473, 283, 101, 46);
		panel_general.add(btn_buscar);
		
		JButton btn_clientes = new JButton("Clientes");
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
		btn_clientes_1.setBounds(299, 0, 100, 38);
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
		btn_clientes_2.setBounds(399, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_2);
		
		JButton btn_clientes_3 = new JButton("Reportes");
		btn_clientes_3.setForeground(Color.WHITE);
		btn_clientes_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes_3.setBorder(null);
		btn_clientes_3.setBackground(new Color(40, 75, 99));
		btn_clientes_3.setBounds(499, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes_3);
		
	}
	
	
	public void generaReporte(String nombre) {

		Connection con;
		JasperReport reporte;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://26.77.197.154:3306/db_cine","ado3","123");
			
			reporte = JasperCompileManager.compileReport("src/main/java/reportes/"+nombre+".jrxml");
			JasperPrint print = JasperFillManager.fillReport(reporte,null,con);
			JasperViewer visualiza = new JasperViewer(print,false);
			visualiza.setVisible(true);
			
		}catch(Exception e1) {
			System.out.println(e1.toString());
		}
		
	}
}
