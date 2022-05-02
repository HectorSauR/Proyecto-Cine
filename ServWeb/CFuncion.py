import ConexionBD;

class funcion:

    cnn = ConexionBD.conexionBD()

    def setFuncion(self, sala:int, pelicula:int, fecha:str,hora:str):
        self.sala = sala
        self.pelicula = pelicula
        self.fecha = fecha
        self.hora = hora

    def regFuncion(self):
        id = self.cnn.obtenerSiguienteID("funcion");

        lista = {
            "id" : id,
            "sala" : self.sala,
            "fecha" : self.fecha,
            "hora" : self.hora
        }

        self.cnn.ejecutarInsercion("funcion",lista);
        return "Registrado con éxito!"

    def getFuncion(self):
        return self.cnn.ejecutarConsulta("ver_funcion");

    def getAsientosDisponibles(self):
        return self.cnn.ejecutarConsulta("ver_asientos_disponibles");