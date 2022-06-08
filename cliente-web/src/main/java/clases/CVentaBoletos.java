package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.JSONObject;

import PaginasCine.funciones_get_put;

public class CVentaBoletos {
	
	static JSONObject venta = new JSONObject();	
	
	public static JSONObject generarVenta(float total,int empleado,int cantidad,int funcion,String asientos,int sala){
		
		venta.put("cantidad", cantidad);
		venta.put("funcion", funcion);
		venta.put("total", total);
		venta.put("asientos", asientos);
		venta.put("sala",sala);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		venta.put("fechaHora", dtf.format(LocalDateTime.now()));
		venta.put("empleado", empleado);
		venta.put("cliente", "default");
		
		
		System.out.println(venta);
		
		 funciones_get_put.boleto_registrar_venta(venta);
		return venta;
	}
	
	
	
	



	public static JSONObject generarVentac(float total,int empleado,int cantidad,int funcion,String asientos,int sala,int cliente) {
		
		venta.put("cantidad", cantidad);
		venta.put("funcion", funcion);
		venta.put("total", total);
		
		venta.put("asientos", asientos);
		venta.put("sala",sala);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		venta.put("fechaHora", dtf.format(LocalDateTime.now()));
		venta.put("empleado", empleado);
		venta.put("cliente", cliente);
		
		System.out.println(venta);
		 funciones_get_put.boleto_registrar_venta(venta);
		return venta;
		
	}
}
