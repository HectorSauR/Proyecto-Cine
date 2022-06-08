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
    
    def reiniciarConexion(self):
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
                    if(dato):
                        dato = "b\'" + str(1) + "\'"
                    else: dato = "b\'" + str(0) + "\'"

                if(dato == None or dato == 0):
                    dato = "default" 

                if i == 0:
                    cadenaTabla += str(dato)
                    i += 1
                    continue
                cadenaTabla += ","+str(dato)
            cadenaTabla+=")"

            print(cadenaTabla)

            self.cursor.execute(cadenaTabla)
            self.conexion.commit()
            return "1"
        except con.Error:
            return "Error al ejecutar insercion";

    def ejecutarConsulta(self,nombreConsulta:str,where:str = None):
        try:

            sql = "SELECT * FROM "+nombreConsulta
            if(where != None): sql += " "+where
            
            self.cursor.execute(sql);
                
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

    def ejecutarUpdate(self,nombreTabla:str,datos:list):
        try:
            cadenaTabla = "update "+nombreTabla+" set "
            i = 0

            arrKey = list(datos.keys());

            # print(arrKey)
            for dato in datos.values():
                # print(dato)
                if(arrKey[i] == "where"):
                    continue

                if type(dato) == str and dato != "default":
                    dato = "\"" + dato +"\""

                if type(dato) == bool:
                    if(dato):
                        dato = "b\'" + str(1) + "\'"
                    else: dato = "b\'" + str(0) + "\'"

                if(dato == None or dato == 0):
                    dato = "default" 
                
                if i == 0:
                    cadenaTabla +=  arrKey[i] + " = " + str(dato)
                    i += 1
                    continue
                

                cadenaTabla += ","+arrKey[i] + " = " + str(dato)
                
                i+=1
                
            # print(datos.__contains__("where"));
            if(datos.__contains__("where") == True):
                cadenaTabla += " " + datos["where"]

            print(cadenaTabla)

            self.cursor.execute(cadenaTabla)
            self.conexion.commit()
            return "1"
        except con.Error:
            return "Error al ejecutar insercion";

    def ejecutarConsultaCondicional(self,nombreConsulta:str, nombreColumna:str,valor):
        try:
            self.cursor.execute("SELECT * FROM "+nombreConsulta+"WHERE "+nombreColumna+" = "+valor);
            return self.cursor.fetchall();

        except con.Error:
            print("Error connecting to database");
    

#----------------------Pruebas--------------------------
# cnn = conexionBD()
# 
# lista = {
#     "id" : 1,
#     "cosa" : 2,
#     "where" : "WHERE id_coca = 1"
# }

# datos = cnn.ejecutarConsulta("unidad_medida")

# datos = cnn.ejecutarUpdate("venta_productos",lista);

# print(datos)

# for fila in datos:
    # print(fila)
