from ctypes.wintypes import PINT
import mysql.connector as con

class conexionBD:
    
    def __init__(self):
        self.conexion = con.connect(user="root", password="Roteh_gaby2013",host="localhost",database="db_cine");
    

# cnn = conexionBD()


# cursor = cnn.conexion.cursor();


# cursor.execute("SELECT * FROM empleado");

# datos = cursor.fetchall();

# for fila in datos:
#     print(fila)