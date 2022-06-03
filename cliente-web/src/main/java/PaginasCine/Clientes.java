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
import javax.swing.JTextField;

import org.json.*;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;


public class Clientes {

	JFrame frmCinema;
	private JTextField txt_nombre_c;
	private JTextField txt_ape_1_c;
	private JTextField txt_ape_2_c;
	static JComboBox cmb_tarj_c;
	static JDateChooser calendario;
	private JTextField txt_id_cliente;
	static int puesto;
	JButton btn_clientes_1;
	JButton btn_clientes_2;
	JButton btn_clientes_3;

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
		run();
	}
	
	
	public void run() {
		if(puesto==1) {
			btn_clientes_1.setVisible(true);
			btn_clientes_2.setVisible(true);
			btn_clientes_3.setVisible(true);
		}else {
			btn_clientes_1.setVisible(false);
			btn_clientes_2.setVisible(false);
			btn_clientes_3.setVisible(false);
		}
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
		panel_muestras.setBounds(38, 49, 374, 426);
		panel_general.add(panel_muestras);
		panel_muestras.setBackground(new Color(217, 217, 217));
		panel_muestras.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS DE CLIENTE");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(111, 11, 152, 14);
		panel_muestras.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(26, 186, 129, 14);
		panel_muestras.add(lblNombre);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de tarjeta");
		lblNumeroDeTarjeta.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNumeroDeTarjeta.setBounds(26, 56, 129, 14);
		panel_muestras.add(lblNumeroDeTarjeta);
		
		JLabel lblFechaDeCumpleaos = new JLabel("Fecha de Cumplea\u00F1os");
		lblFechaDeCumpleaos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaDeCumpleaos.setBounds(26, 119, 129, 14);
		panel_muestras.add(lblFechaDeCumpleaos);
		
		JLabel lblTipoDeTarjeta = new JLabel("Apellido paterno");
		lblTipoDeTarjeta.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTipoDeTarjeta.setBounds(26, 243, 129, 14);
		panel_muestras.add(lblTipoDeTarjeta);
		
		JLabel lblApellidoMaterno_1 = new JLabel("Apellido Materno");
		lblApellidoMaterno_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoMaterno_1.setBounds(26, 306, 129, 14);
		panel_muestras.add(lblApellidoMaterno_1);
		
		JLabel lblTipoDeTarjeta_1 = new JLabel("Tipo de tarjeta");
		lblTipoDeTarjeta_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTipoDeTarjeta_1.setBounds(26, 359, 129, 14);
		panel_muestras.add(lblTipoDeTarjeta_1);
		
		final JLabel lbl_nt = new JLabel("");
		lbl_nt.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_nt.setBounds(208, 56, 129, 14);
		panel_muestras.add(lbl_nt);
		
		final JLabel lbl_fecha = new JLabel("");
		lbl_fecha.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_fecha.setBounds(208, 119, 129, 14);
		panel_muestras.add(lbl_fecha);
		
		final JLabel lbl_nom = new JLabel("");
		lbl_nom.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_nom.setBounds(208, 186, 129, 14);
		panel_muestras.add(lbl_nom);
		
		final JLabel lbl_ape1 = new JLabel("");
		lbl_ape1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_ape1.setBounds(208, 243, 129, 14);
		panel_muestras.add(lbl_ape1);
		
		final JLabel lbl_ape2 = new JLabel("");
		lbl_ape2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_ape2.setBounds(208, 306, 129, 14);
		panel_muestras.add(lbl_ape2);
		
		final JLabel lbl_tipot = new JLabel("");
		lbl_tipot.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_tipot.setBounds(208, 359, 129, 14);
		panel_muestras.add(lbl_tipot);
		
		txt_id_cliente = new JTextField();
		txt_id_cliente.setBounds(55, 383, 167, 20);
		panel_muestras.add(txt_id_cliente);
		txt_id_cliente.setColumns(10);
		
		JButton btnNewButton = new JButton("buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt( txt_id_cliente.getText());
				
				JSONArray ja =  funciones_get_put.cliente_buscar();
				
				
				int x = 0;
				for (int i=0; i<ja.length();i++) {
					JSONObject jo = ja.getJSONObject(i);

					if(id == jo.getInt("id")) {
						x = 1;
						lbl_nt.setText(  Integer.toString( jo.getInt("id")));
						lbl_fecha.setText(jo.getString("cumple"));
						lbl_nom .setText(jo.getString("nombre"));
						lbl_ape1 .setText(jo.getString("apellido1"));
						lbl_ape2 .setText(jo.getString("apellido2"));
						lbl_tipot.setText( jo.getString("tajeta"));
						break; 
					}
				}
				
				if (x == 0) {
					JOptionPane.showMessageDialog(null, "ClIENTE NO ENCONTRADO", "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
			}
		});
		btnNewButton.setBounds(248, 382, 89, 23);
		panel_muestras.add(btnNewButton);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 49, 364, 450);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JPanel panel_peli1_4 = new JPanel();
		panel_peli1_4.setLayout(null);
		panel_peli1_4.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_4.setBounds(10, 278, 344, 68);
		panel_resumen.add(panel_peli1_4);
		
		JLabel lbl_pelicula_4 = new JLabel("Frase Promocional");
		lbl_pelicula_4.setBounds(10, 11, 122, 20);
		panel_peli1_4.add(lbl_pelicula_4);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre_1.setBounds(33, 32, 129, 14);
		panel_resumen.add(lblNombre_1);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaDeNacimiento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaDeNacimiento.setBounds(33, 183, 129, 14);
		panel_resumen.add(lblFechaDeNacimiento);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoPaterno.setBounds(33, 85, 129, 14);
		panel_resumen.add(lblApellidoPaterno);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidoMaterno.setBounds(33, 140, 129, 14);
		panel_resumen.add(lblApellidoMaterno);
		
		txt_nombre_c = new JTextField();
		txt_nombre_c.setBounds(172, 29, 182, 20);
		panel_resumen.add(txt_nombre_c);
		txt_nombre_c.setColumns(10);
		
		txt_ape_1_c = new JTextField();
		txt_ape_1_c.setColumns(10);
		txt_ape_1_c.setBounds(172, 82, 182, 20);
		panel_resumen.add(txt_ape_1_c);
		
		txt_ape_2_c = new JTextField();
		txt_ape_2_c.setColumns(10);
		txt_ape_2_c.setBounds(172, 137, 182, 20);
		panel_resumen.add(txt_ape_2_c);
		
		JButton btn_confirmar = new JButton("Registrar");
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
				int mes = calendario.getCalendar().get(Calendar.MONTH);
				int año = calendario.getCalendar().get(Calendar.YEAR);
				
				String d = Integer.toString(dia);
				String m = Integer.toString(mes);
				String a = Integer.toString(año);
				
				int id;
				
				if (txt_nombre_c.getText().equals("") || txt_ape_1_c.getText().equals("") || txt_ape_2_c.getText().equals("") || d.length()<=0  || m.length()<=0 || a.length()<=0) {
					JOptionPane.showMessageDialog(null, "TIENES QUE INGRESAR LOS DATOS COMPLETOS", "error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if (cmb_tarj_c.getSelectedItem().toString().equals("invitado")) {
					id = 1;
				}else if (cmb_tarj_c.getSelectedItem().toString().equals("invitado especial")) {
					id = 2;
				}else {
					id = 3;
				}
				
				
				
				
				if (d.length()<2) {
					d = "0" + d;
				}
				
				if (m.length()<2) {
					m = "0" + m;
				}
				
				String fecha = (a + "-"+ m + "-" + d  );
				JSONObject cliente = new JSONObject();
				
				cliente.put("nombre", txt_nombre_c.getText() );
				cliente.put("apellido1", txt_ape_1_c.getText() );
				cliente.put("apellido2", txt_ape_2_c.getText() );
				cliente.put("cumple", fecha );
				cliente.put("tarjeta", id);
				
				String idcb = Integer.toString(funciones_get_put.cliente_mostrar());
				
				funciones_get_put.cliente_registrar(cliente);
				funciones_get_put.cliente_mostrar();
				
				
				
				Clientes.createImage (idcb+".png",idcb);
			    System.out.println("finished");
				
				
				
				
		
//				public class Barcode_Image {
//					public static void main(String[] args) {
//						
//					}
//			
				
				
				
				
				
				
			}
		});
		btn_confirmar.setBounds(266, 397, 88, 39);
		panel_resumen.add(btn_confirmar);
		btn_confirmar.setForeground(Color.WHITE);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de tarjeta");
		lblNewLabel_1.setBounds(33, 233, 116, 14);
		panel_resumen.add(lblNewLabel_1);
		
		cmb_tarj_c = new JComboBox();
		cmb_tarj_c.setModel(new DefaultComboBoxModel(new String[] {"invitado", "invitado especial", "vip"}));
		cmb_tarj_c.setBounds(172, 233, 182, 18);
		panel_resumen.add(cmb_tarj_c);
		
		calendario = new JDateChooser();
		calendario.setBounds(172, 183, 182, 20);
		panel_resumen.add(calendario);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
		btn_clientes_1 = new JButton("Almacen");
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
		
		btn_clientes_2 = new JButton("Peliculas");
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
		
		btn_clientes_3 = new JButton("Reportes");
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
	
	
	
	
	public static void createImage(String image_name,String myString)  {
		try {
		Code128Bean code128 = new Code128Bean();
		code128.setHeight(15f);
		code128.setModuleWidth(0.3);
		code128.setQuietZone(10);
		code128.doQuietZone(true);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		BitmapCanvasProvider canvas = new BitmapCanvasProvider(baos, "image/x-png", 300, BufferedImage.TYPE_BYTE_BINARY, false, 0);
		code128.generateBarcode(canvas, myString);
		canvas.finish();
		//write to png file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Hp\\Desktop\\CB\\"+image_name);
		fos.write(baos.toByteArray());
		fos.flush();
		fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

