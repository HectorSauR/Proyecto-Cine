package PaginasCine;

import clases.CVentasProducto;

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
	CVentasProducto venta = new CVentasProducto();

	// Individual
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

	// Combo
	static JButton btn_combo_1;
	static JButton btn_combo_2;
	static JButton btn_combo_3;
	static JButton btn_combo_4;

	// extras
	static JLabel lbl_dulces;
	static JLabel lbl_comidas;
	final static JComboBox comobo_dulces_extra = new JComboBox();
	final static JComboBox comobo_comida_extra = new JComboBox();
	static JTextField cant_dulces;
	static JTextField cant_comida;
	static JButton btn_confirmar_2_ext;
	static JLabel lblNewLabel_ext_1;
	static JLabel lblNewLabel_ext_2;

	
	//Resumen
	JLabel chicas_cant_1;
	JLabel chicas_cant_2;
	JLabel chicas_cant_3;
	
	JLabel medianas_cant_1;
	JLabel medianas_cant_2;
	JLabel medianas_cant_3;
	
	JLabel grandes_cant_1;
	JLabel grandes_cant_2;
	JLabel grandes_cant_3;
	
	JLabel chicas_cant_3_r;
	JLabel chicas_cant_2_r;
	JLabel chicas_cant_1_r;
	
	JLabel medianas_cant_1_r;
	JLabel medianas_cant_2_r;
	JLabel medianas_cant_3_r;
	
	JLabel grandes_cant_1_r; 
	JLabel grandes_cant_2_r; 
	JLabel grandes_cant_3_r; 
	
	JLabel dulce_1;
	JLabel dulce_2;
	JLabel dulce_3;
	
	JLabel comida_1;
	JLabel comida_2;
	JLabel comida_3;
	
	JLabel combo_1;
	JLabel combo_2;
	JLabel combo_3;
	JLabel combo_4;
	
	JLabel total_ven;
	
	int id = 0;
	float prec_prd = 0;
	float total = 0;
	
	int cant_c1 = 0;
	int cant_c2 = 0;
	int cant_c3 = 0;
    int cant_c4 = 0;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// PrincipalPagina window = new PrincipalPagina();
	// window.frmCinema.setVisible(true);
	// btn_combo_1.setVisible(false);
	// btn_combo_2.setVisible(false);
	// btn_combo_3.setVisible(false);
	// btn_combo_4.setVisible(false);
	//
	//
	//
	// lbl_dulces.setVisible(false);
	// lbl_comidas.setVisible(false);
	// comobo_dulces_extra.setVisible(false);
	// comobo_comida_extra.setVisible(false);
	// cant_dulces.setVisible(false);
	// cant_comida.setVisible(false);
	// btn_confirmar_2_ext.setVisible(false);
	// lblNewLabel_ext_1.setVisible(false);
	// lblNewLabel_ext_2.setVisible(false);
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	//
	// }
	// });
	// }

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
	 * REALMENTE ES LA VISTA DE LAS VENTAS, NO ES LA PAGINA PRINCIPAL, HACER RENAME
	 * O DEJARLO DE EST� MANERA
	 */

	/**
	 * Create the application.
	 */
	public PrincipalPagina() {
		initialize();
		run();
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
				cb_tamano_palo.setVisible(true);
				cb_sabor_palo.setVisible(true);
				lbl_refresco.setVisible(true);
				cb_tamano_refre.setVisible(true);
				cb_sabor_refre.setVisible(true);
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
				cb_tamano_palo.setVisible(false);
				cb_sabor_palo.setVisible(false);
				lbl_refresco.setVisible(false);
				cb_tamano_refre.setVisible(false);
				cb_sabor_refre.setVisible(false);
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
				cb_tamano_palo.setVisible(false);
				cb_sabor_palo.setVisible(false);
				lbl_refresco.setVisible(false);
				cb_tamano_refre.setVisible(false);
				cb_sabor_refre.setVisible(false);
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
		cb_tamano_palo.setModel(new DefaultComboBoxModel(new String[] { "", "Chico", "Mediano", "Grande" }));
		cb_tamano_palo.setSelectedIndex(0);
		cb_tamano_palo.setBounds(83, 62, 126, 22);
		panel_muestras.add(cb_tamano_palo);

		cb_sabor_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_palo.setToolTipText("");
		cb_sabor_palo.setModel(new DefaultComboBoxModel(new String[] { "", "Mantequilla", "Takis", "Caramelo" }));
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
		cb_tamano_refre.setModel(new DefaultComboBoxModel(new String[] { "", "Chico", "Mediano", "Grande" }));
		cb_tamano_refre.setSelectedIndex(0);
		cb_tamano_refre.setMaximumRowCount(3);
		cb_tamano_refre.setBounds(83, 157, 126, 22);
		panel_muestras.add(cb_tamano_refre);

		cb_sabor_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_refre.setToolTipText("");
		cb_sabor_refre.setModel(new DefaultComboBoxModel(new String[] { "", "Coca-Cola", "Pepsi", "Sprite" }));
		cb_sabor_refre.setSelectedIndex(0);
		cb_sabor_refre.setMaximumRowCount(3);
		cb_sabor_refre.setBounds(219, 157, 126, 22);
		panel_muestras.add(cb_sabor_refre);

		btn_confirmar = new JButton("Confirmar");
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String tam_palo;
				tam_palo = cb_tamano_palo.getSelectedItem().toString();
				// System.out.println(tam_palo);

				String sab_palo;
				sab_palo = cb_sabor_palo.getSelectedItem().toString();
				// System.out.println(sab_palo);

				String tam_refre;
				tam_refre = cb_tamano_refre.getSelectedItem().toString();
				// System.out.println(tam_refre);

				String sab_refre;
				sab_refre = cb_sabor_refre.getSelectedItem().toString();
				// System.out.println(sab_refre);

				int cant_palo = Integer.parseInt(txt_cant_palo.getText());
				int cant_refre = Integer.parseInt(txt_cant_refre.getText());

				if (cant_palo < 0) {
					JOptionPane.showMessageDialog(null, "NUMERO ERRONEO", "error", JOptionPane.ERROR_MESSAGE);
					return;
				} else if (cant_palo == 0) {

				} else {

					if (tam_palo.equals("")) {
						JOptionPane.showMessageDialog(null, "No ingresaste el tamaño", "error",
								JOptionPane.ERROR_MESSAGE);
						return;
					} else {
						if (sab_palo.equals("")) {
							JOptionPane.showMessageDialog(null, "Tienes que ingresar un sabor de palomitas", "error",
									JOptionPane.ERROR_MESSAGE);
							return;
						} else {

							if (tam_palo.equals("Chico")) {
								id = 1;
								prec_prd = 40;
								
								
							} else if (tam_palo.equals("Mediano")) {
								id = 2;
								prec_prd = 50;
							} else {
								id = 3;
								prec_prd = 70;
							}

							
						//resumen palomitas	
							if (tam_palo.equals("Chico")) {
								
								if (sab_palo.equals("Mantequilla")) {
									chicas_cant_1.setText(txt_cant_palo.getText());
									
									
								} else if (sab_palo.equals("Takis")) {
									chicas_cant_2.setText(txt_cant_palo.getText());
								} else {
									chicas_cant_3.setText(txt_cant_palo.getText());
								}
								
							} else if (tam_palo.equals("Mediano")) {
								if (sab_palo.equals("Mantequilla")) {
									medianas_cant_1.setText(txt_cant_palo.getText());
									
									
								} else if (sab_palo.equals("Takis")) {
									medianas_cant_2.setText(txt_cant_palo.getText());
								} else {
									medianas_cant_3.setText(txt_cant_palo.getText());
								}
							} else {
								
								if (sab_palo.equals("Mantequilla")) {
									grandes_cant_1.setText(txt_cant_palo.getText());
									
									
								} else if (sab_palo.equals("Takis")) {
									grandes_cant_2.setText(txt_cant_palo.getText());
								} else {
									grandes_cant_3.setText(txt_cant_palo.getText());
								}
								
							}


							//resumen refrescos
							if (tam_refre.equals("Chico")) {
								
								if (sab_refre.equals("Coca-Cola")) {
									chicas_cant_1_r.setText(txt_cant_refre.getText());
									
									
								} else if (sab_refre.equals("Pepsi")) {
									chicas_cant_2_r.setText(txt_cant_refre.getText());
								} else {
									chicas_cant_3_r.setText(txt_cant_refre.getText());
								}
								
							} else if (tam_refre.equals("Mediano")) {
								if (sab_refre.equals("Mantequilla")) {
									medianas_cant_1_r.setText(txt_cant_refre.getText());
									
									
								} else if (sab_refre.equals("Takis")) {
									medianas_cant_2_r.setText(txt_cant_refre.getText());
								} else {
									medianas_cant_3_r.setText(txt_cant_refre.getText());
								}
							} else {
								
								if (sab_refre.equals("Mantequilla")) {
									grandes_cant_1_r.setText(txt_cant_refre.getText());
									
								} else if (sab_refre.equals("Takis")) {
									grandes_cant_2_r.setText(txt_cant_refre.getText());
								} else {
									grandes_cant_3_r.setText(txt_cant_refre.getText());
								}
								
							}
							
							

							total += prec_prd * cant_palo;
							venta.agregarProducto(id, cant_palo);

						}
					}

				}

				if (cant_refre < 0) {
					JOptionPane.showMessageDialog(null, "NUMERO ERRONEO", "error", JOptionPane.ERROR_MESSAGE);
					return;
				} else if (cant_refre == 0) {

				} else {

					if (tam_refre.equals("")) {
						JOptionPane.showMessageDialog(null, "No ingresaste el tamaño", "error",
								JOptionPane.ERROR_MESSAGE);
						return;
					} else {
						if (sab_refre.equals("")) {
							JOptionPane.showMessageDialog(null, "Tienes que ingresar un sabor de palomitas", "error",
									JOptionPane.ERROR_MESSAGE);
							return;
						} else {

							if (tam_refre.equals("Chico")) {
								id = 4;
								prec_prd = 40;
							} else if (tam_refre.equals("Mediano")) {
								id = 5;
								prec_prd = 50;
							} else {
								id = 6;
								prec_prd = 70;
							}

							total += prec_prd * cant_refre;
							venta.agregarProducto(id, cant_refre);

						}
					}

				}

				cb_tamano_palo.setSelectedIndex(0);
				cb_sabor_palo.setSelectedIndex(0);
				cb_tamano_refre.setSelectedIndex(0);
				cb_sabor_refre.setSelectedIndex(0);
				txt_cant_palo.setText("0");
				txt_cant_refre.setText("0");

				// usr.productos();
				// System.out.println(venta);
				
				total_ven.setText(Float.toString(total));

			}
		});
		btn_confirmar.setForeground(Color.white);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		btn_confirmar.setBounds(257, 385, 88, 39);
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

		btn_combo_1 = new JButton("Combo cuates");
		
		btn_combo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venta.agregarCombo(1, 1);
				total += 220;
				
				cant_c1 += 1;
				
				combo_1.setText(Integer.toString(cant_c1));
				
				total_ven.setText(Float.toString(total));
				
			}
		});
		btn_combo_1.setForeground(Color.WHITE);
		btn_combo_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_1.setBorder(null);
		btn_combo_1.setBackground(new Color(53, 53, 53));
		btn_combo_1.setBounds(47, 76, 162, 92);
		panel_muestras.add(btn_combo_1);

		btn_combo_2 = new JButton("Combo Piñata");
		btn_combo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venta.agregarCombo(2, 1);
				total += 218;
				
				cant_c2 += 1;
				
				combo_2.setText(Integer.toString(cant_c2));
				total_ven.setText(Float.toString(total));
			}
		});
		btn_combo_2.setForeground(Color.WHITE);
		btn_combo_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_2.setBorder(null);
		btn_combo_2.setBackground(new Color(53, 53, 53));
		btn_combo_2.setBounds(256, 76, 162, 92);
		panel_muestras.add(btn_combo_2);

		btn_combo_3 = new JButton("Combo Fiesta");
		btn_combo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venta.agregarCombo(3, 1);
				total += 400;
				
				
				cant_c3+= 1;
				
				combo_3.setText(Integer.toString(cant_c3));
				
				total_ven.setText(Float.toString(total));
			}
		});
		btn_combo_3.setForeground(Color.WHITE);
		btn_combo_3.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_combo_3.setBorder(null);
		btn_combo_3.setBackground(new Color(53, 53, 53));
		btn_combo_3.setBounds(47, 235, 162, 92);
		panel_muestras.add(btn_combo_3);

		btn_combo_4 = new JButton("Combo Triston");
		btn_combo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venta.agregarCombo(4, 1);
				total += 80;
				
				cant_c4 += 1;
				
				combo_4.setText(Integer.toString(cant_c4));
				
				total_ven.setText(Float.toString(total));
			}
		});
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

		comobo_dulces_extra
				.setModel(new DefaultComboBoxModel(new String[] { "", "tostitos", "galletas", "skwinkles" }));
		comobo_dulces_extra.setBounds(160, 111, 155, 22);
		panel_muestras.add(comobo_dulces_extra);

		comobo_comida_extra.setModel(new DefaultComboBoxModel(new String[] { "", "nachos", "torta", "pizza" }));
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
		btn_confirmar_2_ext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String dulce;
				dulce = comobo_dulces_extra.getSelectedItem().toString();
				// System.out.println(tam_palo);

				String comida;
				comida = comobo_comida_extra.getSelectedItem().toString();
				// System.out.println(tam_refre);

				// if(txt_cant_palo.getClass().getSimpleName()=="String") {
				// JOptionPane.showMessageDialog(null, "ERROR
				// CANTIDAD","error",JOptionPane.ERROR_MESSAGE);
				// }
				// String cant_palo2 = txt_cant_palo.getText();
				// String cant_refre2 = txt_cant_refre.getText();
				// System.out.println(cant_palo2.getClass().getSimpleName());
				// if(cant_palo2.inde = true ) {
				// JOptionPane.showMessageDialog(null, "ERROR
				// CANTIDAD","error",JOptionPane.ERROR_MESSAGE);
				// return;
				// }

				int cant_dulce = Integer.parseInt(cant_dulces.getText());
				int cant_c = Integer.parseInt(cant_comida.getText());

				if (cant_dulce < 0) {
					JOptionPane.showMessageDialog(null, "NUMERO ERRONEO", "error", JOptionPane.ERROR_MESSAGE);
					return;
				} else if (cant_dulce == 0) {

				} else {

					if (dulce.equals("")) {
						JOptionPane.showMessageDialog(null, "No ingresaste el dulce", "error",
								JOptionPane.ERROR_MESSAGE);
						return;
					} else {

						if (dulce.equals("tostitos")) {
							id = 7;
							prec_prd = 20;
							dulce_1.setText(Integer.toString(cant_dulce));
							
						} else if (dulce.equals("galletas")) {
							id = 8;
							prec_prd = 15;
							dulce_2.setText(Integer.toString(cant_dulce));
						} else {
							id = 9;
							prec_prd = 25;
							dulce_3.setText(Integer.toString(cant_dulce));
						}

						total += prec_prd * cant_dulce;
						venta.agregarProducto(id, cant_dulce);


					}

					if (cant_c < 0) {
						JOptionPane.showMessageDialog(null, "NUMERO ERRONEO", "error", JOptionPane.ERROR_MESSAGE);
						return;
					} else if (cant_c == 0) {

					} else {

						if (comida.equals("")) {
							JOptionPane.showMessageDialog(null, "No ingresaste la comida", "error",
									JOptionPane.ERROR_MESSAGE);
							return;
						} else {

							if (comida.equals("nachos")) {
								id = 10;
								prec_prd = 70;
								comida_1.setText(Integer.toString(cant_c));
							} else if (comida.equals("torta")) {
								id = 11;
								prec_prd = 55;
								comida_2.setText(Integer.toString(cant_c));
							} else {
								id = 12;
								prec_prd = 120;
								comida_3.setText(Integer.toString(cant_c));
							}

							total += prec_prd * cant_c;
							venta.agregarProducto(id, cant_c);

							
						}

					}

				}

				System.out.println(venta);

				comobo_dulces_extra.setSelectedIndex(0);
				comobo_comida_extra.setSelectedIndex(0);
				cant_dulces.setText("0");
				cant_comida.setText("0");

				
				total_ven.setText(Float.toString(total));
			}

		});

		btn_confirmar_2_ext.setForeground(Color.WHITE);
		btn_confirmar_2_ext.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar_2_ext.setBorder(null);
		btn_confirmar_2_ext.setBackground(new Color(53, 53, 53));
		btn_confirmar_2_ext.setBounds(353, 385, 88, 39);
		panel_muestras.add(btn_confirmar_2_ext);

		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(524, 105, 484, 435);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);

		JLabel lbl_total = new JLabel("Total: $");
		lbl_total.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_total.setBounds(22, 410, 50, 14);
		panel_resumen.add(lbl_total);

		JButton btn_confirmar_1 = new JButton("Realizar venta");
		btn_confirmar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JSONObject conf = venta.generarVenta(total,1); 

				funciones_get_put.ventaProductos(conf);
				
				venta = new CVentasProducto();
				total = 0;
				
				chicas_cant_1.setText("0");
				chicas_cant_2.setText("0");
				chicas_cant_3.setText("0");
				
				medianas_cant_1.setText("0");
				medianas_cant_2.setText("0");
				medianas_cant_3.setText("0");
				
				grandes_cant_1.setText("0");
				grandes_cant_2.setText("0");
				grandes_cant_3.setText("0");
				
				chicas_cant_3_r.setText("0");
				chicas_cant_2_r.setText("0");
				chicas_cant_1_r.setText("0");
				
				medianas_cant_1_r.setText("0");
				medianas_cant_2_r.setText("0");
				medianas_cant_3_r.setText("0");
				
				grandes_cant_1_r.setText("0"); 
				grandes_cant_2_r.setText("0"); 
				grandes_cant_3_r.setText("0"); 
				
				dulce_1.setText("0");
				dulce_2.setText("0");
				dulce_3.setText("0");
				
				comida_1.setText("0");
				comida_2.setText("0");
				comida_3.setText("0");
				
				combo_1.setText("0");
				combo_2.setText("0");
				combo_3.setText("0");
				combo_4.setText("0");
				
				total_ven.setText("0");


			}
		});
		btn_confirmar_1.setForeground(Color.WHITE);
		btn_confirmar_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar_1.setBorder(null);
		btn_confirmar_1.setBackground(new Color(53, 53, 53));
		btn_confirmar_1.setBounds(369, 385, 88, 39);
		panel_resumen.add(btn_confirmar_1);
		
		JLabel lblNewLabel_r = new JLabel("Mantequilla");
		lblNewLabel_r.setBounds(22, 58, 73, 14);
		panel_resumen.add(lblNewLabel_r);
		
		JLabel lblNewLabel_r_1 = new JLabel("Taquis");
		lblNewLabel_r_1.setBounds(32, 81, 59, 14);
		panel_resumen.add(lblNewLabel_r_1);
		
		JLabel lblNewLabel_r_2 = new JLabel("Caramelo");
		lblNewLabel_r_2.setBounds(22, 106, 73, 14);
		panel_resumen.add(lblNewLabel_r_2);
		
		JLabel lblNewLabel_r_9 = new JLabel("PALOMITAS ");
		lblNewLabel_r_9.setForeground(Color.YELLOW);
		lblNewLabel_r_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_r_9.setBounds(22, 11, 107, 14);
		panel_resumen.add(lblNewLabel_r_9);
		
		JLabel lblNewLabel_r_10 = new JLabel("Chicas");
		lblNewLabel_r_10.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_10.setBounds(37, 33, 107, 14);
		panel_resumen.add(lblNewLabel_r_10);
		
		JLabel lblNewLabel_r_10_1 = new JLabel("Medianas");
		lblNewLabel_r_10_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_10_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_10_1.setBounds(37, 131, 107, 14);
		panel_resumen.add(lblNewLabel_r_10_1);
		
		JLabel lblNewLabel_r_11 = new JLabel("Grandes");
		lblNewLabel_r_11.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_11.setBounds(32, 233, 107, 14);
		panel_resumen.add(lblNewLabel_r_11);
		
		JLabel lblNewLabel_r_2_1 = new JLabel("Caramelo");
		lblNewLabel_r_2_1.setBounds(22, 208, 72, 14);
		panel_resumen.add(lblNewLabel_r_2_1);
		
		JLabel lblNewLabel_r_1_1 = new JLabel("Taquis");
		lblNewLabel_r_1_1.setBounds(22, 183, 72, 14);
		panel_resumen.add(lblNewLabel_r_1_1);
		
		JLabel lblNewLabel_r_3 = new JLabel("Mantequilla");
		lblNewLabel_r_3.setBounds(22, 160, 72, 14);
		panel_resumen.add(lblNewLabel_r_3);
		
		JLabel lblNewLabel_r_2_2 = new JLabel("Caramelo");
		lblNewLabel_r_2_2.setBounds(22, 306, 72, 14);
		panel_resumen.add(lblNewLabel_r_2_2);
		
		JLabel lblNewLabel_r_1_2 = new JLabel("Taquis");
		lblNewLabel_r_1_2.setBounds(22, 281, 72, 14);
		panel_resumen.add(lblNewLabel_r_1_2);
		
		JLabel lblNewLabel_r_4 = new JLabel("Mantequilla");
		lblNewLabel_r_4.setBounds(22, 258, 72, 14);
		panel_resumen.add(lblNewLabel_r_4);
		
		chicas_cant_1 = new JLabel("0");
		chicas_cant_1.setBounds(104, 58, 29, 14);
		panel_resumen.add(chicas_cant_1);
		
		chicas_cant_2 = new JLabel("0");
		chicas_cant_2.setBounds(104, 83, 29, 14);
		panel_resumen.add(chicas_cant_2);
		
		chicas_cant_3 = new JLabel("0");
		chicas_cant_3.setBounds(104, 106, 29, 14);
		panel_resumen.add(chicas_cant_3);
		
		medianas_cant_3 = new JLabel("0");
		medianas_cant_3.setBounds(104, 204, 29, 14);
		panel_resumen.add(medianas_cant_3);
		
		medianas_cant_2 = new JLabel("0");
		medianas_cant_2.setBounds(104, 181, 29, 14);
		panel_resumen.add(medianas_cant_2);
		
		 medianas_cant_1 = new JLabel("0");
		medianas_cant_1.setBounds(104, 156, 29, 14);
		panel_resumen.add(medianas_cant_1);
		
		grandes_cant_3 = new JLabel("0");
		grandes_cant_3.setBounds(104, 306, 29, 14);
		panel_resumen.add(grandes_cant_3);
		
		grandes_cant_2 = new JLabel("0");
		grandes_cant_2.setBounds(104, 283, 29, 14);
		panel_resumen.add(grandes_cant_2);
		
		grandes_cant_1 = new JLabel("0");
		grandes_cant_1.setBounds(104, 258, 29, 14);
		panel_resumen.add(grandes_cant_1);
		
		JLabel lblNewLabel_r_10_2 = new JLabel("Chicas");
		lblNewLabel_r_10_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_10_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_10_2.setBounds(145, 33, 107, 14);
		panel_resumen.add(lblNewLabel_r_10_2);
		
		JLabel lblNewLabel_r_5 = new JLabel("Coca-Cola");
		lblNewLabel_r_5.setBounds(130, 58, 73, 14);
		panel_resumen.add(lblNewLabel_r_5);
		
		JLabel lblNewLabel_r_1_3 = new JLabel("Pepsi");
		lblNewLabel_r_1_3.setBounds(130, 81, 59, 14);
		panel_resumen.add(lblNewLabel_r_1_3);
		
		JLabel lblNewLabel_r_2_3 = new JLabel("Sprite");
		lblNewLabel_r_2_3.setBounds(130, 106, 73, 14);
		panel_resumen.add(lblNewLabel_r_2_3);
		
		JLabel lblNewLabel_r_10_1_1 = new JLabel("Medianas");
		lblNewLabel_r_10_1_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_10_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_10_1_1.setBounds(145, 131, 107, 14);
		panel_resumen.add(lblNewLabel_r_10_1_1);
		
		JLabel lblNewLabel_r_11_1 = new JLabel("Grandes");
		lblNewLabel_r_11_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_11_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_11_1.setBounds(140, 233, 107, 14);
		panel_resumen.add(lblNewLabel_r_11_1);
		
		chicas_cant_1_r = new JLabel("0");
		chicas_cant_1_r.setBounds(212, 58, 29, 14);
		panel_resumen.add(chicas_cant_1_r);
		
		chicas_cant_2_r = new JLabel("0");
		chicas_cant_2_r.setBounds(212, 83, 29, 14);
		panel_resumen.add(chicas_cant_2_r);
		
		chicas_cant_3_r = new JLabel("0");
		chicas_cant_3_r.setBounds(212, 106, 29, 14);
		panel_resumen.add(chicas_cant_3_r);
		
		medianas_cant_1_r = new JLabel("0");
		medianas_cant_1_r.setBounds(212, 156, 29, 14);
		panel_resumen.add(medianas_cant_1_r);
		
		medianas_cant_2_r = new JLabel("0");
		medianas_cant_2_r.setBounds(212, 181, 29, 14);
		panel_resumen.add(medianas_cant_2_r);
		
		medianas_cant_3_r = new JLabel("0");
		medianas_cant_3_r.setBounds(212, 204, 29, 14);
		panel_resumen.add(medianas_cant_3_r);
		
		grandes_cant_1_r = new JLabel("0");
		grandes_cant_1_r.setBounds(212, 258, 29, 14);
		panel_resumen.add(grandes_cant_1_r);
		
		grandes_cant_2_r = new JLabel("0");
		grandes_cant_2_r.setBounds(212, 283, 29, 14);
		panel_resumen.add(grandes_cant_2_r);
		
		grandes_cant_3_r = new JLabel("0");
		grandes_cant_3_r.setBounds(212, 306, 29, 14);
		panel_resumen.add(grandes_cant_3_r);
		
		JLabel lblNewLabel_r_9_1 = new JLabel("REFRESCO");
		lblNewLabel_r_9_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_r_9_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_r_9_1.setBounds(130, 13, 107, 14);
		panel_resumen.add(lblNewLabel_r_9_1);
		
		JLabel lblNewLabel_r_5_1 = new JLabel("Coca-Cola");
		lblNewLabel_r_5_1.setBounds(130, 156, 73, 14);
		panel_resumen.add(lblNewLabel_r_5_1);
		
		JLabel lblNewLabel_r_1_3_1 = new JLabel("Pepsi");
		lblNewLabel_r_1_3_1.setBounds(130, 179, 59, 14);
		panel_resumen.add(lblNewLabel_r_1_3_1);
		
		JLabel lblNewLabel_r_2_3_1 = new JLabel("Sprite");
		lblNewLabel_r_2_3_1.setBounds(130, 204, 73, 14);
		panel_resumen.add(lblNewLabel_r_2_3_1);
		
		JLabel lblNewLabel_r_5_2 = new JLabel("Coca-Cola");
		lblNewLabel_r_5_2.setBounds(130, 258, 73, 14);
		panel_resumen.add(lblNewLabel_r_5_2);
		
		JLabel lblNewLabel_r_1_3_2 = new JLabel("Pepsi");
		lblNewLabel_r_1_3_2.setBounds(130, 281, 59, 14);
		panel_resumen.add(lblNewLabel_r_1_3_2);
		
		JLabel lblNewLabel_r_2_3_2 = new JLabel("Sprite");
		lblNewLabel_r_2_3_2.setBounds(130, 306, 73, 14);
		panel_resumen.add(lblNewLabel_r_2_3_2);
		
		JLabel lblNewLabel_r_9_1_1 = new JLabel("EXTRAS");
		lblNewLabel_r_9_1_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_r_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_r_9_1_1.setBounds(248, 11, 107, 14);
		panel_resumen.add(lblNewLabel_r_9_1_1);
		
		JLabel lblNewLabel_r_10_2_1 = new JLabel("Dulces");
		lblNewLabel_r_10_2_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_10_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_10_2_1.setBounds(263, 31, 107, 14);
		panel_resumen.add(lblNewLabel_r_10_2_1);
		
		JLabel lblNewLabel_r_5_3 = new JLabel("Tostitos");
		lblNewLabel_r_5_3.setBounds(248, 56, 73, 14);
		panel_resumen.add(lblNewLabel_r_5_3);
		
		JLabel lblNewLabel_r_1_3_3 = new JLabel("Galletas");
		lblNewLabel_r_1_3_3.setBounds(248, 79, 59, 14);
		panel_resumen.add(lblNewLabel_r_1_3_3);
		
		JLabel lblNewLabel_r_2_3_3 = new JLabel("skwinkles");
		lblNewLabel_r_2_3_3.setBounds(248, 104, 73, 14);
		panel_resumen.add(lblNewLabel_r_2_3_3);
		
		dulce_1 = new JLabel("0");
		dulce_1.setBounds(330, 56, 29, 14);
		panel_resumen.add(dulce_1);
		
		dulce_2 = new JLabel("0");
		dulce_2.setBounds(330, 81, 29, 14);
		panel_resumen.add(dulce_2);
		
		dulce_3 = new JLabel("0");
		dulce_3.setBounds(330, 104, 29, 14);
		panel_resumen.add(dulce_3);
		
		JLabel lblNewLabel_r_10_1_1_1 = new JLabel("Comidas");
		lblNewLabel_r_10_1_1_1.setForeground(new Color(30, 144, 255));
		lblNewLabel_r_10_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_r_10_1_1_1.setBounds(263, 129, 107, 14);
		panel_resumen.add(lblNewLabel_r_10_1_1_1);
		
		JLabel lblNewLabel_r_5_1_1 = new JLabel("Nachos");
		lblNewLabel_r_5_1_1.setBounds(248, 154, 73, 14);
		panel_resumen.add(lblNewLabel_r_5_1_1);
		
		JLabel lblNewLabel_r_1_3_1_1 = new JLabel("Torta");
		lblNewLabel_r_1_3_1_1.setBounds(248, 177, 59, 14);
		panel_resumen.add(lblNewLabel_r_1_3_1_1);
		
		JLabel lblNewLabel_r_2_3_1_1 = new JLabel("Pizza");
		lblNewLabel_r_2_3_1_1.setBounds(248, 202, 73, 14);
		panel_resumen.add(lblNewLabel_r_2_3_1_1);
		
		comida_1 = new JLabel("0");
		comida_1.setBounds(330, 154, 29, 14);
		panel_resumen.add(comida_1);
		
		comida_2 = new JLabel("0");
		comida_2.setBounds(330, 179, 29, 14);
		panel_resumen.add(comida_2);
		
		comida_3 = new JLabel("0");
		comida_3.setBounds(330, 202, 29, 14);
		panel_resumen.add(comida_3);
		
		JLabel lblNewLabel_r_9_1_1_1 = new JLabel("COMBOS");
		lblNewLabel_r_9_1_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_r_9_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_r_9_1_1_1.setBounds(362, 11, 107, 14);
		panel_resumen.add(lblNewLabel_r_9_1_1_1);
		
		JLabel lblNewLabel_r_5_3_1 = new JLabel("Cuates");
		lblNewLabel_r_5_3_1.setBounds(362, 58, 73, 14);
		panel_resumen.add(lblNewLabel_r_5_3_1);
		
		JLabel lblNewLabel_r_1_3_3_1 = new JLabel("Piñata");
		lblNewLabel_r_1_3_3_1.setBounds(362, 81, 59, 14);
		panel_resumen.add(lblNewLabel_r_1_3_3_1);
		
		JLabel lblNewLabel_r_2_3_3_1 = new JLabel("Fiesta");
		lblNewLabel_r_2_3_3_1.setBounds(362, 106, 73, 14);
		panel_resumen.add(lblNewLabel_r_2_3_3_1);
		
		JLabel lblNewLabel_r_5_1_1_1 = new JLabel("Triston");
		lblNewLabel_r_5_1_1_1.setBounds(362, 131, 73, 14);
		panel_resumen.add(lblNewLabel_r_5_1_1_1);
		
		JLabel combo_1 = new JLabel("0");
		combo_1.setBounds(444, 58, 29, 14);
		panel_resumen.add(combo_1);
		
		JLabel combo_2 = new JLabel("0");
		combo_2.setBounds(444, 83, 29, 14);
		panel_resumen.add(combo_2);
		
		JLabel combo_3 = new JLabel("0");
		combo_3.setBounds(444, 106, 29, 14);
		panel_resumen.add(combo_3);
		
		JLabel combo_4 = new JLabel("0");
		combo_4.setBounds(445, 131, 29, 14);
		panel_resumen.add(combo_4);
		
		total_ven = new JLabel("");
		total_ven.setBounds(83, 410, 50, 14);
		panel_resumen.add(total_ven);

		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);

	}
}
