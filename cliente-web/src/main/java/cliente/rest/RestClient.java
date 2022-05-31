package cliente.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.json.*;

public class RestClient {

	public static void main(String[] args) {
		
		
		JSONObject vo2 = new JSONObject();
		vo2.put("nombre", "palomitas");
		vo2.put("cantidad", "12");
		JSONObject vo3 = new JSONObject();
		JSONArray ja = new JSONArray();
		ja.put(vo2);
		vo3.put("nombre", "palomitas");
		vo3.put("cantidad", "12");
		JSONObject vo = new JSONObject(); 
		ja.put(vo3);
		
	
		
		vo.put("nombre", "null");
		vo.put("categoria", "1");
		vo.put("precio", "100");
		vo.put("PRODUCTOS", ja);
		vo.put("lenguaje", "2");
		
		
		System.out.println(vo);
		
		
		
		try {
			//String urlRestService = "http://127.0.0.1:5000/productos/mostrar";
			//String urlRestService = "http://26.77.197.154:8000/empleados/mostrar";
			
			
			
			//String urlRestService = "http://26.77.197.154:8000/pelicula/registrar";
			//String urlRestService = "http://127.0.0.1:5000/pelicula/registrar";
			//ClientConfig clientConfig = new DefaultClientConfig();
			//clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
			//Client client = Client.create(clientConfig);
			//WebResource webResource = client.resource(urlRestService);
			//ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
			//System.out.println(vo);
			
			//ClientResponse response = webResource.type("application/json").post(ClientResponse.class, vo.toString());
			//String resp = response.getEntity(String.class);
			
			//JSONArray ja = new JSONArray(resp);
			
			//JSONObject jo = ja.getJSONObject(0);
			
			//System.out.println(jo.get("apellido1"));
			
			//
			
			//System.out.println("Respuesta : ");
			//System.out.println(resp);
			
		}catch(JSONException err){
			//System.out.println("Exception : "+err.toString());
		}

	}
	
	
	
	
	
	public static String Get(String path) {
		String urlRestService = path;
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(urlRestService);
		ClientResponse response = webResource.type("application/json").get(ClientResponse.class);
	
		String resp = response.getEntity(String.class);
		return resp;
	}
	
	
 public static String Put(String path, JSONObject vo) {
		
	 	String urlRestService = path;
	 	ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client.resource(urlRestService);
		
		
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, vo.toString());
		String resp = response.getEntity(String.class);
		return resp;
		
	}

}
