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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.json.*;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Almacen {

	JFrame frmCinema;
	private JTable table;

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
		run();
	}

	
	
	public void run() {
		
		
		int numcl = table.getModel().getColumnCount();
		
		JSONArray ja = new JSONArray (funciones_get_put. unidad_med_mostrar());
		
		Object [] fila = new Object[numcl];
		
		for (int i=0; i<ja.length();i++) {
			JSONObject jo = ja.getJSONObject(i);
         fila[0]=jo.get("id");
         fila[1]=jo.get("producto");
         fila[2]=jo.get("unidadMedida");
         fila[3]=jo.get("precio");
		
         
         ((DefaultTableModel) table.getModel()).addRow(fila);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCinema = new JFrame();
		frmCinema.getContentPane().setBackground(new Color(240, 255, 240));
		frmCinema.setBackground(new Color(40, 75, 99));
		frmCinema.setTitle("Cinema - Almacen");
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
		
		JButton btn_deshabilitar = new JButton("Deshabilitar");
		btn_deshabilitar.setForeground(Color.WHITE);
		btn_deshabilitar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_deshabilitar.setBorder(null);
		btn_deshabilitar.setBackground(new Color(60, 110, 113));
		btn_deshabilitar.setBounds(744, 423, 101, 46);
		panel_general.add(btn_deshabilitar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 50, 468, 346);
		scrollPane.setBackground(new Color(217, 217, 217));
		panel_general.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID PRODUCTO", "NOMBRE", "UND. MEDIDA", " PRECIO"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(113);
		scrollPane.setViewportView(table);
		
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
