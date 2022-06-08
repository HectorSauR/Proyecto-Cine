import ConexionBD;

class tarjeta:

    cnn = ConexionBD.conexionBD()

    def setTarjeta(self,nombre:str,beneficios:str,puntos_necesarios:int):
        self.nombre = nombre;
        self.beneficios = beneficios;
        self.puntos_necesarios = puntos_necesarios;
    
    def regTarjeta(self):
        ident = self.cnn.obtenerSiguienteID("tarjeta_cine");

        lista = {
            "id": ident,
            "nombre" : self.nombre,
            "beneficios" : self.beneficios,
            "puntos_necesarios" : self.puntos_necesarios
        }

        x = self.cnn.ejecutarInsercion("tarjeta_cine",lista);
        
        if(x == "1"): return "Registrado con éxito!"
        else: return "Error de inserción";

    def getTarjetas(self):
        datos =  self.cnn.ejecutarConsulta("tarjeta_cine");
        lista = [];

        for linea in datos:
            lista.append({
                "id" : linea[0],
                "nombre" : linea[1],
                "beneficios" : linea[2],
                "puntosNecesarios" : linea[3]
            })
            
        return lista 


