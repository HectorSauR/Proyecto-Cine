import ConexionBD;

class funcion:

    cnn = ConexionBD.conexionBD()

    def setFuncion(self, sala:int, pelicula:int, fecha:str,hora:str):
        self.sala = sala
        self.pelicula = pelicula
        self.fecha = fecha
        self.hora = hora

    def regFuncion(self):
        ident = self.cnn.obtenerSiguienteID("funcion");

        lista = {
            "id" : ident,
            "sala" : self.sala,
            "pelicula" : self.pelicula,
            "fecha" : self.fecha,
            "hora" : self.hora
        }
        # print(lista);
        x = self.cnn.ejecutarInsercion("funcion",lista);

        if(x == "1"): return "Registrado con éxito!"
        else : return "Error"

    def getFuncion(self):
        return self.cnn.ejecutarConsulta("ver_funciones");

    def getAsientosDisponibles(self):
        return self.cnn.ejecutarConsulta("ver_asientos_disponibles");