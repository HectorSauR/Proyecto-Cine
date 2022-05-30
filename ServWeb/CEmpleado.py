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
    usuario = ""
    contrasena = ""
    cnn = ConexionBD.conexionBD()
    
    #constructor
    # def __init__(self):
        
    
    #métodos
    def mostrarEmpleados(self):#Encapsulamiento
        
        datos = self.cnn.ejecutarConsulta("ver_empleados");
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

    def mostrarUsuarios(self):#Encapsulamiento
        datos =  self.cnn.ejecutarConsulta("ver_usuarios");
        lista = [];

        for linea in datos:
            lista.append({
                "usuario" : linea[0],
                "contra" : linea[1],
                "puesto_id" : linea[2]
            })
            
        return lista

