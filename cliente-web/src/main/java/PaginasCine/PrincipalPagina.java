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
	private JTextField txt_cant_palo;
	private JTextField txt_cant_refre;
	JSONObject venta = new JSONObject();	
	JSONArray productos = new JSONArray();
	
	int id = 0;
	float prec_prd = 0;
	float total=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalPagina window = new PrincipalPagina();
					window.frmCinema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 REALMENTE ES LA VISTA DE LAS VENTAS, NO ES LA PAGINA PRINCIPAL, HACER RENAME O DEJARLO DE EST� MANERA
	 */

	/**
	 * Create the application.
	 */
	public PrincipalPagina() {
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
		btn_individual.setForeground(new Color(255, 255, 255));
		btn_individual.setBorder(null);
		btn_individual.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_individual.setBounds(37, 48, 101, 46);
		btn_individual.setBackground(new Color(60, 110, 113));
		panel_general.add(btn_individual);
		
		JButton btn_combos = new JButton("Combos");
		btn_combos.setForeground(new Color(255, 255, 255));
		btn_combos.setBorder(null);
		btn_combos.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combos.setBounds(170, 48, 101, 46);
		btn_combos.setBackground(new Color(60, 110, 113));
		panel_general.add(btn_combos);
		
		JButton btn_extras = new JButton("Extras");
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
		
		JLabel lbl_palomitas = new JLabel("Palomitas");
		lbl_palomitas.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_palomitas.setForeground(Color.BLACK);
		lbl_palomitas.setBounds(10, 61, 65, 21);
		panel_muestras.add(lbl_palomitas);
		
		final JComboBox cb_tamano_palo = new JComboBox();
		cb_tamano_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_palo.setMaximumRowCount(3);
		cb_tamano_palo.setToolTipText("");
		cb_tamano_palo.setModel(new DefaultComboBoxModel(new String[] {"","Chico", "Mediano", "Grande"}));
		cb_tamano_palo.setSelectedIndex(0);
		cb_tamano_palo.setBounds(83, 60, 126, 22);
		panel_muestras.add(cb_tamano_palo);
		
		final JComboBox cb_sabor_palo = new JComboBox();
		cb_sabor_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_palo.setToolTipText("");
		cb_sabor_palo.setModel(new DefaultComboBoxModel(new String[] {"","Mantequilla", "Takis", "Caramelo"}));
		cb_sabor_palo.setSelectedIndex(0);
		cb_sabor_palo.setMaximumRowCount(3);
		cb_sabor_palo.setBounds(219, 60, 126, 22);
		panel_muestras.add(cb_sabor_palo);
		
		JLabel lbl_refresco = new JLabel("Refresco");
		lbl_refresco.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_refresco.setForeground(Color.BLACK);
		lbl_refresco.setBounds(10, 156, 65, 21);
		panel_muestras.add(lbl_refresco);
		
		final JComboBox cb_tamano_refre = new JComboBox();
		cb_tamano_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_refre.setToolTipText("");
		
		
		cb_tamano_refre.setModel(new DefaultComboBoxModel(new String[] {"","Chico", "Mediano", "Grande"}));
		cb_tamano_refre.setSelectedIndex(0);
		cb_tamano_refre.setMaximumRowCount(3);
		cb_tamano_refre.setBounds(83, 155, 126, 22);
		panel_muestras.add(cb_tamano_refre);
		
		final JComboBox cb_sabor_refre = new JComboBox();
		cb_sabor_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_refre.setToolTipText("");
		cb_sabor_refre.setModel(new DefaultComboBoxModel(new String[] {"","Coca-Cola", "Pepsi", "Sprite"}));
		cb_sabor_refre.setSelectedIndex(0);
		cb_sabor_refre.setMaximumRowCount(3);
		cb_sabor_refre.setBounds(219, 155, 126, 22);
		panel_muestras.add(cb_sabor_refre);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String tam_palo;
				tam_palo =	cb_tamano_palo.getSelectedItem().toString();
				System.out.println(tam_palo);
				
				String sab_palo;
				sab_palo =	cb_sabor_palo.getSelectedItem().toString();
				System.out.println(sab_palo);
				
				String tam_refre;
				tam_refre =	cb_tamano_refre.getSelectedItem().toString();
				System.out.println(tam_refre);
				
				
				String sab_refre;
				sab_refre =	cb_sabor_refre.getSelectedItem().toString();
				System.out.println(sab_refre);
				
				
				
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
											System.out.println(prd.get("producto_id"));
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
										System.out.println(prd.get("producto_id"));
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
				System.out.println(venta);
				
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
		txt_cant_palo.setBounds(355, 61, 86, 20);
		panel_muestras.add(txt_cant_palo);
		txt_cant_palo.setColumns(10);
		
		txt_cant_refre = new JTextField();
		txt_cant_refre.setText("0");
		txt_cant_refre.setBounds(355, 157, 86, 20);
		panel_muestras.add(txt_cant_refre);
		txt_cant_refre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Tamaño");
		lblNewLabel.setBounds(122, 35, 46, 14);
		panel_muestras.add(lblNewLabel);
		
		JLabel lblSabor = new JLabel("Sabor");
		lblSabor.setBounds(250, 35, 46, 14);
		panel_muestras.add(lblSabor);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(372, 35, 46, 14);
		panel_muestras.add(lblCantidad);
		
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
