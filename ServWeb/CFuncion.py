import ConexionBD;

class funcion:


    def setFuncion(self, sala:int, pelicula:int, fecha:str,hora:str):
        self.sala = sala
        self.pelicula = pelicula
        self.fecha = fecha
        self.hora = hora

    def regFuncion(self):
        cnn = ConexionBD.conexionBD()

        ident = cnn.obtenerSiguienteID("funcion");

        lista = {
            "id" : ident,
            "sala" : self.sala,
            "pelicula" : self.pelicula,
            "fecha" : self.fecha,
            "hora" : self.hora
        }
        # print(lista);
        x = cnn.ejecutarInsercion("funcion",lista);

        if(x == "1"): return "Registrado con éxito!"
        else : return "Error"

    def getFuncion(self):
        cnn = ConexionBD.conexionBD()
        datos =  cnn.ejecutarConsulta("ver_funciones");
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
        cnn = ConexionBD.conexionBD()
        # me devuelve la seleccion de los asientos ocupados funcion/fecha/asientos
        datos =  cnn.ejecutarConsulta("ver_asientos_disponibles");

        # SEPARAR POR FUNCION Y ASIENTOS
        funciones = []

        for linea in datos:
            x = 0
            for funcion in funciones:

                if(funcion["funcion"] == linea[0]):
                    funcion["asientos"] += ","+linea[2];
                    x = 1
                    break
            if(x == 1): continue
            
            funciones.append({
                "funcion" : linea[0],
                "fechaHora" :linea[1],
                "asientos" : linea[2]
            })
        
        # print(funciones)

        return funciones

    def actualizarAsientos(self, asientos:str,funcion:int):
        cnn = ConexionBD.conexionBD()

        where = "where funcion_id = "+str(funcion)
        

        datos =  cnn.ejecutarConsulta("venta_boleto",where);
        
        # print(datos[0][7])


        x = 0
        ocupados = ""

        for dato in datos:
            x+=1
            if(x == 1): 
                ocupados += dato[7] 
                continue

            ocupados += ","+dato[7]

        arrOcupados = ocupados.split(",")

        # print(arrOcupados)


        if(len(asientos) < 3):
            for x in arrOcupados:
                if(x == asientos): return 0

            # print("xd")
            return 1

        arrVenta = asientos.split(",")

        # print(arrOcupados,arrVenta)
        for x in arrVenta:
            for y in arrOcupados:
                print(x,y)
                if(x == y): return 0
        # print("gg")
        return 1

    def reiniciarSala(self,sala:int):
        cnn = ConexionBD.conexionBD()
        cnn.reiniciarConexion();

        lista = {
            "estadoAsiento" : True,
            "where" : "WHERE sala_id = "+str(sala)
        }
        x = cnn.ejecutarUpdate("sala",lista)

        if(x == "1"): return "Accion realizada con éxito!"
        else : return "Error"

        


    def registrarAsientos(self):
        cnn = ConexionBD.conexionBD()
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
                cnn.ejecutarInsercion("sala",objeto)

# fun = funcion();

# print(fun.getAsientosDisponibles())


# print(fun.actualizarAsientos("3A,4A,5A,2A","2000-08-25 09:00:00",1))

