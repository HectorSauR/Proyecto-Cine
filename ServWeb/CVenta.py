import ConexionBD;

class venta:

    cnn = ConexionBD.conexionBD();

    def setVentaProducto(self, total:float,empleado:int,fechaHora:str,sucursal:int,cliente:str,individual:list = None, combo:list = None):
        self.individual = individual
        self.combo = combo
        self.total = total
        self.empleado = empleado
        self.fechaHora = fechaHora
        self.sucursal = sucursal
        self.cliente = cliente
    
    def regVentaProducto(self):
        idIndv = 0;
        idcmb = 0;
    
        if(self.individual != None):
            idIndvidual = self.cnn.obtenerSiguienteIDRep("detalle_venta_individual","detalle_venta_individual_id")
            # arr = self.individual
            # for prd in arr:

            #     lista = {
            #         "id" : idIndvidual,
            #         "producto" : prd["producto_id"],
            #         "cantidad" : prd["cantidad"]
            #     }
            #     self.cnn.ejecutarInsercion("detalle_venta_individual",lista)
            
            idIndv = idIndvidual;


        else: idIndv = None;

        if(self.combo != None):
            idCombo = self.cnn.obtenerSiguienteIDRep("detalle_venta_combo","detalle_venta_combo_id")
            arr = self.combo
            for cmb in arr:

                lista = {
                    "id" : idCombo,
                    "producto" : cmb["combo_id"],
                    "cantidad" : cmb["cantidad"]
                }
                self.cnn.ejecutarInsercion("detalle_venta_combo",lista)
            
            idcmb = idCombo;
            
        else: idcmb = None;



        lista = {
            "id": "default",
            "detalle_venta_individual" : idIndv,
            "detalle_venta_combo" : idcmb,
            "total" : self.total,
            "empleado" : self.empleado,
            "cliente": self.cliente,
            "fechaHora" : self.fechaHora,
            "sucursal" : self.sucursal
        }

        print(lista);

        x = self.cnn.ejecutarInsercion("venta_producto",lista)

        if(x == "1"): return "Registrado con éxito!"
        else : return "Error de insercion"

    def getVentasProductos(self):
        datos =  self.cnn.ejecutarConsulta("venta_productos");
        lista = [];

        for linea in datos:
            lista.append({
                "ID" : linea[0],
                "articulo" : linea[1],
                "precio" : linea[2],
                "total_venta" : linea[3],
                "empleado" : linea[4],
                "cliente" : linea[5],
                "fecha" : linea[6],
                "sucursal" : linea[7]
            })
            
        return lista


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

