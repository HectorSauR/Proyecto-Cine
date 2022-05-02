import ConexionBD;

class sucursal:

    cnn = ConexionBD.conexionBD()

    def setSucursal(self,nombre:str,total_salas:int, direccion:str):
        self.nombre = nombre
        self.total_salas = total_salas
        self.direccion = direccion

    def regSucursal(self):
        id = self.cnn.obtenerSiguienteID("sucursal");
        
        lista = {
            "id" : id,
            "nombre" : self.nombre,
            "total_salas" : self.total_salas,
            "direccion" : self.direccion
        }

        self.cnn.ejecutarInsercion("sucursal",lista);
        return "Registrado con éxito!"

    def getSucursales(self):
        self.cnn.ejecutarConsulta("sucursal");

    # def setSala(self,numAsiento:int,fila:str,estado:bool):
    #     self.numAsiento = numAsiento
    #     self.fila = fila
    #     self.estado = estado

    def getSalas(self):
        self.cnn.ejecutarConsulta("sala");

