import ConexionBD;

class venta:

    cnn = ConexionBD.conexionBD();

    def registrarVentaProducto(self):
        lista = {
            "id" : "default",
            "nombre" : self.nombre_pelicula,
            "cat" : self.categoria_id,
            "duracion" : self.duracion_pelicula,
            "idioma" : self.idioma_pelicula_id,
            "precio" : self.precio_boleto,
            "imagen" : self.imagen_pelicula,
        }
