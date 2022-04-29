import mysql.connector as con
import CProducto


producto = CProducto.producto();


r = producto.verProducto();

print (r)

# lista = {
#             "nombre" : "a",
#             "cat" : "b",
#             "duracion" : "c",
#             "idioma" : "d",
#             "precio" : "e",
#             "imagen" : "f",
#         }

# lista2 = []
# for value in lista.values():
#     lista2.append(value)


# # # lista2.append("")
# # print(lista2)
# print(lista2)

# with open("imagenes/a.jpg", "rb") as img:
#     f = img.read()
#     b = bytearray(f)

# print(b)

# conexion = con.connect(user="root", password="Roteh2345@",host="localhost",database="db_cine");
# cursor = conexion.cursor()

# with open("imagenes/a.jpg", "rb") as img:
#         f = img.read()
#         b = bytearray(f)

# print(type(b))

# sql = "INSERT INTO db_cine.pelicula (pelicula_id, nombre_pelicula, categoria_id, duracion_pelicula, idoma_pelicula_id, precio_boleto, imagen_pelicula) VALUES({0}, \"{1}\", {2}, {3}, {4}, {5}, \'{6}\');".format(1,str("piratas"),1,210,1,50.00,'\u0041')
# sql = "INSERT INTO db_cine.pelicula VALUES(2, \"pikachu\", 1, 120, 1, 55.00, \'B\');"
# sql = "asd"
# if type(sql) == str:
#     print("si") 
# print(sql)
# cursor.execute(sql)
# conexion.commit()

