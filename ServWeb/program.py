import CEmpleado,CPelicula,CProducto,CCombo

from flask import Flask,jsonify,request

# set FLASK_APP=program
# set FLASK_DEV=development
# set FLASK_DEBUG=1

# flask run

app = Flask(__name__)

empleado = CEmpleado.empleado();
producto = CProducto.producto();
combo = CCombo.combo();

@app.route('/')
def index():
    return "Hola :D"
# lista.append += { "fila": datos[1]};
@app.route('/empleados/mostrar', methods=['GET'])
def mostrarEmpleados():
    return jsonify(empleado.mostrarEmpleados());

@app.route('/empleados/usuarios', methods=['GET'])
def mostrarUsuarios():
    return jsonify(empleado.mostrarUsuarios());

@app.route('/productos/mostrar', methods=['GET'])
def mostrarProductos():
    return jsonify(producto.verProducto());

@app.route('/pelicula/registrar', methods=['POST'])
def registrarPelicula():
    datos = request.get_json();
    # print(ejemplo['nombre']);
    # return ejemplo['nombre']
    if(datos == None):
        return "No se encontraron datos en formato JSON";
    peli = CPelicula.pelicula();
    peli.setPelicula(
        datos['nombre'],
        datos['categoria'],
        datos['precio'],
        datos['duracion'],
        datos['lenguaje'],
        datos['imagen']);
    return peli.registrarPelicula()

@app.route('/combo/registrar', methods=['POST'])
def registrarCombo():
    datos = request.get_json();
    
    if(datos == None):
        return "No se encontraron datos en formato JSON";
    
    combo = CCombo.combo();

    combo.setCombo(
        datos['nombre'],
        datos['precio'],
        datos['productos']
    )

    combo.regCombo();

    return combo.msg;


@app.route('/combo/mostrar', methods=['GET'])
def mostrarCombo():
    return jsonify(combo.getCombo());

