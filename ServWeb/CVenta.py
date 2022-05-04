import ConexionBD;

class venta:

    cnn = ConexionBD.conexionBD();

    def setVentaProducto(self, total:float,empleado:int,fechaHora:str,sucursal:int,individual:list = None, combo:list = None):
        self.individual = individual
        self.combo = combo
        self.total = total
        self.empleado = empleado
        self.fechaHora = fechaHora
        self.sucursal = sucursal
    
    def regVentaProducto(self):
        

        if(self.individual != None):
            idIndvidual = self.cnn.obtenerSiguienteIDRep("detalle_venta_individual","detalle_venta_individual_id")
            arr = self.individual["productos"]
            for prd in arr:

                lista = {
                    "id" : idIndvidual,
                    "producto" : prd["producto_id"],
                    "cantidad" : prd["cantidad"]
                }
            
            self.individual = idIndvidual;

        else: self.individual = "default";

        if(self.combo != None):
            idCombo = self.cnn.obtenerSiguienteIDRep("detalle_venta_combo","detalle_venta_combo_id")
            arr = self.individual["productos"]
            for cmb in arr:

                lista = {
                    "id" : idCombo,
                    "producto" : cmb["combo_id"],
                    "cantidad" : cmb["cantidad"]
                }
            
            self.combo = idCombo;
            
        else: self.combo = "default";



        lista = {
            "id": "default",
            "detalle_venta_individual" : self.individual,
            "detalle_venta_combo" : self.combo,
            "total" : self.total,
            "empleado" : self.empleado,
            "cliente": self.cliente,
            "fechaHora" : self.fechaHora,
            "sucursal" : self.sucursal
        }

        self.cnn.ejecutarInsercion("venta_producto",lista)


    def setVentaBoleto(self, cantidad:int, funcion:int,empleado:int,cliente:int,fechaHora:str, sucursal:int):
        self.cantidad = cantidad;
        self.funcion = funcion;
        self.empleado = empleado;
        self.cliente = cliente;
        self.fechaHora = fechaHora;
        self.sucursal = sucursal;

    def regVentaBoleto(self):

        lista = {
            "id": "default",
            "funcion" : self.funcion,
            "cantidad": self.cantidad,
            "empleado" : self.empleado,
            "cliente" : self.cliente,
            "fechaHora" : self.fechaHora,
            "sucursal" : self.sucursal
        }

        self.cnn.ejecutarInsercion("venta_boleto",lista)

        return "Ejecución realizada con éxito!"

    def getVentasBoletos(self):
        self.cnn.ejecutarConsulta("venta_boleto")

