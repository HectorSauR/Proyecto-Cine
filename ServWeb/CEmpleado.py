import ConexionBD 

class empleado:

    #atributos
    idEmpleado = 0
    nombre = ""
    apellido1 = ""
    apellido2 = ""
    direccion = ""
    idPuesto = 0
    idSucursal = 0
    cnn = ConexionBD.conexionBD()
    cursor = cnn.conexion.cursor();
    
    #constructor
    # def __init__(self):
        
    
    #métodos
    def mostrarEmpleados(self):#Encapsulamiento
        self.cursor.execute("SELECT * FROM empleado");

        datos = self.cursor.fetchall();
        lista = [];
        for linea in datos:
            lista.append({
                "nombre" : linea[1],
                "apellido1" : linea[2],
                "apellido2" : linea[3],
                "direccion" : linea[4],
                "idPuesto" : linea[5],
                "idSucursal" : linea[6]
            })

        return lista
        

