import ConexionBD;

class producto:

    cnn = ConexionBD.conexionBD()

    def verProducto(self):
        return self.cnn.ejecutarConsulta("ver_producto");
