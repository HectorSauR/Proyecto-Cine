package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.JSONObject;

public class CVentaBoletos {
	
	JSONObject venta = new JSONObject();	
	
	public JSONObject generarVenta(float total,int empleado,int cantidad,int funcion,String asientos,int sala){
		
		venta.put("cantidad", cantidad);
		venta.put("funcion", funcion);
		venta.put("total", total);
		venta.put("asientos", asientos);
		venta.put("sala",sala);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		venta.put("fechaHora", dtf.format(LocalDateTime.now()));
		venta.put("empleado", empleado);
		venta.put("cliente", "default");
		
		return venta;
	}
}
