import ConexionBD;
import CTarjeta;

class cliente:

    cnn = ConexionBD.conexionBD()

    def setCliente(self,nombre:str = None,apellido1:str = None,apellido2:str = None,cumple:str = None):
        self.name = nombre;
        self.apellido1 =apellido1;
        self.apellido2 =apellido2;
        self.cumple = cumple;

    def regCliente(self):
        idCliente = self.cnn.obtenerSiguienteID("cliente");
        idTarjeta = self.cnn.obtenerSiguienteID("tarjeta_cliente");

        lista = {
            "id" : idCliente,
            "nombre" : self.name,
            "apellido1" : self.apellido1,
            "apellido2" : self.apellido2,
            "cumpleanos" : self.cumple,
            "tarjeta" : idTarjeta
        }

        self.cnn.ejecutarInsercion("cliente",lista);

        lista = {
            "id" : idTarjeta,
            "puntos" : 0,
            "tarjeta_cine" : 1
        }

        self.cnn.ejecutarInsercion("tarjeta_cliente",lista);
        return "Registrado con éxito!"

    def getCliente(self):
        self.cnn.ejecutarConsulta("ver_clientes")
