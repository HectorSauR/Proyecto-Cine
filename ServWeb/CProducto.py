import ConexionBD;

class producto:

    cnn = ConexionBD.conexionBD()

    def setProducto(self,nombre:str,unidad_med:int,tam:int,precio:float):
        self.name = nombre;
        self.UdMed = unidad_med;
        self.size = tam;
        self.cost = precio;
        self.msg = "";

    def regProducto(self):
        if(self.name == None):
            self.msg = "No hay producto a registrar en este objeto";
            return self.msg;

        id = self.cnn.obtenerSiguienteID("producto");

        lista = {
            "id" : id,
            "nombre" : self.name,
            "unidad_medida" : self.UdMed,
            "tam_producto" : self.size,
            "precio_producto" : self.cost
        }

        self.cnn.ejecutarInsercion("pelicula",lista)
        self.msg = "Registrado con exito!";
        return 
    
    def setUnidadMedida(self,name:str, abrv:str = "default"):

        id = self.cnn.obtenerSiguienteID("unidad_medida");

        lista = {
            "id" : id,
            "nombre" : name,
            "abreviacion" : abrv
        }

        self.cnn.ejecutarInsercion("unidad_medida",lista);
        self.msg = "Registrado con exito!";
        return

    def getUnidadesMedida(self):
        datos =  self.cnn.ejecutarConsulta("unidad_medida");
        lista = [];

        for linea in datos:
            lista.append({
                "identificador": linea[0],
                "nombre" : linea[1],
                "abreviación" : linea[2]
            })

        return lista

    def setTamProducto(self,size:str, abrv:str = "default"):

        id = self.cnn.obtenerSiguienteID("tam_producto");

        lista = {
            "id" : id,
            "tamano" : size,
            "abreviacion" : abrv
        }

        self.cnn.ejecutarInsercion("tam_producto",lista);
        self.msg = "Registrado con exito!";
        return

    def getTamProducto(self):
        datos =  self.cnn.ejecutarConsulta("tam_producto");
        lista = [];

        for linea in datos:
            lista.append({
                "identificador": linea[0],
                "nombre" : linea[1],
                "abreviación" : linea[2]
            })

        return lista

    def getProducto(self):
        datos =  self.cnn.ejecutarConsulta("ver_producto");
        lista = [];
        print(datos)
        for linea in datos:
            lista.append({
                "id" : linea[0],
                "producto": linea[1],
                "tam" : linea[2],
                "unidadMedida" : linea[3],
                "precio" : linea[4]
            })

        return lista
