import ConexionBD

class pelicula:
    cnn = ConexionBD.conexionBD()

    #registrar pelicula
    def setPelicula(self,nombre:str,categoria:int,precio:float,dur:int,lang:int,img:str):
        self.nombre_pelicula = nombre
        self.categoria_id = categoria
        self.precio_boleto = precio
        self.duracion_pelicula = dur
        self.idioma_pelicula_id = lang
        self.imagen_pelicula = img

    def regPelicula(self):

        id = self.cnn.obtenerSiguienteID("pelicula");

        lista = {
            "id" : id,
            "nombre" : self.nombre_pelicula,
            "cat" : self.categoria_id,
            "duracion" : self.duracion_pelicula,
            "idioma" : self.idioma_pelicula_id,
            "precio" : self.precio_boleto,
            "imagen" : self.imagen_pelicula,
        }
        try:
            self.cnn.ejecutarInsercion("pelicula",lista)
            return 'Ejecutado con exito!'
        except Exception:
            return 'Error al hacer la insercion';

    def getPelicula(self):
        try:
            datos = self.cnn.ejecutarConsulta("ver_pelicula");
            lista = [];

            for linea in datos:
                lista.append({
                    "nombre" : linea[0],
                    "categoria" : linea[1],
                    "duracion" : linea[2],
                    "idioma" : linea[3],
                    "precio" : linea[4],
                    "imagen" : linea[5]
                })

            return lista
        except Exception:
            return 'Error al hacer la conexion';
