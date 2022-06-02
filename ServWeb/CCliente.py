import ConexionBD;
import CTarjeta;

class cliente:

    cnn = ConexionBD.conexionBD()

    def setCliente(self,nombre:str = None,apellido1:str = None,apellido2:str = None,cumple:str = None,tarjeta:int = None):
        self.name = nombre;
        self.apellido1 =apellido1;
        self.apellido2 =apellido2;
        self.cumple = cumple;
        self.tarjeta = tarjeta;

    def regCliente(self):
        idCliente = self.cnn.obtenerSiguienteID("cliente");
        idTarjeta = self.cnn.obtenerSiguienteID("tarjeta_cliente");

        lista = {
            "id" : idTarjeta,
            "puntos" : 1,
            "tarjeta_cine" : self.tarjeta
        }
        self.cnn.ejecutarInsercion("tarjeta_cliente",lista);
        
        lista = {
            "id" : idCliente,
            "nombre" : self.name,
            "apellido1" : self.apellido1,
            "apellido2" : self.apellido2,
            "cumpleanos" : self.cumple,
            "tarjeta" : idTarjeta
        }
        x = self.cnn.ejecutarInsercion("cliente",lista);
        
        if(x == "1"): return "Registrado con éxito!"
        else: return "Error al registrar"

    def getCliente(self):
        datos =  self.cnn.ejecutarConsulta("ver_clientes");
        lista = [];

        for linea in datos:
            lista.append({
                "id" : linea[0],
                "nombre" : linea[1],
                "apellido1" : linea[2],
                "apellido2" : linea[3],
                "cumple" : linea[4],
                "tajeta" : linea[5]
            })
            
        return lista

