import ConexionBD;

class tarjeta:

    cnn = ConexionBD.conexionBD()

    def setTarjeta(self,nombre:str,beneficios:str,puntos_necesarios:int):
        self.nombre = nombre;
        self.beneficios = beneficios;
        self.puntos_necesarios = puntos_necesarios;
    
    def regTarjeta(self):
        id = self.cnn.obtenerSiguienteID("tarjeta");

        lista = {
            "id": id,
            "nombre" : self.nombre,
            "beneficios" : self.beneficios,
            "puntos_necesarios" : self.puntos_necesarios
        }

        self.cnn.ejecutarInsercion("tarjeta_cine",lista);
        return "Registrado con éxito!"

    def getTarjetas(self):
        return self.cnn.ejecutarConsulta("tarjeta_cine")


