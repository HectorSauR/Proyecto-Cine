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

        return datos
        

