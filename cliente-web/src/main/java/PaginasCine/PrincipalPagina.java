package PaginasCine;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import org.json.*;

public class PrincipalPagina {

	JFrame frmCinema;
	JSONObject venta = new JSONObject();	
	JSONArray productos = new JSONArray();
	JSONArray combos = new JSONArray();
	
	
	//Individual
	JLabel lbl_palomitas;
	final JComboBox cb_tamano_palo = new JComboBox();
	final JComboBox cb_sabor_palo = new JComboBox();
	JLabel lbl_refresco;
	final JComboBox cb_tamano_refre = new JComboBox();
	final JComboBox cb_sabor_refre = new JComboBox();
	JButton btn_confirmar;
	JTextField txt_cant_palo;
	JTextField txt_cant_refre;
	JLabel lblNewLabel;
	JLabel lblSabor;
	JLabel lblCantidad;
	
	//Combo
	static JButton btn_combo_1;
	static JButton btn_combo_2;
	static JButton btn_combo_3;
	static JButton btn_combo_4;
	
	
	
	//extras
	static JLabel lbl_dulces;
	static JLabel lbl_comidas;
	final static JComboBox comobo_dulces_extra = new JComboBox();
	final static JComboBox comobo_comida_extra = new JComboBox();
	static JTextField cant_dulces;
	static JTextField cant_comida;
	static JButton btn_confirmar_2_ext;
	static JLabel lblNewLabel_ext_1;
	static JLabel lblNewLabel_ext_2;
	
	
	int id = 0;
	float prec_prd = 0;
	float total=0;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PrincipalPagina window = new PrincipalPagina();
//					window.frmCinema.setVisible(true);
//					 btn_combo_1.setVisible(false);
//					 btn_combo_2.setVisible(false);
//					 btn_combo_3.setVisible(false);
//					 btn_combo_4.setVisible(false);
//					 
//					 
//					 
//					      lbl_dulces.setVisible(false);
//						  lbl_comidas.setVisible(false); 
//						  comobo_dulces_extra.setVisible(false);
//						  comobo_comida_extra.setVisible(false);
//						  cant_dulces.setVisible(false);
//						  cant_comida.setVisible(false);
//						  btn_confirmar_2_ext.setVisible(false);
//						  lblNewLabel_ext_1.setVisible(false);
//						  lblNewLabel_ext_2.setVisible(false);
//						  
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				
//				
//			}
//		});
//	}
	
	
	public void run() {
		try {
			btn_combo_1.setVisible(false);
			 btn_combo_2.setVisible(false);
			 btn_combo_3.setVisible(false);
			 btn_combo_4.setVisible(false);
			 
			lbl_dulces.setVisible(false);
			lbl_comidas.setVisible(false); 
			comobo_dulces_extra.setVisible(false);
			comobo_comida_extra.setVisible(false);
			cant_dulces.setVisible(false);
			cant_comida.setVisible(false);
			btn_confirmar_2_ext.setVisible(false);
			lblNewLabel_ext_1.setVisible(false);
			lblNewLabel_ext_2.setVisible(false);
				  
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	/**
	 REALMENTE ES LA VISTA DE LAS VENTAS, NO ES LA PAGINA PRINCIPAL, HACER RENAME O DEJARLO DE EST� MANERA
	 */

	/**
	 * Create the application.
	 */
	public PrincipalPagina() {
		initialize();
		run();
		venta.put("total", total);
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
		btn_ventas.setBorder(null);
		btn_ventas.setForeground(Color.white);
		btn_ventas.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_ventas.setBounds(100, 0, 100, 38);
		btn_ventas.setBackground(new Color(40, 75, 99));
		
		JButton btn_boletos = new JButton("Boletos");
		btn_boletos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_boletos.setBorder(null);
		btn_boletos.setForeground(Color.white);
		btn_boletos.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_boletos.setBounds(0, 0, 100, 38);
		btn_boletos.setBackground(new Color(40, 75, 99));
		frmCinema.getContentPane().setLayout(null);
		frmCinema.getContentPane().add(btn_ventas);
		frmCinema.getContentPane().add(btn_boletos);
		
		JPanel panel_general = new JPanel();
		panel_general.setBorder(null);
		panel_general.setBackground(new Color(40, 75, 99));
		panel_general.setBounds(0, 38, 1034, 573);
		frmCinema.getContentPane().add(panel_general);
		panel_general.setLayout(null);
		
		JButton btn_individual = new JButton("Individual");
		btn_individual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_palomitas.setVisible(true); 
				cb_tamano_palo.setVisible(true) ;
				cb_sabor_palo.setVisible(true) ;
				lbl_refresco.setVisible(true);
				cb_tamano_refre.setVisible(true);
				cb_sabor_refre.setVisible(true) ;
				btn_confirmar.setVisible(true);
				txt_cant_palo.setVisible(true);
				txt_cant_refre.setVisible(true);
				lblNewLabel.setVisible(true);
		        lblSabor.setVisible(true);
				lblCantidad.setVisible(true);
				
				  btn_combo_1.setVisible(false);
				  btn_combo_2.setVisible(false);
				  btn_combo_3.setVisible(false);
				  btn_combo_4.setVisible(false);
				  
				  lbl_dulces.setVisible(false);
				  lbl_comidas.setVisible(false); 
				  comobo_dulces_extra.setVisible(false);
				  comobo_comida_extra.setVisible(false);
				  cant_dulces.setVisible(false);
				  cant_comida.setVisible(false);
				  btn_confirmar_2_ext.setVisible(false);
				  lblNewLabel_ext_1.setVisible(false);
				  lblNewLabel_ext_2.setVisible(false);
				
				
			}
		});
		btn_individual.setForeground(new Color(255, 255, 255));
		btn_individual.setBorder(null);
		btn_individual.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_individual.setBounds(37, 48, 101, 46);
		btn_individual.setBackground(new Color(60, 110, 113));
		panel_general.add(btn_individual);
		
		JButton btn_combos = new JButton("Combos");
		btn_combos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_palomitas.setVisible(false); 
				cb_tamano_palo.setVisible(false) ;
				cb_sabor_palo.setVisible(false) ;
				lbl_refresco.setVisible(false);
				cb_tamano_refre.setVisible(false);
				cb_sabor_refre.setVisible(false) ;
				btn_confirmar.setVisible(false);
				txt_cant_palo.setVisible(false);
				txt_cant_refre.setVisible(false);
				lblNewLabel.setVisible(false);
		        lblSabor.setVisible(false);
				lblCantidad.setVisible(false);
				
				  btn_combo_1.setVisible(true);
				  btn_combo_2.setVisible(true);
				  btn_combo_3.setVisible(true);
				  btn_combo_4.setVisible(true);
				  
				  lbl_dulces.setVisible(false);
				  lbl_comidas.setVisible(false); 
				  comobo_dulces_extra.setVisible(false);
				  comobo_comida_extra.setVisible(false);
				  cant_dulces.setVisible(false);
				  cant_comida.setVisible(false);
				  btn_confirmar_2_ext.setVisible(false);
				  lblNewLabel_ext_1.setVisible(false);
				  lblNewLabel_ext_2.setVisible(false);
				
				
			}
		});
		btn_combos.setForeground(new Color(255, 255, 255));
		btn_combos.setBorder(null);
		btn_combos.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combos.setBounds(170, 48, 101, 46);
		btn_combos.setBackground(new Color(60, 110, 113));
		panel_general.add(btn_combos);
		
		JButton btn_extras = new JButton("Extras");
		btn_extras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl_palomitas.setVisible(false); 
				cb_tamano_palo.setVisible(false) ;
				cb_sabor_palo.setVisible(false) ;
				lbl_refresco.setVisible(false);
				cb_tamano_refre.setVisible(false);
				cb_sabor_refre.setVisible(false) ;
				btn_confirmar.setVisible(false);
				txt_cant_palo.setVisible(false);
				txt_cant_refre.setVisible(false);
				lblNewLabel.setVisible(false);
		        lblSabor.setVisible(false);
				lblCantidad.setVisible(false);
				
				  btn_combo_1.setVisible(false);
				  btn_combo_2.setVisible(false);
				  btn_combo_3.setVisible(false);
				  btn_combo_4.setVisible(false);
				  
				  
				  lbl_dulces.setVisible(true);
				  lbl_comidas.setVisible(true); 
				  comobo_dulces_extra.setVisible(true);
				  comobo_comida_extra.setVisible(true);
				  cant_dulces.setVisible(true);
				  cant_comida.setVisible(true);
				  btn_confirmar_2_ext.setVisible(true);
				  lblNewLabel_ext_1.setVisible(true);
				  lblNewLabel_ext_2.setVisible(true);
				
			}
		});
		btn_extras.setForeground(new Color(255, 255, 255));
		btn_extras.setBorder(null);
		btn_extras.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_extras.setBounds(300, 48, 101, 46);
		btn_extras.setBackground(new Color(60, 110, 113));
		panel_general.add(btn_extras);
		
		JPanel panel_muestras = new JPanel();
		panel_muestras.setBounds(37, 105, 467, 435);
		panel_general.add(panel_muestras);
		panel_muestras.setBackground(new Color(217, 217, 217));
		panel_muestras.setLayout(null);
		
		lbl_palomitas = new JLabel("Palomitas");
		lbl_palomitas.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_palomitas.setForeground(Color.BLACK);
		lbl_palomitas.setBounds(10, 63, 65, 21);
		panel_muestras.add(lbl_palomitas);
		
		
		cb_tamano_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_palo.setMaximumRowCount(3);
		cb_tamano_palo.setToolTipText("");
		cb_tamano_palo.setModel(new DefaultComboBoxModel(new String[] {"","Chico", "Mediano", "Grande"}));
		cb_tamano_palo.setSelectedIndex(0);
		cb_tamano_palo.setBounds(83, 62, 126, 22);
		panel_muestras.add(cb_tamano_palo);
		
		
		cb_sabor_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_palo.setToolTipText("");
		cb_sabor_palo.setModel(new DefaultComboBoxModel(new String[] {"","Mantequilla", "Takis", "Caramelo"}));
		cb_sabor_palo.setSelectedIndex(0);
		cb_sabor_palo.setMaximumRowCount(3);
		cb_sabor_palo.setBounds(219, 62, 126, 22);
		panel_muestras.add(cb_sabor_palo);
		
		lbl_refresco = new JLabel("Refresco");
		lbl_refresco.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_refresco.setForeground(Color.BLACK);
		lbl_refresco.setBounds(10, 158, 65, 21);
		panel_muestras.add(lbl_refresco);
		
		
		cb_tamano_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_refre.setToolTipText("");
		cb_tamano_refre.setModel(new DefaultComboBoxModel(new String[] {"","Chico", "Mediano", "Grande"}));
		cb_tamano_refre.setSelectedIndex(0);
		cb_tamano_refre.setMaximumRowCount(3);
		cb_tamano_refre.setBounds(83, 157, 126, 22);
		panel_muestras.add(cb_tamano_refre);
		
		
		cb_sabor_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_refre.setToolTipText("");
		cb_sabor_refre.setModel(new DefaultComboBoxModel(new String[] {"","Coca-Cola", "Pepsi", "Sprite"}));
		cb_sabor_refre.setSelectedIndex(0);
		cb_sabor_refre.setMaximumRowCount(3);
		cb_sabor_refre.setBounds(219, 157, 126, 22);
		panel_muestras.add(cb_sabor_refre);
		
		btn_confirmar = new JButton("Confirmar");
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String tam_palo;
				tam_palo =	cb_tamano_palo.getSelectedItem().toString();
//				System.out.println(tam_palo);
				
				String sab_palo;
				sab_palo =	cb_sabor_palo.getSelectedItem().toString();
//				System.out.println(sab_palo);
				
				String tam_refre;
				tam_refre =	cb_tamano_refre.getSelectedItem().toString();
//				System.out.println(tam_refre);
				
				
				String sab_refre;
				sab_refre =	cb_sabor_refre.getSelectedItem().toString();
//				System.out.println(sab_refre);
				
				
				
				//if(txt_cant_palo.getClass().getSimpleName()=="String") {
				//	JOptionPane.showMessageDialog(null, "ERROR CANTIDAD","error",JOptionPane.ERROR_MESSAGE);
				//}
				// String cant_palo2 = txt_cant_palo.getText();
				// String cant_refre2 = txt_cant_refre.getText();
				// System.out.println(cant_palo2.getClass().getSimpleName());
				//if(cant_palo2.inde = true ) {
				//	JOptionPane.showMessageDialog(null, "ERROR CANTIDAD","error",JOptionPane.ERROR_MESSAGE);
				//	return;
				//}
				
				
			     int cant_palo = Integer.parseInt(txt_cant_palo.getText()) ;
			     int cant_refre =  Integer.parseInt(txt_cant_refre.getText()) ;
			     
			     
			     if (cant_palo<0) {
			    	 JOptionPane.showMessageDialog(null, "NUMERO ERRONEO","error",JOptionPane.ERROR_MESSAGE);
			    	 return;
			     }else if (cant_palo==0) {
			    	 
			     }else {
			    	 
			    		if (tam_palo.equals("")) {
							JOptionPane.showMessageDialog(null, "No ingresaste el tamaño","error",JOptionPane.ERROR_MESSAGE);
							return;
						}else {
							if (sab_palo.equals("")) {
								JOptionPane.showMessageDialog(null, "Tienes que ingresar un sabor de palomitas","error",JOptionPane.ERROR_MESSAGE);
								return;
							}else {
								
								
								venta.put("combo", "default");
								
								
									
									
									if (tam_palo.equals("Chico")) {
										id = 1;
										prec_prd = 40;
									}else if (tam_palo.equals("Mediano")) {
										id = 2;
										prec_prd = 50;
									}else {
										id = 3;
										prec_prd = 70;
									}
									int x = 0;
									
									
									for (int i=0; i<productos.length();i++) {
										
										
										JSONObject prd = productos.getJSONObject(i);
										
										if (Integer.parseInt(prd.get("producto_id").toString())==id) {
//											System.out.println(prd.get("producto_id"));
											 x=1;
											 int cant =  Integer.parseInt(prd.get("cantidad").toString());
											 prd.put("cantidad", cant+cant_palo);
											 break;
										}
									}
									
									if (x==0) {
										JSONObject producto = new JSONObject();	
										producto.put("producto_id", id);
										producto.put("cantidad", cant_palo);
										productos.put(producto);
									}
									
									
								
								total = prec_prd * cant_palo;
								
								DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						       
								
								venta.put("productos", productos);
								venta.put("total", total);
								venta.put("fecha", dtf.format(LocalDateTime.now()));
								venta.put("empleado", 1);
								venta.put("cliente", "default");
							}
						}
			    	 
			    	 
			     }
			     
			     
			     if (cant_refre<0) {
			    	 JOptionPane.showMessageDialog(null, "NUMERO ERRONEO","error",JOptionPane.ERROR_MESSAGE);
			    	 return;
			     }else if (cant_refre==0) {
			    	 
			     }else {
			    	 
			    		if (tam_refre.equals("")) {
							JOptionPane.showMessageDialog(null, "No ingresaste el tamaño","error",JOptionPane.ERROR_MESSAGE);
							return;
						}else {
							if (sab_refre.equals("")) {
								JOptionPane.showMessageDialog(null, "Tienes que ingresar un sabor de palomitas","error",JOptionPane.ERROR_MESSAGE);
								return;
							}else {
								
								
								
								venta.put("combo", "default");
								
								
								
								
								if (tam_refre.equals("Chico")) {
									id = 4;
									prec_prd = 40;
								}else if (tam_refre.equals("Mediano")) {
									id = 5;
									prec_prd = 50;
								}else {
									id = 6;
									prec_prd = 70;
								}
								int x = 0;
								
								
								for (int i=0; i<productos.length();i++) {
									
									
									JSONObject prd = productos.getJSONObject(i);
									
									if (Integer.parseInt(prd.get("producto_id").toString())==id) {
//										System.out.println(prd.get("producto_id"));
										 x=1;
										 int cant =  Integer.parseInt(prd.get("cantidad").toString());
										 prd.put("cantidad", cant+cant_refre);
										 break;
									}
								}
								
								if (x==0) {
									JSONObject producto = new JSONObject();	
									producto.put("producto_id", id);
									producto.put("cantidad", cant_refre);
									productos.put(producto);
								}
								
								
							
							total = prec_prd * cant_refre;
							
							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
					       
							
							venta.put("productos", productos);
							venta.put("total", total);
							venta.put("fecha", dtf.format(LocalDateTime.now()));
							venta.put("empleado", 1);
							venta.put("cliente", "default");
								
							}
						}
			    	 
			    	 
			     }
			     
			     cb_tamano_palo.setSelectedIndex(0);
			     cb_sabor_palo.setSelectedIndex(0);
			     cb_tamano_refre.setSelectedIndex(0);
			     cb_sabor_refre.setSelectedIndex(0);
			     txt_cant_palo.setText("0");
			     txt_cant_refre.setText("0");
			     
				//usr.productos();
//				System.out.println(venta);
				
			}
		});
		btn_confirmar.setForeground(Color.white);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		btn_confirmar.setBounds(353, 385, 88, 39);
		panel_muestras.add(btn_confirmar);
		
		txt_cant_palo = new JTextField();
		txt_cant_palo.setText("0");
		txt_cant_palo.setBounds(355, 63, 86, 20);
		panel_muestras.add(txt_cant_palo);
		txt_cant_palo.setColumns(10);
		
		txt_cant_refre = new JTextField();
		txt_cant_refre.setText("0");
		txt_cant_refre.setBounds(355, 159, 86, 20);
		panel_muestras.add(txt_cant_refre);
		txt_cant_refre.setColumns(10);
		
		lblNewLabel = new JLabel("Tamaño");
		lblNewLabel.setBounds(122, 37, 46, 14);
		panel_muestras.add(lblNewLabel);
		
		lblSabor = new JLabel("Sabor");
		lblSabor.setBounds(250, 37, 46, 14);
		panel_muestras.add(lblSabor);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(372, 37, 46, 14);
		panel_muestras.add(lblCantidad);
		
		btn_combo_1 = new JButton("Combo Primos");
		btn_combo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int x = 0;
				
				for (int i=0; i<combos.length();i++) {
				 JSONObject prd = combos.getJSONObject(i);
				if (Integer.parseInt(prd.get("combo_id").toString())==1) {
    				System.out.println(prd.get("combo_id"));
					 x=1;
					 int cant =  Integer.parseInt(prd.get("cantidad").toString());
					 prd.put("cantidad", cant+1);
					 break;
				}
				}
				
				
				if (x==0) {
					JSONObject cmb = new JSONObject();
				    cmb.put("combo_id", 1);
				    cmb.put("cantidad", 1);
				    combos.put(cmb);
				    venta.put("total",218);
				}
				
				
			    
				
			    
				if (productos.length()<=0){
					venta.put("productos", "default");	
				}
				
				
				 int prec =  Integer.parseInt(venta.get("total").toString());
				 venta.put("total", prec+218);
				 
				 
				 venta.put("combo",combos);
				 
				
			}
		});
		btn_combo_1.setForeground(Color.WHITE);
		btn_combo_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_1.setBorder(null);
		btn_combo_1.setBackground(new Color(53, 53, 53));
		btn_combo_1.setBounds(47, 76, 162, 92);
		panel_muestras.add(btn_combo_1);
		
		btn_combo_2 = new JButton("Combo 2");
		btn_combo_2.setForeground(Color.WHITE);
		btn_combo_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_2.setBorder(null);
		btn_combo_2.setBackground(new Color(53, 53, 53));
		btn_combo_2.setBounds(256, 76, 162, 92);
		panel_muestras.add(btn_combo_2);
		
		btn_combo_3 = new JButton("Combo 3");
		btn_combo_3.setForeground(Color.WHITE);
		btn_combo_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_3.setBorder(null);
		btn_combo_3.setBackground(new Color(53, 53, 53));
		btn_combo_3.setBounds(47, 235, 162, 92);
		panel_muestras.add(btn_combo_3);
		
		btn_combo_4 = new JButton("Combo 4");
		btn_combo_4.setForeground(Color.WHITE);
		btn_combo_4.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_4.setBorder(null);
		btn_combo_4.setBackground(new Color(53, 53, 53));
		btn_combo_4.setBounds(256, 235, 162, 92);
		panel_muestras.add(btn_combo_4);
		
		
		lbl_dulces = new JLabel("Dulces");
		lbl_dulces.setBounds(68, 115, 46, 14);
		panel_muestras.add(lbl_dulces);
		
		lbl_comidas = new JLabel("Comidas");
		lbl_comidas.setBounds(68, 231, 46, 14);
		panel_muestras.add(lbl_comidas);
		
		
		comobo_dulces_extra.setModel(new DefaultComboBoxModel(new String[] {"", "Tostitos", "Galletas emperador", "Skwinkles"}));
		comobo_dulces_extra.setBounds(160, 111, 155, 22);
		panel_muestras.add(comobo_dulces_extra);
		
		
		comobo_comida_extra.setModel(new DefaultComboBoxModel(new String[] {"", "Nachos", "Torta", "Pizza"}));
		comobo_comida_extra.setBounds(160, 235, 155, 22);
		panel_muestras.add(comobo_comida_extra);
		
		cant_dulces = new JTextField();
		cant_dulces.setText("0");
		cant_dulces.setBounds(353, 112, 86, 20);
		panel_muestras.add(cant_dulces);
		cant_dulces.setColumns(10);
		
		cant_comida = new JTextField();
		cant_comida.setText("0");
		cant_comida.setColumns(10);
		cant_comida.setBounds(355, 235, 86, 20);
		panel_muestras.add(cant_comida);
		
		lblNewLabel_ext_1 = new JLabel("Producto");
		lblNewLabel_ext_1.setBounds(196, 51, 71, 14);
		panel_muestras.add(lblNewLabel_ext_1);
		
		lblNewLabel_ext_2 = new JLabel("Cantidad");
		lblNewLabel_ext_2.setBounds(372, 51, 56, 14);
		panel_muestras.add(lblNewLabel_ext_2);
		
		btn_confirmar_2_ext = new JButton("Confirmar");
		btn_confirmar_2_ext.setForeground(Color.WHITE);
		btn_confirmar_2_ext.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar_2_ext.setBorder(null);
		btn_confirmar_2_ext.setBackground(new Color(53, 53, 53));
		btn_confirmar_2_ext.setBounds(353, 385, 88, 39);
		panel_muestras.add(btn_confirmar_2_ext);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 105, 378, 435);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JLabel lbl_total = new JLabel("Total: $");
		lbl_total.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_total.setBounds(22, 410, 59, 14);
		panel_resumen.add(lbl_total);
		
		JButton btn_confirmar_1 = new JButton("Realizar venta");
		btn_confirmar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funciones_get_put usr = new funciones_get_put();
				venta.put("total", total);
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				venta.put("fecha", dtf.format(LocalDateTime.now()));
				venta.put("empleado", 1);
				venta.put("cliente", "default");
				
				System.out.println(venta);
				funciones_get_put.ventaProductos(venta);
			}
		});
		btn_confirmar_1.setForeground(Color.WHITE);
		btn_confirmar_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar_1.setBorder(null);
		btn_confirmar_1.setBackground(new Color(53, 53, 53));
		btn_confirmar_1.setBounds(280, 385, 88, 39);
		panel_resumen.add(btn_confirmar_1);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
	}
}
