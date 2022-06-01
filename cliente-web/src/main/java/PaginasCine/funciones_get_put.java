package PaginasCine;
import org.json.*;

import cliente.rest.*;
public class funciones_get_put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static  String ip="26.77.197.154" ;
<<<<<<< HEAD
	//public static  String ip="192.168.43.215";
=======
//	public static  String ip="192.168.43.215";
>>>>>>> 47e391edae7b679230391cc9916069a81e15cd74
	
	public static boolean inicio_sesion( String us, String cont) {
		
		
		boolean resp = false;
		RestClient rc = new RestClient();
		
//		System.out.println(us);
//		System.out.println(cont);
		
		String res = rc.Get("http://"+ip+":8000/empleados/usuarios");
//		System.out.println(res);
		
		
		JSONArray ja = new JSONArray(res);
		
		//System.out.println(ja.length());
		for (int i=0; i<ja.length();i++) {
			JSONObject jo = ja.getJSONObject(i);
//			System.out.println(jo.get("usuario"));
//			System.out.println(jo.get("contra"));
			if(us.equals(jo.get("usuario")) && cont.equals(jo.get("contra"))  ) {
				 resp = true;
				 
			}
		}
		
	 
		
		return resp;
	}
	
	
	public static void productos() {
		
		RestClient rc = new RestClient();
		String res = rc.Get("http://"+ip+":8000/venta/productos/mostrar");
		
		
		System.out.println(res);
	}
	
	
	public static void ventaProductos(JSONObject venta) {
		
		RestClient rc = new RestClient();
		String res = rc.Put("http://"+ip+":8000/venta/producto/registrar", venta);
		
		

		
		System.out.println(res);
	}


public static void combo_mostrar() {
	RestClient rc = new RestClient();
	String res = rc.Get("http://"+ip+":8000/combo/mostrar");
	
	System.out.println(res);
}
	
	
	

}
