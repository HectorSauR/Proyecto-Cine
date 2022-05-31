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
        datos =  self.cnn.ejecutarConsulta("ver_funciones");
        lista = [];

        for linea in datos:
            lista.append({
                "nombre" : linea[0],
                "categoria" : linea[1],
                "duracion" : linea[2],
                "idioma" : linea[3],
                "precio" : linea[4],
                "fecha" : linea[5],
                "hora" : linea[6],
                "sala" : linea[7]
            })
            
        return lista 

    def getAsientosDisponibles(self):
        datos =  self.cnn.ejecutarConsulta("ver_asientos_disponibles");
        lista = [];
        
        for linea in datos:
            x = 0
            for dato in lista:
                if(dato["sala"] == linea[4]):
                    dato["asientos"].append(linea[1])
                    x = 1
                    continue
            if(x == 1): continue

            lista.append({
                "nombre" : linea[0],
                "asientos" : [linea[1]],
                "fecha" : linea[2],
                "hora" : linea[3],
                "sala" : linea[4]
            })
            
        return lista

    def actualizarAsientos(self, asientos:str,sala:int):
        if(len(asientos) < 3):
            lista = {
                "estadoAsiento" : False,
                "where" : "WHERE sala_id = "+str(sala)+" and asiento = \""+asientos+"\""
            }
            self.cnn.ejecutarUpdate("sala",lista)
            return
        
        arr = asientos.split(",")
        

        for dato in arr:
            lista = {
                "estadoAsiento" : False,
                "where" : "WHERE sala_id = "+str(sala)+" and asiento = \""+dato+"\""
            }
            self.cnn.ejecutarUpdate("sala",lista)

    def reiniciarSala(self,sala:int):

        lista = {
            "estadoAsiento" : True,
            "where" : "WHERE sala_id = "+str(sala)
        }
        self.cnn.ejecutarUpdate("sala",lista)


        


    def registrarAsientos(self):
        lista = ["A","B","C","D"]

        for a in lista:
            for b in range(8):

                objeto = {
                    "sala" : 3,
                    "asiento" : str(b+1)+a,
                    "estado" : True,
                    "sucursal" : 1
                }

                # print(objeto)   
                self.cnn.ejecutarInsercion("sala",objeto)

# fun = funcion();

# fun.actualizarAsientos("1A,2A,3A",2)

# fun.reiniciarSala(2)
