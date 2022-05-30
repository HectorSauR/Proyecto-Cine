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
        x = self.cnn.ejecutarInsercion("combo",lista);
        
        if(x == "1"): self.msg = "Registrado con exito!";
        else: self.msg = "Error en inserción";


    def getCombo(self):
        datos =  self.cnn.ejecutarConsulta("ver_combo");
        lista = [];

        for linea in datos:
            x = 0
            # print(x)
            for cmb in lista:
                # print(cmb)
                if(linea[0] == cmb["id"]):
                    producto = {
                        "nombre" : linea[3],
                        "tam" : linea[4],
                        "cantidad" : linea[5]
                    }
                    cmb["productos"].append(producto)
                    x=1
                    break
            
            if(x == 1): continue

            lista.append({
                "id": linea[0],
                "nombre" : linea[1],
                "precio" : linea[2],
                "productos" :[{
                    "nombre" : linea[3],
                    "tam" : linea[4],
                    "cantidad" : linea[5]
                }]
                
            })

        return lista



# cmb = combo();

# x = cmb.cnn.ejecutarConsulta("ver_combo");

# print(x)