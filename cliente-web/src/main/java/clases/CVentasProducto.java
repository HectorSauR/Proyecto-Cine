package clases;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.*;

public class CVentasProducto {
	
	JSONObject venta = new JSONObject();	
	JSONArray productos = new JSONArray();
	JSONArray combos = new JSONArray();
	
	public void agregarProducto(int id,int cantidad) {
		int x = 0;

		for (int i = 0; i < productos.length(); i++) {

			JSONObject pr = productos.getJSONObject(i);

			if (Integer.parseInt(pr.get("producto_id").toString()) == id) {
				x = 1;
				int cant = Integer.parseInt(pr.get("cantidad").toString());
				pr.put("cantidad", cant + cantidad);
				break;
			}
		}
		
		if(x == 1) return;
		
		JSONObject prd = new JSONObject();
		prd.put("producto_id", id);
		prd.put("cantidad", cantidad);
		
		productos.put(prd);
	}
	
	
	public void agregarCombo(int id,int cantidad) {
		int x = 0;
		
		for (int i=0; i<combos.length();i++) {
			 JSONObject prd = combos.getJSONObject(i);
				if (Integer.parseInt(prd.get("combo_id").toString())==id) {
   				System.out.println(prd.get("combo_id"));
					 x=1;
					 int cant =  Integer.parseInt(prd.get("cantidad").toString());
					 prd.put("cantidad", cant+cantidad);
					 break;
			}
		}
		
		if(x == 1) return;
		
		JSONObject cmb = new JSONObject();
		cmb.put("combo_id", id);
		cmb.put("cantidad", cantidad);
		
		combos.put(cmb);
	}
	
	
	public JSONObject generarVenta(float total,int empleado,int cliente){
		
		if(combos.length() == 0) venta.put("combo", "default");
		else venta.put("combo", combos);
		
		if(productos.length() == 0) venta.put("productos", "default");
		else venta.put("productos", productos);

		venta.put("total", total);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		venta.put("fecha", dtf.format(LocalDateTime.now()));
		venta.put("empleado", empleado);
		venta.put("cliente", cliente);
		
		return venta;
	}
	
	public JSONObject generarVenta(float total,int empleado){
		
		if(combos.length() == 0) venta.put("combo", "default");
		else venta.put("combo", combos);
		
		if(productos.length() == 0) venta.put("productos", "default");
		else venta.put("productos", productos);

		venta.put("total", total);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		venta.put("fecha", dtf.format(LocalDateTime.now()));
		venta.put("empleado", empleado);
		venta.put("cliente", "default");
		
		return venta;
	}
	
	
	
	
}
