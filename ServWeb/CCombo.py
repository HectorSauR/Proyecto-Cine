import ConexionBD;

class combo:

    cnn = ConexionBD.conexionBD()

    def setCombo(self,nombre:str, precio:float , productos:list):
        self.name = nombre;
        self.price = precio;
        self.products = productos;

    def regCombo(self):
        idDetalleCombo = self.cnn.obtenerSiguienteIDRep("detalle_combo","detalle_combo_id");
        idCombo = self.cnn.obtenerSiguienteID("combo");

        for prd in self.products:
            # print(dato);
            lista = {
            "id" : idDetalleCombo,
            "productoID" : prd["id"],
            "cantidad" : prd["cantidad"]
            }
            self.cnn.ejecutarInsercion("detalle_combo",lista);

        lista = {
            "id" : idCombo,
            "nombre" : self.name,
            "detalle_combo" : idDetalleCombo,
            "precio" : self.price
        }
        self.cnn.ejecutarInsercion("combo",lista);
        self.msg = "Registrado con exito!";

    def getCombo(self):
        return self.cnn.ejecutarConsulta("ver_combo");

