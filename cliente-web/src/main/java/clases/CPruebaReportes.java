package clases;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class CPruebaReportes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generarReporte();
	}
	
	public static void generarReporte() {
		
		Connection con;
		JasperReport reporte;
//		Map<String,Object> parameters = new HashMap<String,Object>();
//		parameters.put("variable",new String("Este es un String para pasar por parametro"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://26.77.197.154:3306/db_cine","ado3","123");
			
			reporte = JasperCompileManager.compileReport("C:/Users/hecto/Documents/Universidad/6.Sexto semestre/Practicas/3.Administracion de proyectos de software 1/Proyecto-Cine/cliente-web/src/main/java/PaginasCine/reportes/Blank_A4.jrxml");
//			JasperPrint print = JasperFillManager.fillReport(reporte,(Map<String,Object>)parameters,con);
			JasperPrint print = JasperFillManager.fillReport(reporte,null,con);
			JasperViewer visualiza = new JasperViewer(print,true);
			visualiza.setVisible(true);
			// JasperExportManager.exportReportToPdfFile(print,"reporte.pdf");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}
	
}
