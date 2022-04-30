import CEmpleado,CPelicula,CProducto,CCombo

from flask import Flask,jsonify,request

app = Flask(__name__)

empleado = CEmpleado.empleado();
producto = CProducto.producto();


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

    combo = CCombo.combo();

    # print(datos['productos'])
    combo.setCombo(
        datos['nombre'],
        datos['precio'],
        datos['productos']
    )

    # for a in datos['productos']:
    #     print(a["id"])
    #     print(a["cantidad"])

    # return "xd";
    combo.regCombo();

    return combo.msg;



