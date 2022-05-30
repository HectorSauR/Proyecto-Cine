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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalPagina {

	public JFrame frmCinema;

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
	 REALMENTE ES LA VISTA DE LAS VENTAS, NO ES LA PAGINA PRINCIPAL, HACER RENAME O DEJARLO DE ESTÁ MANERA
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
				VistaBoletos s = new VistaBoletos ();
				s.frmCinema.setVisible(true);
				PrincipalPagina window = new PrincipalPagina();
				window.frmCinema.setVisible(false);
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
		btn_combos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaginaPrincipalCombo s = new PaginaPrincipalCombo ();
				s.frmCinema.setVisible(true);
				PrincipalPagina window = new PrincipalPagina();
				window.frmCinema.setVisible(false);
			}
		});
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
		
		JLabel lbl_palomitas = new JLabel("Palomitas");
		lbl_palomitas.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_palomitas.setForeground(Color.BLACK);
		lbl_palomitas.setBounds(10, 11, 65, 21);
		panel_muestras.add(lbl_palomitas);
		
		JComboBox cb_tamano_palo = new JComboBox();
		cb_tamano_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_palo.setMaximumRowCount(3);
		cb_tamano_palo.setToolTipText("");
		cb_tamano_palo.setModel(new DefaultComboBoxModel(new String[] {"Chico", "Mediano", "Grande"}));
		cb_tamano_palo.setSelectedIndex(0);
		cb_tamano_palo.setBounds(83, 10, 126, 22);
		panel_muestras.add(cb_tamano_palo);
		
		JComboBox cb_sabor_palo = new JComboBox();
		cb_sabor_palo.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_palo.setToolTipText("");
		cb_sabor_palo.setModel(new DefaultComboBoxModel(new String[] {"Mantequilla", "Takis", "Caramelo"}));
		cb_sabor_palo.setSelectedIndex(0);
		cb_sabor_palo.setMaximumRowCount(3);
		cb_sabor_palo.setBounds(219, 10, 126, 22);
		panel_muestras.add(cb_sabor_palo);
		
		JLabel lbl_refresco = new JLabel("Refresco");
		lbl_refresco.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_refresco.setForeground(Color.BLACK);
		lbl_refresco.setBounds(10, 127, 65, 21);
		panel_muestras.add(lbl_refresco);
		
		JComboBox cb_tamano_refre = new JComboBox();
		cb_tamano_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_tamano_refre.setToolTipText("");
		cb_tamano_refre.setModel(new DefaultComboBoxModel(new String[] {"Chico", "Mediano", "Grande"}));
		cb_tamano_refre.setSelectedIndex(0);
		cb_tamano_refre.setMaximumRowCount(3);
		cb_tamano_refre.setBounds(83, 126, 126, 22);
		panel_muestras.add(cb_tamano_refre);
		
		JComboBox cb_sabor_refre = new JComboBox();
		cb_sabor_refre.setFont(new Font("Arial", Font.PLAIN, 12));
		cb_sabor_refre.setToolTipText("");
		cb_sabor_refre.setModel(new DefaultComboBoxModel(new String[] {"Coca-Cola", "Pepsi", "Sprite"}));
		cb_sabor_refre.setSelectedIndex(0);
		cb_sabor_refre.setMaximumRowCount(3);
		cb_sabor_refre.setBounds(219, 126, 126, 22);
		panel_muestras.add(cb_sabor_refre);
		
		JButton btn_confirmar = new JButton("Confirmar");
		btn_confirmar.setForeground(Color.white);
		btn_confirmar.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_confirmar.setBorder(null);
		btn_confirmar.setBackground(new Color(53, 53, 53));
		btn_confirmar.setBounds(266, 385, 88, 39);
		panel_muestras.add(btn_confirmar);
		
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
		btn_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes s = new Clientes ();
				s.frmCinema.setVisible(true);
				PrincipalPagina window = new PrincipalPagina();
				window.frmCinema.setVisible(false);
			}
		});
		btn_clientes.setForeground(Color.WHITE);
		btn_clientes.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_clientes.setBorder(null);
		btn_clientes.setBackground(new Color(40, 75, 99));
		btn_clientes.setBounds(199, 0, 100, 38);
		frmCinema.getContentPane().add(btn_clientes);
		
	}
}
