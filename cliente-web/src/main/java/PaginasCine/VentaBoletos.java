package PaginasCine;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

public class VentaBoletos {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaBoletos window = new VentaBoletos();
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
	public VentaBoletos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 621, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
	   String[][]  datosPeliculas = {{"IUAHSDIÑOUASHDÑOASH\nIDHAILSDHLIA\nHDLIASU"}};
	   
	   
	   
	  String [] cabezera1 = {"FOTO"};
	  String [] cabezera2 = {"DATOS"};
	  
	  String [][] datos = {{"dato1"},
			              {"dato2"},
			              {"dato3"},};
	   
	            
	  
	
	  table = new JTable(datosPeliculas,cabezera1);
	 // table.setDefaultRenderer(String[].class, renderer);
	  //table.getColumnModel().getColumn(2).setCellRenderer(renderer);
	  	

		  
		  
		 table.setBounds(26, 11, 87, 369);
		 frame.getContentPane().add(table);
		  
		  table_1 = new JTable(datos,cabezera2);
		table_1.setBounds(213, 30, 129, 369);
		  frame.getContentPane().add(table_1);
		  
		  
		  
		  
		  
	  
	}
	
	
	
	
	
}



