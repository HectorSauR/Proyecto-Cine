package PaginasCine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.SwingConstants;

import org.json.JSONArray;
import org.json.JSONObject;

import clases.CVentaBoletos;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JCheckBox;
import javax.swing.JTextField;


public class VistaBoletos extends JFrame{

	public JFrame frmCinema;
	JLabel lbl_cantidad;
	JLabel lbl_asientos;
	private JTextField txt_id_c;
	JLabel lbl_id_c;
	JPanel panel_peli_r;
	JPanel panel_peli_r_1;
	JPanel panel_peli_r_2;
	JPanel panel_peli_r_3;
	
	
	JLabel lblpelicula_r;
	JLabel lblpelicula_r_1;
	JLabel lblpelicula_r_2;
	JLabel lblpelicula_r_3;
	
	
	JLabel lbl_pelicula_4;
	JLabel lbl_pelicula_1;
	JLabel lbl_pelicula_2;
	JLabel lbl_pelicula_3;
	
	
	JLabel lbl_cantidad_1;
	JLabel lbl_asientos_1;
	JLabel lbl_cantidad_2;
	JLabel lbl_asientos_2;
	JLabel lbl_cantidad_3;
	JLabel lbl_asientos_3;
	JButton btn_b_c;
	
	JButton btn_clientes_1;
	JButton btn_clientes_2;
	JButton btn_clientes_3;
	
	static int puesto;
	
	
	
	JSONObject jog =  new JSONObject();
	boolean clientee  = false;
	
	int pelicula;
float total;
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
		run();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void run() {
		
		if(puesto==1) {
			btn_clientes_1.setVisible(true);
			btn_clientes_2.setVisible(true);
			btn_clientes_3.setVisible(true);
		}else {
			btn_clientes_1.setVisible(false);
			btn_clientes_2.setVisible(false);
			btn_clientes_3.setVisible(false);
		}
		
		panel_peli_r.setVisible(false);
		panel_peli_r_1.setVisible(false);
		panel_peli_r_2.setVisible(false);
		panel_peli_r_3.setVisible(false);
		txt_id_c.setVisible(false);
		 lbl_id_c.setVisible(false);
		 btn_b_c.setVisible(false);
	}
	
	private void initialize() {
		
		
		
		final VistaBoletos vb = this;
		frmCinema = new JFrame();
		frmCinema.getContentPane().setBackground(new Color(240, 255, 240));
		frmCinema.setBackground(new Color(40, 75, 99));
		frmCinema.setTitle("Cinema - Boletos");
		frmCinema.setBounds(100, 100, 1050, 650);
		frmCinema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ir al frame de ventas
		JButton btn_ventas = new JButton("Ventas");
		btn_ventas.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\ventasb.png"));
		btn_ventas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrincipalPagina s = new PrincipalPagina();
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
		panel_peli1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EscogerAsiento asiento = new EscogerAsiento(vb,2);
				frmCinema.setVisible(false);
				asiento.npa = 2;
				asiento.frame.setVisible(true);
				
				panel_peli_r_1.setVisible(true);
				lblpelicula_r_1.setText(lbl_pelicula_1.getText());
				pelicula =2;
				//total = 80 * Integer.parseInt( lbl_cantidad_1.getText());
				
			}
		});
		panel_peli1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1.setBounds(10, 114, 344, 92);
		panel_muestras.add(panel_peli1);
		panel_peli1.setLayout(null);
		
		lbl_pelicula_1 = new JLabel("Jurassic World");
		lbl_pelicula_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_1.setBounds(95, 11, 110, 20);
		panel_peli1.add(lbl_pelicula_1);
		
		JLabel lbl_idioma_1 = new JLabel("Espa\u00F1ol");
		lbl_idioma_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_idioma_1.setBounds(95, 30, 58, 14);
		panel_peli1.add(lbl_idioma_1);
		
		JLabel lbl_sala_1 = new JLabel("Sala 2");
		lbl_sala_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_sala_1.setBounds(95, 42, 46, 14);
		panel_peli1.add(lbl_sala_1);
		
		JLabel lbl_horario_1 = new JLabel("Horario 2:00 PM");
		lbl_horario_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_horario_1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_1.setBounds(95, 55, 97, 14);
		panel_peli1.add(lbl_horario_1);
		
		JLabel lbl_clasifi_1 = new JLabel("B15");
		lbl_clasifi_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_clasifi_1.setBounds(294, 14, 40, 14);
		panel_peli1.add(lbl_clasifi_1);
		
		JLabel lbl_poster_1 = new JLabel("");
		lbl_poster_1.setIcon(new ImageIcon("IMG\\jurassic_world_re.jpg"));
		lbl_poster_1.setBounds(10, 0, 70, 92);
		panel_peli1.add(lbl_poster_1);
		
		JPanel panel_peli2 = new JPanel();
		panel_peli2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				EscogerAsiento asiento = new EscogerAsiento(vb,3);
				frmCinema.setVisible(false);
				asiento.npa = 3;
				asiento.frame.setVisible(true);
				
				
				
				panel_peli_r_2.setVisible(true);
				lblpelicula_r_2.setText(lbl_pelicula_2.getText());
				pelicula =3;
				//total = 80 * Integer.parseInt( lbl_cantidad_2.getText());
				
			}
		});
		panel_peli2.setBackground(SystemColor.activeCaptionBorder);
		panel_peli2.setBounds(10, 217, 344, 92);
		panel_muestras.add(panel_peli2);
		panel_peli2.setLayout(null);
		
		lbl_pelicula_2 = new JLabel("Increibles 2");
		lbl_pelicula_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_2.setBounds(101, 11, 89, 20);
		panel_peli2.add(lbl_pelicula_2);
		
		JLabel lbl_idioma_2 = new JLabel("Espa\u00F1ol\r\n");
		lbl_idioma_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_idioma_2.setBounds(101, 31, 58, 14);
		panel_peli2.add(lbl_idioma_2);
		
		JLabel lbl_sala_2 = new JLabel("Sala 1");
		lbl_sala_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_sala_2.setBounds(101, 49, 40, 14);
		panel_peli2.add(lbl_sala_2);
		
		JLabel lbl_horario_2 = new JLabel("Horario 3:30 PM");
		lbl_horario_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_horario_2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_2.setBounds(101, 67, 103, 14);
		panel_peli2.add(lbl_horario_2);
		
		JLabel lbl_clasifi_2 = new JLabel("B15");
		lbl_clasifi_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_clasifi_2.setBounds(294, 14, 40, 14);
		panel_peli2.add(lbl_clasifi_2);
		
		JLabel lbl_poster_2 = new JLabel("");
		lbl_poster_2.setIcon(new ImageIcon("IMG\\increibles_re.jpg"));
		lbl_poster_2.setBounds(10, 0, 70, 92);
		panel_peli2.add(lbl_poster_2);
		
		JPanel panel_peli3 = new JPanel();
		panel_peli3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				EscogerAsiento asiento = new EscogerAsiento(vb,4);
				frmCinema.setVisible(false);
				asiento.npa = 4;
				asiento.frame.setVisible(true);
				
				panel_peli_r_3.setVisible(true);
				
				lblpelicula_r_3.setText(lbl_pelicula_3.getText());
				pelicula =4;
				//total = 90 * Integer.parseInt( lbl_cantidad_3.getText());
				
			}
		});
		panel_peli3.setBackground(SystemColor.activeCaptionBorder);
		panel_peli3.setBounds(10, 320, 344, 92);
		panel_muestras.add(panel_peli3);
		panel_peli3.setLayout(null);
		
		lbl_pelicula_3 = new JLabel("Megamente");
		lbl_pelicula_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_3.setBounds(105, 11, 80, 20);
		panel_peli3.add(lbl_pelicula_3);
		
		JLabel lbl_idioma_3 = new JLabel("Espa\u00F1ol");
		lbl_idioma_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_idioma_3.setBounds(105, 30, 58, 14);
		panel_peli3.add(lbl_idioma_3);
		
		JLabel lbl_sala_3 = new JLabel("Sala 3");
		lbl_sala_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_sala_3.setBounds(105, 51, 58, 14);
		panel_peli3.add(lbl_sala_3);
		
		JLabel lbl_horario_3 = new JLabel("Horario 4:00 PM");
		lbl_horario_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_horario_3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_3.setBounds(105, 67, 98, 14);
		panel_peli3.add(lbl_horario_3);
		
		JLabel lbl_clasifi_3 = new JLabel("B15");
		lbl_clasifi_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_clasifi_3.setBounds(294, 14, 40, 14);
		panel_peli3.add(lbl_clasifi_3);
		
		JLabel lbl_poster_3 = new JLabel("");
		lbl_poster_3.setIcon(new ImageIcon("IMG\\megamente_re.jpg"));
		lbl_poster_3.setBounds(10, 0, 70, 92);
		panel_peli3.add(lbl_poster_3);
		
		
		
	
		
		JPanel panel_peli4 = new JPanel();
		panel_peli4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EscogerAsiento asiento = new EscogerAsiento(vb,1);
				frmCinema.setVisible(false);
				asiento.npa = 1;
				asiento.frame.setVisible(true);
		        
				
				panel_peli_r.setVisible(true);
				//datos
				lblpelicula_r.setText(lbl_pelicula_4.getText());
				
				
				pelicula =1;
				
				
				
			}
		});
		panel_peli4.setLayout(null);
		panel_peli4.setBackground(SystemColor.activeCaptionBorder);
		panel_peli4.setBounds(10, 11, 344, 92);
		panel_muestras.add(panel_peli4);
		
		
		lbl_pelicula_4 = new JLabel("Spiderman: sin camino a casa");
		lbl_pelicula_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_4.setBounds(95, 11, 189, 20);
		panel_peli4.add(lbl_pelicula_4);
		
		JLabel lbl_idioma_4 = new JLabel("Espa\u00F1ol");
		lbl_idioma_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_idioma_4.setBounds(95, 30, 59, 14);
		panel_peli4.add(lbl_idioma_4);
		
		JLabel lbl_sala_4 = new JLabel("Sala 1");
		lbl_sala_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_sala_4.setBounds(95, 42, 46, 14);
		panel_peli4.add(lbl_sala_4);
		
		JLabel lbl_horario_4 = new JLabel("Horario 1:00 PM");
		lbl_horario_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_horario_4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_horario_4.setBounds(95, 55, 100, 14);
		panel_peli4.add(lbl_horario_4);
		
		JLabel lbl_clasifi_4 = new JLabel("B15");
		lbl_clasifi_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_clasifi_4.setBounds(294, 14, 40, 14);
		panel_peli4.add(lbl_clasifi_4);
		
		JLabel lbl_poster_4 = new JLabel("");
		//ImageIcon ico = new ImageIcon(this.getClass().getResource("poster_spiderman.jpg"));
		//ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lbl_poster.getWidth(), lbl_poster.getHeight(), Image.SCALE_SMOOTH));
		lbl_poster_4.setIcon(new ImageIcon("IMG\\poster_spiderman_70.jpg"));
	
		lbl_poster_4.setBounds(10, 0, 70, 92);
		panel_peli4.add(lbl_poster_4);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 49, 364, 443);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JLabel lbl_total = new JLabel("Total: $");
		lbl_total.setBounds(20, 418, 59, 14);
		lbl_total.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_resumen.add(lbl_total);
		
		panel_peli_r = new JPanel();
		panel_peli_r.setLayout(null);
		panel_peli_r.setBackground(SystemColor.activeCaptionBorder);
		panel_peli_r.setBounds(10, 11, 344, 92);
		panel_resumen.add(panel_peli_r);
		
		lblpelicula_r = new JLabel("Spiderman");
		lblpelicula_r.setFont(new Font("Arial", Font.PLAIN, 12));
		lblpelicula_r.setBounds(92, 11, 226, 20);
		panel_peli_r.add(lblpelicula_r);
		
		lbl_cantidad = new JLabel("Cantidad");
		lbl_cantidad.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cantidad.setBounds(92, 32, 71, 14);
		panel_peli_r.add(lbl_cantidad);
		
		lbl_asientos = new JLabel("Asientos");
		lbl_asientos.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_asientos.setBounds(92, 51, 82, 14);
		panel_peli_r.add(lbl_asientos);
		
	    panel_peli_r_1 = new JPanel();
		panel_peli_r_1.setLayout(null);
		panel_peli_r_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli_r_1.setBounds(10, 114, 344, 92);
		panel_resumen.add(panel_peli_r_1);
		
		lblpelicula_r_1 = new JLabel("Spiderman");
		lblpelicula_r_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblpelicula_r_1.setBounds(92, 11, 205, 20);
		panel_peli_r_1.add(lblpelicula_r_1);
		
		lbl_cantidad_1 = new JLabel("Cantidad");
		lbl_cantidad_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cantidad_1.setBounds(92, 32, 71, 14);
		panel_peli_r_1.add(lbl_cantidad_1);
		
	    lbl_asientos_1 = new JLabel("Asientos");
	    lbl_asientos_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_asientos_1.setBounds(92, 51, 82, 14);
		panel_peli_r_1.add(lbl_asientos_1);
		
		 panel_peli_r_2 = new JPanel();
		panel_peli_r_2.setLayout(null);
		panel_peli_r_2.setBackground(SystemColor.activeCaptionBorder);
		panel_peli_r_2.setBounds(10, 217, 344, 92);
		panel_resumen.add(panel_peli_r_2);
		
		lblpelicula_r_2 = new JLabel("Spiderman");
		lblpelicula_r_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblpelicula_r_2.setBounds(92, 11, 219, 20);
		panel_peli_r_2.add(lblpelicula_r_2);
		
		lbl_cantidad_2 = new JLabel("Cantidad");
		lbl_cantidad_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cantidad_2.setBounds(92, 32, 71, 14);
		panel_peli_r_2.add(lbl_cantidad_2);
		
		 lbl_asientos_2 = new JLabel("Asientos");
		 lbl_asientos_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_asientos_2.setBounds(92, 51, 82, 14);
		panel_peli_r_2.add(lbl_asientos_2);
		
		panel_peli_r_3 = new JPanel();
		panel_peli_r_3.setLayout(null);
		panel_peli_r_3.setBackground(SystemColor.activeCaptionBorder);
		panel_peli_r_3.setBounds(10, 320, 344, 92);
		panel_resumen.add(panel_peli_r_3);
		
		lblpelicula_r_3 = new JLabel("Spiderman");
		lblpelicula_r_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblpelicula_r_3.setBounds(92, 11, 217, 20);
		panel_peli_r_3.add(lblpelicula_r_3);
		
		 lbl_cantidad_3 = new JLabel("Cantidad");
		 lbl_cantidad_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cantidad_3.setBounds(92, 32, 71, 14);
		panel_peli_r_3.add(lbl_cantidad_3);
		
		 lbl_asientos_3 = new JLabel("Asientos");
		 lbl_asientos_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_asientos_3.setBounds(92, 51, 82, 14);
		panel_peli_r_3.add(lbl_asientos_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color( 217, 217, 217));
		panel.setBounds(413, 61, 183, 121);
		panel_general.add(panel);
		panel.setLayout(null);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("SI");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( chckbxNewCheckBox.isSelected()) {
					 txt_id_c.setVisible(true);
					 lbl_id_c.setVisible(true);
					 btn_b_c.setVisible(true);
					 
				}else {
					txt_id_c.setVisible(false);
					 lbl_id_c.setVisible(false);
					 btn_b_c.setVisible(false);
				}
			}
		});
		chckbxNewCheckBox.setBackground((SystemColor.activeCaptionBorder));
		chckbxNewCheckBox.setBounds(63, 32, 59, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(63, 11, 76, 14);
		panel.add(lblNewLabel);
		
		txt_id_c = new JTextField();
		txt_id_c.setFont(new Font("Arial", Font.PLAIN, 12));
		txt_id_c.setBounds(63, 73, 86, 20);
		panel.add(txt_id_c);
		txt_id_c.setColumns(10);
		
	    lbl_id_c = new JLabel("ID:");
	    lbl_id_c.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_id_c.setBounds(30, 76, 33, 14);
		panel.add(lbl_id_c);
		
		btn_b_c = new JButton("Buscar");
		btn_b_c.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_b_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JSONArray ja =  funciones_get_put.cliente_buscar();
				if (txt_id_c.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "IMGRESA UN ID", "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
	           int id = Integer.parseInt( txt_id_c.getText());
				
				
				
				
				int x = 0;
				for (int i=0; i<ja.length();i++) {
					JSONObject jo = ja.getJSONObject(i);

					if(id == jo.getInt("id")) {
						x = 1;
						
						JOptionPane.showMessageDialog(null, " CLIENTE ENCONTRADO", "VERIFICAR", JOptionPane.INFORMATION_MESSAGE);
//						lbl_nt.setText(  Integer.toString( jo.getInt("id")));
//						lbl_fecha.setText(jo.getString("cumple"));
//						lbl_nom .setText(jo.getString("nombre"));
//						lbl_ape1 .setText(jo.getString("apellido1"));
//						lbl_ape2 .setText(jo.getString("apellido2"));
//						lbl_tipot.setText( jo.getString("tajeta"));
						
						jog =  jo;
						System.out.println(jog);
						clientee = true;
						break; 
					}
				}
				
				if (x == 0) {
					JOptionPane.showMessageDialog(null, "ClIENTE NO ENCONTRADO", "error", JOptionPane.ERROR_MESSAGE);
					clientee = false;
					return;
					
				}
			}
		});
		btn_b_c.setBounds(94, 98, 89, 23);
		panel.add(btn_b_c);
		
		JButton btnNewButton = new JButton("Registrar Venta");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//funciones_get_put.vent_boleto_mostar();
				
				float desc;
				
				if (pelicula==1) {
					total = 80 * Integer.parseInt( lbl_cantidad.getText());
					System.out.println( lbl_cantidad.getText());
					System.out.println( lbl_asientos.getText());
					//System.out.println(jog);
					if (clientee == false) {
						
						CVentaBoletos.generarVenta(total, 1,Integer.parseInt( lbl_cantidad.getText()), 1, lbl_asientos.getText(), 1);
						
					}else {
						
						if (jog.getString("tajeta").equals("invitado")) {
							desc = (float) (total * 0.10);
							total = total -desc;
						}else if (jog.getString("tajeta").equals("invitado_especial")) {
							desc = (float) (total * 0.30);
							total = total -desc;
						}else {
							desc = (float) (total * 0.50);
							total = total -desc;
						}
						
						CVentaBoletos.generarVentac(total, 1, Integer.parseInt( lbl_cantidad.getText()), 1,  lbl_asientos.getText(), 1, jog.getInt("id"));
						
					}
					
				}else if (pelicula==2) {
					total = 80 * Integer.parseInt( lbl_cantidad_1.getText());
					System.out.println( lbl_cantidad_1.getText());
					System.out.println( lbl_asientos_1.getText());
					//System.out.println(jog);
					if (clientee == false) {
						
						CVentaBoletos.generarVenta(total, 2,Integer.parseInt( lbl_cantidad_1.getText()), 2, lbl_asientos_1.getText(), 1);
						
					}else {
						
						if (jog.getString("tajeta").equals("invitado")) {
							desc = (float) (total * 0.10);
							total = total -desc;
						}else if (jog.getString("tajeta").equals("invitado_especial")) {
							desc = (float) (total * 0.30);
							total = total -desc;
						}else {
							desc = (float) (total * 0.50);
							total = total -desc;
						}
						
						CVentaBoletos.generarVentac(total, 2, Integer.parseInt( lbl_cantidad_1.getText()), 2, lbl_asientos_1.getText(), 2, jog.getInt("id"));
						
						
					}
					
					
					
				}else if (pelicula==3) {
					
					total = 80 * Integer.parseInt( lbl_cantidad_2.getText());
					System.out.println( lbl_cantidad_2.getText());
					System.out.println( lbl_asientos_2.getText());
					//System.out.println(jog);
					if (clientee == false) {
						
						CVentaBoletos.generarVenta(total, 1,Integer.parseInt( lbl_cantidad_2.getText()), 3, lbl_asientos_2.getText(), 1);
						
					}else {
						
						if (jog.getString("tajeta").equals("invitado")) {
							desc = (float) (total * 0.10);
							total = total -desc;
						}else if (jog.getString("tajeta").equals("invitado_especial")) {
							desc = (float) (total * 0.30);
							total = total -desc;
						}else {
							desc = (float) (total * 0.50);
							total = total -desc;
						}
						
						CVentaBoletos.generarVentac(total, 1, Integer.parseInt( lbl_cantidad_2.getText()), 3,  lbl_asientos_2.getText(), 1, jog.getInt("id"));
						
					}
					
				}else if (pelicula==4) {
					
					total = 80 * Integer.parseInt( lbl_cantidad_3.getText());
					System.out.println( lbl_cantidad_3.getText());
					System.out.println( lbl_asientos_3.getText());
					//System.out.println(jog);
					if (clientee == false) {
						
						CVentaBoletos.generarVenta(total, 3,Integer.parseInt( lbl_cantidad_3.getText()), 4, lbl_asientos_3.getText(), 1);
						
					}else {
						
						if (jog.getString("tajeta").equals("invitado")) {
							desc = (float) (total * 0.10);
							total = total -desc;
						}else if (jog.getString("tajeta").equals("invitado_especial")) {
							desc = (float) (total * 0.30);
							total = total -desc;
						}else {
							desc = (float) (total * 0.50);
							total = total -desc;
						}
						
						CVentaBoletos.generarVentac(total, 3, Integer.parseInt( lbl_cantidad_3.getText()), 4,  lbl_asientos_3.getText(), 3, jog.getInt("id"));
						
					}
					
				}
				
				funciones_get_put.asiento_ocupados();
				clientee = false;
				total = 0;
				
				Connection con;
				JasperReport reporte;
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://192.168.43.215:3306/db_cine","ado3","123");
					
					reporte = JasperCompileManager.compileReport("src/main/java/reportes/ticketVentaBoleto.jrxml");
					JasperPrint print = JasperFillManager.fillReport(reporte,null,con);
					JasperViewer visualiza = new JasperViewer(print,false);
					visualiza.setVisible(true);
					
				}catch(Exception e1) {
					System.out.println(e1.toString());
				}
				
				
				panel_peli_r.setVisible(false);
				panel_peli_r_1.setVisible(false);
				panel_peli_r_2.setVisible(false);
				panel_peli_r_3.setVisible(false);
			}
			
			
		});
		btnNewButton.setBounds(839, 503, 131, 59);
		btnNewButton.setBackground(new Color(60, 110, 113));
		panel_general.add(btnNewButton);
		
		//ir al frame de clientes
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\clienteb.png"));
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
		
		btn_clientes_1 = new JButton("Almacen");
		btn_clientes_1.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\almacenb.png"));
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
		
		btn_clientes_2 = new JButton("Peliculas");
		btn_clientes_2.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\cliente-web\\IMG\\peliculasb.png"));
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
		
		btn_clientes_3 = new JButton("Reportes");
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
