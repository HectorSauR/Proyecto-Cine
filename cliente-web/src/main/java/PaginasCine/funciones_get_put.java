package PaginasCine;
import cliente.rest.*;
public class funciones_get_put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	public static void inicio_sesion( String us, String cont) {
		
		RestClient rc = new RestClient();
		
		System.out.println(us);
		System.out.println(cont);
		System.out.println(rc.Get("http://26.77.197.154:8000/empleados/usuarios"));
		
	}

}
