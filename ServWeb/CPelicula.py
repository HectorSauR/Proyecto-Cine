import ConexionBD

class pelicula:
    nombre_pelicula = ""
    categoria_id = 0
    duracion_pelicula = 0
    idioma_pelicula_id = 0
    precio_boleto = 0
    imagen_pelicula = 0
    cnn = ConexionBD.conexionBD()

    #registrar pelicula
    def __init__(self,nombre:str,categoria:int,precio:float,dur:int,lang:int,img:bytes):
        self.nombre_pelicula = nombre
        self.categoria_id = categoria
        self.precio_boleto = precio
        self.duracion = dur
        self.idioma = lang
        self.imagen = img

    def registrarPelicula(self):
        lista = {
            "id" : 2,
            "nombre" : self.nombre_pelicula,
            "cat" : self.categoria_id,
            "duracion" : self.duracion_pelicula,
            "idioma" : self.idioma_pelicula_id,
            "precio" : self.precio_boleto,
            "imagen" : self.imagen_pelicula,
        }
        self.cnn.ejecutarInsercion("pelicula",lista)
        return 'Ejecutado con exito!'
