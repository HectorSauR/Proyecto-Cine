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
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaPrincipalCombo {

	public JFrame frmCinema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaPrincipalCombo window = new PaginaPrincipalCombo();
					window.frmCinema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 REALMENTE ES LA VISTA DE LAS VENTAS, NO ES LA PAGINA PRINCIPAL, HACER RENAME O DEJARLO DE ESTÁ MANERA
	 */

	/**
	 * Create the application.
	 */
	public PaginaPrincipalCombo() {
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
				PrincipalPagina s = new PrincipalPagina ();
				s.frmCinema.setVisible(true);
				PaginaPrincipalCombo window = new PaginaPrincipalCombo();
				window.frmCinema.setVisible(false);
			}
		});
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
		panel_muestras.setBounds(37, 105, 364, 435);
		panel_general.add(panel_muestras);
		panel_muestras.setBackground(new Color(217, 217, 217));
		panel_muestras.setLayout(null);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.setForeground(Color.white);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		btn_confirmar.setBounds(266, 385, 88, 39);
		panel_muestras.add(btn_confirmar);
		
		JPanel panel_peli1 = new JPanel();
		panel_peli1.setLayout(null);
		panel_peli1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1.setBounds(10, 11, 344, 92);
		panel_muestras.add(panel_peli1);
		
		JLabel lbl_pelicula = new JLabel("Combo sencillo");
		lbl_pelicula.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula.setBounds(130, 0, 110, 20);
		panel_peli1.add(lbl_pelicula);
		
		JComboBox cb_tamano_palo = new JComboBox();
		cb_tamano_palo.setBounds(208, 60, 126, 22);
		panel_peli1.add(cb_tamano_palo);
		cb_tamano_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_palo.setMaximumRowCount(3);
		cb_tamano_palo.setToolTipText("");
		cb_tamano_palo.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		cb_tamano_palo.setSelectedIndex(0);
		
		JLabel lbl_pelicula_1 = new JLabel("Palomitas grandes");
		lbl_pelicula_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_1.setBounds(10, 21, 110, 20);
		panel_peli1.add(lbl_pelicula_1);
		
		JLabel lbl_pelicula_2 = new JLabel("Refresco grande");
		lbl_pelicula_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_2.setBounds(10, 42, 110, 20);
		panel_peli1.add(lbl_pelicula_2);
		
		JLabel lbl_pelicula_3 = new JLabel("Chocolate");
		lbl_pelicula_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_3.setBounds(10, 61, 110, 20);
		panel_peli1.add(lbl_pelicula_3);
		
		JPanel panel_peli1_1 = new JPanel();
		panel_peli1_1.setLayout(null);
		panel_peli1_1.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_1.setBounds(10, 133, 344, 92);
		panel_muestras.add(panel_peli1_1);
		
		JLabel lbl_pelicula_4 = new JLabel("Combo pareja");
		lbl_pelicula_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_4.setBounds(130, 0, 110, 20);
		panel_peli1_1.add(lbl_pelicula_4);
		
		JComboBox cb_tamano_palo_1 = new JComboBox();
		cb_tamano_palo_1.setToolTipText("");
		cb_tamano_palo_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		cb_tamano_palo_1.setSelectedIndex(0);
		cb_tamano_palo_1.setMaximumRowCount(3);
		cb_tamano_palo_1.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_palo_1.setBounds(208, 60, 126, 22);
		panel_peli1_1.add(cb_tamano_palo_1);
		
		JLabel lbl_pelicula_1_1 = new JLabel("Palomitas extra-grandes");
		lbl_pelicula_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_1_1.setBounds(10, 21, 148, 20);
		panel_peli1_1.add(lbl_pelicula_1_1);
		
		JLabel lbl_pelicula_2_1 = new JLabel("2 Refrescos grandes");
		lbl_pelicula_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_2_1.setBounds(10, 42, 116, 20);
		panel_peli1_1.add(lbl_pelicula_2_1);
		
		JLabel lbl_pelicula_3_1 = new JLabel("2 Chocolates");
		lbl_pelicula_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_3_1.setBounds(10, 61, 110, 20);
		panel_peli1_1.add(lbl_pelicula_3_1);
		
		JPanel panel_peli1_2 = new JPanel();
		panel_peli1_2.setLayout(null);
		panel_peli1_2.setBackground(SystemColor.activeCaptionBorder);
		panel_peli1_2.setBounds(10, 257, 344, 92);
		panel_muestras.add(panel_peli1_2);
		
		JLabel lbl_pelicula_5 = new JLabel("Combo amigos");
		lbl_pelicula_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_5.setBounds(130, 0, 110, 20);
		panel_peli1_2.add(lbl_pelicula_5);
		
		JComboBox cb_tamano_palo_2 = new JComboBox();
		cb_tamano_palo_2.setToolTipText("");
		cb_tamano_palo_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		cb_tamano_palo_2.setSelectedIndex(0);
		cb_tamano_palo_2.setMaximumRowCount(3);
		cb_tamano_palo_2.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_palo_2.setBounds(208, 60, 126, 22);
		panel_peli1_2.add(cb_tamano_palo_2);
		
		JLabel lbl_pelicula_1_2 = new JLabel("2 Palomitas grandes");
		lbl_pelicula_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_1_2.setBounds(10, 21, 126, 20);
		panel_peli1_2.add(lbl_pelicula_1_2);
		
		JLabel lbl_pelicula_2_2 = new JLabel("2 Refresco grandes");
		lbl_pelicula_2_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_2_2.setBounds(10, 42, 110, 20);
		panel_peli1_2.add(lbl_pelicula_2_2);
		
		JLabel lbl_pelicula_3_2 = new JLabel("2 Chocolates");
		lbl_pelicula_3_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_pelicula_3_2.setBounds(10, 61, 110, 20);
		panel_peli1_2.add(lbl_pelicula_3_2);
		
		JPanel panel_resumen = new JPanel();
		panel_resumen.setBounds(606, 105, 378, 435);
		panel_resumen.setBackground(new Color(217, 217, 217));
		panel_general.add(panel_resumen);
		panel_resumen.setLayout(null);
		
		JLabel lbl_total = new JLabel("Total: $");
		lbl_total.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_total.setBounds(238, 410, 59, 14);
		panel_resumen.add(lbl_total);
		
		JButton btn_clientes = new JButton("Clientes");
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
	}
}
