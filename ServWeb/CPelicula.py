import ConexionBD

class pelicula:
    cnn = ConexionBD.conexionBD()

    #registrar pelicula
    def __init__(self,nombre:str,categoria:int,precio:float,dur:int,lang:int,img:bytes):
        self.nombre_pelicula = nombre
        self.categoria_id = categoria
        self.precio_boleto = precio
        self.duracion_pelicula = dur
        self.idioma_pelicula_id = lang
        self.imagen_pelicula = img

    def registrarPelicula(self):
        lista = {
            "id" : 3,
            "nombre" : self.nombre_pelicula,
            "cat" : self.categoria_id,
            "duracion" : self.duracion_pelicula,
            "idioma" : self.idioma_pelicula_id,
            "precio" : self.precio_boleto,
            "imagen" : self.imagen_pelicula,
        }
        self.cnn.ejecutarInsercion("pelicula",lista)
        return 'Ejecutado con exito!'
