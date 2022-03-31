import CEmpleado,CPelicula
from flask import Flask,jsonify,request

app = Flask(__name__)

empleado = CEmpleado.empleado();



# lista.append += { "fila": datos[1]};
@app.route('/empleados/mostrar', methods=['GET'])
def mostrarEmpleados():
    return jsonify(empleado.mostrarEmpleados());

@app.route('/empleados/usuarios', methods=['GET'])
def mostrarUsuarios():
    return jsonify(empleado.mostrarUsuarios());

@app.route('/pelicula/registrar', methods=['POST'])
def registrarPelicula():
    with open("imagenes/a.jpg", "rb") as img:
        f = img.read()
        b = bytearray(f)
    peli = CPelicula.pelicula("piratas caribe",1,50,210,1,b);
    return peli.registrarPelicula()

