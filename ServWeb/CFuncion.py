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
            lista.append({
                "nombre" : linea[0],
                "asientos" : [linea[1]],
                "fecha" : linea[2],
                "hora" : linea[3],
                "sala" : linea[4]
            })
            
        return lista 