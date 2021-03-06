package PaginasCine;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;



public class EscogerAsiento {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscogerAsiento window = new EscogerAsiento();
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
	public EscogerAsiento() {
		initialize();
	}

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
		panel_general.setBounds(0, 0, 870, 650);
		frame.getContentPane().add(panel_general);
		panel_general.setLayout(null);
		
		JPanel panel_asientos = new JPanel();
		panel_asientos.setBounds(145, 89, 573, 408);
		panel_general.add(panel_asientos);
		panel_asientos.setLayout(null);
		panel_asientos.setBackground(new Color(217, 217, 217));
		
		JMenuItem menu_asiento_libre_1 = new JMenuItem("");
		menu_asiento_libre_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_1.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		
		menu_asiento_libre_1.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_1.setBounds(35, 33, 51, 42);
		menu_asiento_libre_1.setBackground(new Color(217, 217, 217));
		panel_asientos.add(menu_asiento_libre_1);
		
		JMenuItem menu_asiento_libre_2 = new JMenuItem("");
		menu_asiento_libre_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_2.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_2.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_2.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_2.setBounds(96, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_2);
		
		JMenuItem menu_asiento_libre_3 = new JMenuItem("");
		menu_asiento_libre_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_3.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_3.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_3.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_3.setBounds(157, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_3);
		
		JMenuItem menu_asiento_libre_4 = new JMenuItem("");
		menu_asiento_libre_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_4.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_4.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_4.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_4.setBounds(218, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_4);
		
		JMenuItem menu_asiento_libre_5 = new JMenuItem("");
		menu_asiento_libre_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_5.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_5.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_5.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_5.setBounds(279, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_5);
		
		JMenuItem menu_asiento_libre_6 = new JMenuItem("");
		menu_asiento_libre_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_6.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_6.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_6.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_6.setBounds(340, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_6);
		
		JMenuItem menu_asiento_libre_7 = new JMenuItem("");
		menu_asiento_libre_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_7.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_7.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_7.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_7.setBounds(401, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_7);
		
		JMenuItem menu_asiento_libre_8 = new JMenuItem("");
		menu_asiento_libre_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_8.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_8.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_8.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_8.setBounds(462, 33, 51, 42);
		panel_asientos.add(menu_asiento_libre_8);
		
		JMenuItem menu_asiento_libre_9 = new JMenuItem("");
		menu_asiento_libre_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_9.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_9.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_9.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_9.setBounds(35, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_9);
		
		JMenuItem menu_asiento_libre_10 = new JMenuItem("");
		menu_asiento_libre_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_10.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_10.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_10.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_10.setBounds(96, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_10);
		
		JMenuItem menu_asiento_libre_11 = new JMenuItem("");
		menu_asiento_libre_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_11.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_11.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_11.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_11.setBounds(157, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_11);
		
		JMenuItem menu_asiento_libre_12 = new JMenuItem("");
		menu_asiento_libre_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_12.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_12.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_12.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_12.setBounds(218, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_12);
		
		JMenuItem menu_asiento_libre_13 = new JMenuItem("");
		menu_asiento_libre_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_13.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_13.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_13.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_13.setBounds(279, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_13);
		
		JMenuItem menu_asiento_libre_14 = new JMenuItem("");
		menu_asiento_libre_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_14.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_14.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_14.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_14.setBounds(340, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_14);
		
		JMenuItem menu_asiento_libre_15 = new JMenuItem("");
		menu_asiento_libre_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_15.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_15.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_15.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_15.setBounds(401, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_15);
		
		JMenuItem menu_asiento_libre_16 = new JMenuItem("");
		menu_asiento_libre_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_16.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_16.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_16.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_16.setBounds(462, 127, 51, 42);
		panel_asientos.add(menu_asiento_libre_16);
		
		JMenuItem menu_asiento_libre_17 = new JMenuItem("");
		menu_asiento_libre_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_17.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_17.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_17.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_17.setBounds(35, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_17);
		
		JMenuItem menu_asiento_libre_18 = new JMenuItem("");
		menu_asiento_libre_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_18.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_18.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_18.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_18.setBounds(96, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_18);
		
		JMenuItem menu_asiento_libre_19 = new JMenuItem("");
		menu_asiento_libre_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_19.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_19.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_19.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_19.setBounds(157, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_19);
		
		JMenuItem menu_asiento_libre_20 = new JMenuItem("");
		menu_asiento_libre_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_20.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
			
		});
		menu_asiento_libre_20.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_20.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_20.setBounds(218, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_20);
		
		JMenuItem menu_asiento_libre_21 = new JMenuItem("");
		menu_asiento_libre_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_21.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_21.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_21.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_21.setBounds(279, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_21);
		
		JMenuItem menu_asiento_libre_22 = new JMenuItem("");
		menu_asiento_libre_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_22.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_22.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_22.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_22.setBounds(340, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_22);
		
		JMenuItem menu_asiento_libre_23 = new JMenuItem("");
		menu_asiento_libre_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_23.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_23.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_23.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_23.setBounds(401, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_23);
		
		JMenuItem menu_asiento_libre_24 = new JMenuItem("");
		menu_asiento_libre_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_24.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_24.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_24.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_24.setBounds(462, 223, 51, 42);
		panel_asientos.add(menu_asiento_libre_24);
		
		JMenuItem menu_asiento_libre_25 = new JMenuItem("");
		menu_asiento_libre_25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_25.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_25.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_25.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_25.setBounds(35, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_25);
		
		JMenuItem menu_asiento_libre_26 = new JMenuItem("");
		menu_asiento_libre_26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_26.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_26.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_26.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_26.setBounds(96, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_26);
		
		JMenuItem menu_asiento_libre_27 = new JMenuItem("");
		menu_asiento_libre_27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_27.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
			
		});
		menu_asiento_libre_27.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_27.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_27.setBounds(157, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_27);
		
		JMenuItem menu_asiento_libre_28 = new JMenuItem("");
		menu_asiento_libre_28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_28.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_28.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_28.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_28.setBounds(218, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_28);
		
		JMenuItem menu_asiento_libre_29 = new JMenuItem("");
		menu_asiento_libre_29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_29.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_29.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_29.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_29.setBounds(279, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_29);
		
		JMenuItem menu_asiento_libre_30 = new JMenuItem("");
		menu_asiento_libre_30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_30.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_30.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_30.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_30.setBounds(340, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_30);
		
		JMenuItem menu_asiento_libre_31 = new JMenuItem("");
		menu_asiento_libre_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_31.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_31.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_31.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_31.setBounds(401, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_31);
		
		JMenuItem menu_asiento_libre_32 = new JMenuItem("");
		menu_asiento_libre_32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu_asiento_libre_32.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_ocupado.png"));
			}
		});
		menu_asiento_libre_32.setIcon(new ImageIcon("C:\\Users\\Usuario de Windows\\Documents\\GitHub\\Proyecto-Cine\\ProyectoCine\\IMG\\asiento_libre.png"));
		menu_asiento_libre_32.setBackground(new Color(217, 217, 217));
		menu_asiento_libre_32.setBounds(462, 321, 51, 42);
		panel_asientos.add(menu_asiento_libre_32);
		
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
		
		JComboBox cb_cant_asiento = new JComboBox();
		cb_cant_asiento.setMaximumRowCount(6);
		cb_cant_asiento.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5"}));
		cb_cant_asiento.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_cant_asiento.setBounds(155, 32, 76, 22);
		panel_general.add(cb_cant_asiento);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.setForeground(Color.WHITE);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		btn_confirmar.setBounds(636, 553, 88, 39);
		panel_general.add(btn_confirmar);
		
		JButton btn_confirmar_1 = new JButton("Cancelar");
		btn_confirmar_1.setForeground(Color.WHITE);
		btn_confirmar_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar_1.setBorder(null);
		btn_confirmar_1.setBackground(new Color(53, 53, 53));
		btn_confirmar_1.setBounds(739, 553, 88, 39);
		panel_general.add(btn_confirmar_1);
		
	}
}
