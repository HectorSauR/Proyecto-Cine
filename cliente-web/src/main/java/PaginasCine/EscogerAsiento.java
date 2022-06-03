package PaginasCine;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class EscogerAsiento {

	public JFrame frame;
	private VistaBoletos anterior;
    public int cont_a = 0;
    public String asientos_cadena ="";
    public int npa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaBoletos blt = new VistaBoletos();
					EscogerAsiento window = new EscogerAsiento(blt);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EscogerAsiento(VistaBoletos ventana) {
		initialize();
		anterior = ventana;
	}
	
	
//	public EscogerAsiento(int np, String nps) {
//		
//	 this.npa = np;
//	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 870, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_general = new JPanel();
		panel_general.setBackground(new Color(217, 217, 217));
		panel_general.setBounds(10, 0, 870, 650);
		frame.getContentPane().add(panel_general);
		panel_general.setLayout(null);
		
		JPanel panel_asientos = new JPanel();
		panel_asientos.setBounds(145, 89, 573, 408);
		panel_general.add(panel_asientos);
		panel_asientos.setLayout(null);
		panel_asientos.setBackground(new Color(217, 217, 217));
		
		

		final JComboBox cb_cant_asiento = new JComboBox();
		cb_cant_asiento.setMaximumRowCount(6);
		cb_cant_asiento.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5"}));
		cb_cant_asiento.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_cant_asiento.setBounds(155, 32, 76, 22);
		panel_general.add(cb_cant_asiento);
		
		
		
		final JMenuItem menu_asiento_libre_1 = new JMenuItem("");
		menu_asiento_libre_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("1A");
					menu_asiento_libre_1.setEnabled(false);
					menu_asiento_libre_1.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
				
				
				
			}
		});
		
		menu_asiento_libre_1.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_1.setBounds(35, 33, 51, 42);
		menu_asiento_libre_1.setBackground(new Color(217, 217, 217));
		panel_asientos.add(menu_asiento_libre_1);
		
		final JMenuItem menu_asiento_libre_2 = new JMenuItem("");
		menu_asiento_libre_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;
				
				
				if (cont_asientos(cant) == true) {
					nom_asientos("2A");
					menu_asiento_libre_2.setEnabled(false);
					menu_asiento_libre_2.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
				
			}
		});
		menu_asiento_libre_2.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_2.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_2.setBounds(96, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_2);
		
		final JMenuItem menu_asiento_libre_3 = new JMenuItem("");
		menu_asiento_libre_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;
				
				
				if (cont_asientos(cant) == true) {
					nom_asientos("3A");
					menu_asiento_libre_3.setEnabled(false);
					menu_asiento_libre_3.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
				
				
			}
		});
		menu_asiento_libre_3.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_3.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_3.setBounds(157, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_3);
		
		final JMenuItem menu_asiento_libre_4 = new JMenuItem("");
		menu_asiento_libre_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;
				
				
				if (cont_asientos(cant) == true) {
					nom_asientos("4A");
					menu_asiento_libre_4.setEnabled(false);
					menu_asiento_libre_4.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
				
			}
		});
		menu_asiento_libre_4.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_4.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_4.setBounds(218, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_4);
		
		final JMenuItem menu_asiento_libre_5 = new JMenuItem("");
		menu_asiento_libre_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;
				
				
				if (cont_asientos(cant) == true) {
					nom_asientos("5A");
					menu_asiento_libre_5.setEnabled(false);
					menu_asiento_libre_5.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
					
				}else {
					
				}
				
				
			}
		});
		menu_asiento_libre_5.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_5.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_5.setBounds(279, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_5);
		
		final JMenuItem menu_asiento_libre_6 = new JMenuItem("");
		menu_asiento_libre_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("6A");
					menu_asiento_libre_6.setEnabled(false);
					menu_asiento_libre_6.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_6.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_6.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_6.setBounds(340, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_6);
		
		final JMenuItem menu_asiento_libre_7 = new JMenuItem("");
		menu_asiento_libre_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("7A");
					menu_asiento_libre_7.setEnabled(false);
					menu_asiento_libre_7.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_7.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_7.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_7.setBounds(401, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_7);
		
		final JMenuItem menu_asiento_libre_8 = new JMenuItem("");
		menu_asiento_libre_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("8A");
					menu_asiento_libre_8.setEnabled(false);
					menu_asiento_libre_8.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_8.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_8.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_8.setBounds(462, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_8);
		
		final JMenuItem menu_asiento_libre_9 = new JMenuItem("");
		menu_asiento_libre_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("1B");
					menu_asiento_libre_9.setEnabled(false);
					menu_asiento_libre_9.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_9.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_9.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_9.setBounds(35, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_9);
		
		final JMenuItem menu_asiento_libre_10 = new JMenuItem("");
		menu_asiento_libre_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("2B");
					menu_asiento_libre_10.setEnabled(false);
					menu_asiento_libre_10.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_10.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_10.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_10.setBounds(96, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_10);
		
		final JMenuItem menu_asiento_libre_11 = new JMenuItem("");
		menu_asiento_libre_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("3B");
					menu_asiento_libre_11.setEnabled(false);
					menu_asiento_libre_11.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_11.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_11.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_11.setBounds(157, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_11);
		
		final JMenuItem menu_asiento_libre_12 = new JMenuItem("");
		menu_asiento_libre_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("4B");
					menu_asiento_libre_12.setEnabled(false);
					menu_asiento_libre_12.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_12.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_12.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_12.setBounds(218, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_12);
		
		final JMenuItem menu_asiento_libre_13 = new JMenuItem("");
		menu_asiento_libre_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("5B");
					menu_asiento_libre_13.setEnabled(false);
					menu_asiento_libre_13.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_13.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_13.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_13.setBounds(279, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_13);
		
		final JMenuItem menu_asiento_libre_14 = new JMenuItem("");
		menu_asiento_libre_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("6B");
					menu_asiento_libre_14.setEnabled(false);
					menu_asiento_libre_14.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_14.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_14.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_14.setBounds(340, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_14);
		
		final JMenuItem menu_asiento_libre_15 = new JMenuItem("");
		menu_asiento_libre_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("7B");
					menu_asiento_libre_15.setEnabled(false);
					menu_asiento_libre_15.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_15.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_15.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_15.setBounds(401, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_15);
		
		final JMenuItem menu_asiento_libre_16 = new JMenuItem("");
		menu_asiento_libre_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("8B");
					menu_asiento_libre_16.setEnabled(false);
					menu_asiento_libre_16.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_16.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_16.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_16.setBounds(462, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_16);
		
		final JMenuItem menu_asiento_libre_17 = new JMenuItem("");
		menu_asiento_libre_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("1C");
					menu_asiento_libre_17.setEnabled(false);
					menu_asiento_libre_17.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_17.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_17.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_17.setBounds(35, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_17);
		
		final JMenuItem menu_asiento_libre_18 = new JMenuItem("");
		menu_asiento_libre_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("2C");
					menu_asiento_libre_18.setEnabled(false);
					menu_asiento_libre_18.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_18.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_18.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_18.setBounds(96, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_18);
		
		final JMenuItem menu_asiento_libre_19 = new JMenuItem("");
		menu_asiento_libre_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("3C");
					menu_asiento_libre_19.setEnabled(false);
					menu_asiento_libre_19.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_19.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_19.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_19.setBounds(157, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_19);
		
		final JMenuItem menu_asiento_libre_20 = new JMenuItem("");
		menu_asiento_libre_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("4C");
					menu_asiento_libre_20.setEnabled(false);
					menu_asiento_libre_20.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
			
		});
		menu_asiento_libre_20.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_20.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_20.setBounds(218, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_20);
		
		final JMenuItem menu_asiento_libre_21 = new JMenuItem("");
		menu_asiento_libre_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("5C");
					menu_asiento_libre_21.setEnabled(false);
					menu_asiento_libre_21.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_21.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_21.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_21.setBounds(279, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_21);
		
		final JMenuItem menu_asiento_libre_22 = new JMenuItem("");
		menu_asiento_libre_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("6C");
					menu_asiento_libre_22.setEnabled(false);
					menu_asiento_libre_22.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_22.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_22.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_22.setBounds(340, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_22);
		
		final JMenuItem menu_asiento_libre_23 = new JMenuItem("");
		menu_asiento_libre_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("7C");
					menu_asiento_libre_23.setEnabled(false);
					menu_asiento_libre_23.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_23.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_23.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_23.setBounds(401, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_23);
		
		final JMenuItem menu_asiento_libre_24 = new JMenuItem("");
		menu_asiento_libre_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("8C");
					menu_asiento_libre_24.setEnabled(false);
					menu_asiento_libre_24.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_24.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_24.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_24.setBounds(462, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_24);
		
		final JMenuItem menu_asiento_libre_25 = new JMenuItem("");
		menu_asiento_libre_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("1D");
					menu_asiento_libre_25.setEnabled(false);
					menu_asiento_libre_25.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_25.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_25.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_25.setBounds(35, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_25);
		
		final JMenuItem menu_asiento_libre_26 = new JMenuItem("");
		menu_asiento_libre_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("2D");
					menu_asiento_libre_26.setEnabled(false);
					menu_asiento_libre_26.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_26.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_26.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_26.setBounds(96, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_26);
		
		final JMenuItem menu_asiento_libre_27 = new JMenuItem("");
		menu_asiento_libre_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("3D");
					menu_asiento_libre_27.setEnabled(false);
					menu_asiento_libre_27.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
			
		});
		menu_asiento_libre_27.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_27.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_27.setBounds(157, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_27);
		
		final JMenuItem menu_asiento_libre_28 = new JMenuItem("");
		menu_asiento_libre_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("4D");
					menu_asiento_libre_28.setEnabled(false);
					menu_asiento_libre_28.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_28.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_28.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_28.setBounds(218, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_28);
		
		final JMenuItem menu_asiento_libre_29 = new JMenuItem("");
		menu_asiento_libre_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("5D");
					menu_asiento_libre_29.setEnabled(false);
					menu_asiento_libre_29.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_29.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_29.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_29.setBounds(279, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_29);
		
		final JMenuItem menu_asiento_libre_30 = new JMenuItem("");
		menu_asiento_libre_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("6D");
					menu_asiento_libre_30.setEnabled(false);
					menu_asiento_libre_30.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_30.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_30.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_30.setBounds(340, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_30);
		
		final JMenuItem menu_asiento_libre_31 = new JMenuItem("");
		menu_asiento_libre_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("7D");
					menu_asiento_libre_31.setEnabled(false);
					menu_asiento_libre_31.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_31.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_31.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_31.setBounds(401, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_31);
		
		final JMenuItem menu_asiento_libre_32 = new JMenuItem("");
		menu_asiento_libre_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int cant;
				cant = Integer.parseInt(cb_cant_asiento.getSelectedItem().toString()) ;

				
				if (cont_asientos(cant) == true) {
					nom_asientos("8D");
					menu_asiento_libre_32.setEnabled(false);
					menu_asiento_libre_32.setIcon(new ImageIcon("IMG\\asiento_ocupado.png"));
				}else {
					
				}
			}
		});
		menu_asiento_libre_32.setIcon(new ImageIcon("IMG\\asiento_libre.png"));
		menu_asiento_libre_32.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_32.setBounds(462, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_32);
		
		
		//--------------------------
		
		JLabel lbl_cant_asientos_1 = new JLabel("A");
		lbl_cant_asientos_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1.setBounds(18, 45, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1);
		
		JLabel lbl_cant_asientos_1_1 = new JLabel("B");
		lbl_cant_asientos_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_1.setBounds(18, 135, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_1);
		
		JLabel lbl_cant_asientos_1_2 = new JLabel("C");
		lbl_cant_asientos_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_2.setBounds(18, 234, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_2);
		
		JLabel lbl_cant_asientos_1_3 = new JLabel("D");
		lbl_cant_asientos_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_3.setBounds(18, 331, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_3);
		
		JLabel lbl_cant_asientos_1_4 = new JLabel("1");
		lbl_cant_asientos_1_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_4.setBounds(53, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_4);
		
		JLabel lbl_cant_asientos_1_5 = new JLabel("2");
		lbl_cant_asientos_1_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_5.setBounds(113, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_5);
		
		JLabel lbl_cant_asientos_1_6 = new JLabel("3");
		lbl_cant_asientos_1_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_6.setBounds(176, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_6);
		
		JLabel lbl_cant_asientos_1_7 = new JLabel("4");
		lbl_cant_asientos_1_7.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_7.setBounds(237, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_7);
		
		JLabel lbl_cant_asientos_1_8 = new JLabel("5");
		lbl_cant_asientos_1_8.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_8.setBounds(298, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_8);
		
		JLabel lbl_cant_asientos_1_9 = new JLabel("6");
		lbl_cant_asientos_1_9.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_9.setBounds(358, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_9);
		
		JLabel lbl_cant_asientos_1_10 = new JLabel("7");
		lbl_cant_asientos_1_10.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_10.setBounds(419, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_10);
		
		JLabel lbl_cant_asientos_1_11 = new JLabel("8");
		lbl_cant_asientos_1_11.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos_1_11.setBounds(479, 11, 18, 22);
		panel_asientos.add(lbl_cant_asientos_1_11);
		
		JLabel lbl_cant_asientos = new JLabel("Cantidad de asientos:");
		lbl_cant_asientos.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_cant_asientos.setBounds(27, 32, 129, 22);
		panel_general.add(lbl_cant_asientos);
		
	
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cant_a;
				cant_a =cb_cant_asiento.getSelectedItem().toString();
				int cant_asientos = Integer.parseInt(   cb_cant_asiento.getSelectedItem().toString());
				
				
				if (cont_a < cant_asientos ) {
					
					JOptionPane.showMessageDialog(null, "No elegiste los asientos solisitados","ERROR",JOptionPane.ERROR_MESSAGE);
					
				
				}else {
					anterior.frmCinema.setVisible(true);
					frame.dispose();
					
					asientos_cadena = asientos_cadena.substring(0, asientos_cadena.length()-1);
					
					//enviar asientos_cadena--------
					
					System.out.println(npa);
					if (npa == 1) {
						anterior.lbl_cantidad.setText(cant_a);
						anterior.lbl_asientos.setText(asientos_cadena);
					}else if (npa == 2) {
						anterior.lbl_cantidad_1.setText(cant_a);
						anterior.lbl_asientos_1.setText(asientos_cadena);
					}else if (npa == 3) {
						anterior.lbl_cantidad_2.setText(cant_a);
						anterior.lbl_asientos_2.setText(asientos_cadena);
					}else {
						anterior.lbl_cantidad_3.setText(cant_a);
						anterior.lbl_asientos_3.setText(asientos_cadena);
					}
					
				}
				
			}
		});
		btn_confirmar.setForeground(Color.WHITE);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		btn_confirmar.setBounds(636, 553, 88, 39);
		panel_general.add(btn_confirmar);
		
		JButton btn_confirmar_1 = new JButton("Cancelar");
		btn_confirmar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				anterior.frmCinema.setVisible(true);
				frame.dispose();
				
				if (npa == 1) {
					anterior.panel_peli_r.setVisible(false);
				}else if (npa == 2) {
					anterior.panel_peli_r_1.setVisible(false);
				}else if (npa == 3) {
					anterior.panel_peli_r_2.setVisible(false);
				}else {
					anterior.panel_peli_r_3.setVisible(false);
				}
					
			}
		});
		btn_confirmar_1.setForeground(Color.WHITE);
		btn_confirmar_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar_1.setBorder(null);
		btn_confirmar_1.setBackground(new Color(53, 53, 53));
		btn_confirmar_1.setBounds(739, 553, 88, 39);
		panel_general.add(btn_confirmar_1);
		
		
		
	}
	
	public boolean cont_asientos(int cant_asientos) {
		
		boolean bol = false;
		
		System.out.println(cant_asientos);
	     
		if (cont_a < cant_asientos ) {
			cont_a +=1;
			System.out.println(cont_a);
			
		return bol = true;
		}else {
			
			JOptionPane.showMessageDialog(null, "ESA ES LA CANTIDAD MAXIMA QUE SE ELIGIO","ERROR",JOptionPane.ERROR_MESSAGE);
            
			return bol = false;
		}
		
	}
	
	
	public void nom_asientos(String puesto) {
		
		
		asientos_cadena =  asientos_cadena + puesto + ",";
		System.out.println(asientos_cadena);
		
		
	}
	
}
