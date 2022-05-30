from ast import Try
from ctypes.wintypes import PINT
import mysql.connector as con
# falta consulta por parametros a
class conexionBD:
    
    def __init__(self):
        try:
            self.conexion = con.connect(user="root", password="123",host="localhost",database="db_cine");
            self.cursor = self.conexion.cursor()
        except con.Error:
            print("Error connecting to database");
    
    def ejecutarInsercion(self,nombreTabla:str,datos:list):
        try:
            cadenaTabla = "insert into "+nombreTabla+" values("
            i = 0
            
            for dato in datos.values():
                # print(dato)
                if type(dato) == str and dato != "default":
                    dato = "\"" + dato +"\""

                if type(dato) == bool:
                    dato = "b\'" + dato + "\'"

                if(dato == None or dato == 0):
                    dato = "default" 

                if i == 0:
                    cadenaTabla += str(dato)
                    i += 1
                    continue
                cadenaTabla += ","+str(dato)
            cadenaTabla+=")"

            # print(cadenaTabla)

            self.cursor.execute(cadenaTabla)
            self.conexion.commit()
            return "1"
        except con.Error:
            return "Error al ejecutar insercion";

    def ejecutarConsulta(self,nombreConsulta:str):
        try:
            self.cursor.execute("SELECT * FROM "+nombreConsulta);
            return self.cursor.fetchall();

        except con.Error:
            print("Error connecting to database");
    
    def obtenerSiguienteID(self,nombre:str):
        try:
            self.cursor.execute("SELECT count(*)+1 FROM "+nombre);
            return int(self.cursor.fetchone()[0]);
        except con.Error:
            print("Error connecting to database");
    
    def obtenerSiguienteIDRep(self,nombre:str , idT:str):
        try:
            self.cursor.execute("SELECT count(*) FROM "+nombre);
            if(int(self.cursor.fetchone()[0]) == 0):
                return 1;

            self.cursor.execute("SELECT "+idT+" FROM "+nombre + " order by "+ idT +" desc limit 1 ");
            return int(self.cursor.fetchone()[0])+1;
        except con.Error:
            print("Error connecting to database");
    

#----------------------Pruebas--------------------------
# cnn = conexionBD()

# datos = cnn.ejecutarConsulta("venta_productos");

# print(datos)

# for fila in datos:
    # print(fila)
