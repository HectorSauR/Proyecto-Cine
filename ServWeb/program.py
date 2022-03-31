import CEmpleado
from flask import Flask,jsonify

app = Flask(__name__)

empleado = CEmpleado.empleado();



# lista.append += { "fila": datos[1]};
@app.route('/empleados/mostrar', methods=['GET'])
def mostrarEmpleados():
    return jsonify(empleado.mostrarEmpleados());







