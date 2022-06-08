import CEmpleado,CPelicula,CProducto,CCombo,CCliente,CFuncion,CSucursal,CTarjeta,CVenta

from flask import Flask,jsonify,request

# set FLASK_APP=program
# set FLASK_DEV=development
# set FLASK_DEBUG=1

# flask run -h 26.77.197.154 -p 8000
# flask run


# 
# 
#    EL FORMATO DE HORA Y DE FECHA 
# 
# 
#   FECHA = 2020-12-31 // YY-MM-DD
#   
#   HORA = 12:00:00 // HH:MM:SS
# 
# 
# 

app = Flask(__name__)


# -------------------------------- Pruebas --------------------------------
@app.route('/')
def index():
    return "<h1>Servicio Web para un Cine</h1>"
# lista.append += { "fila": datos[1]};
@app.route('/empleados/mostrar', methods=['GET'])
def mostrarEmpleados():
    empleado = CEmpleado.empleado();
    
    return jsonify(empleado.mostrarEmpleados());

@app.route('/empleados/usuarios', methods=['GET'])
def mostrarUsuarios():
    empleado = CEmpleado.empleado();
    return jsonify(empleado.mostrarUsuarios());

# -------------------------------- Productos --------------------------------

@app.route('/productos/mostrar', methods=['GET'])
def mostrarProductos():
    producto = CProducto.producto();

    return jsonify(producto.getProducto());

@app.route('/productos/registrar', methods=['POST'])
def registrarProducto():
    datos = request.get_json();
    
    if(datos == None):
        return "No se encontraron datos en formato JSON";
    producto = CProducto.producto();
    
    producto.setProducto(
        datos["nombre"],
        datos["unidad_med"],
        datos["tam"],
        datos["precio"]
    )
    return producto.regProducto()

@app.route('/productos/mostrar/unidadMedida', methods=['GET'])
def mostrarUnidadesMedida():
    producto = CProducto.producto();
    
    return producto.getUnidadesMedida();

@app.route('/productos/mostrar/tamanio', methods=['GET'])
def mostrarTamanio():
    producto = CProducto.producto();
    
    return producto.getTamProducto();

# -------------------------------- Películas --------------------------------

@app.route('/pelicula/registrar', methods=['POST'])
def registrarPelicula():
    datos = request.get_json();
    
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
    return peli.regPelicula()

@app.route('/pelicula/mostrar', methods=['GET'])
def mostrarPeliculas():
    peli = CPelicula.pelicula();
    return jsonify(peli.getPelicula());

# -------------------------------- Combos --------------------------------

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
    combo = CCombo.combo();
    return jsonify(combo.getCombo());

# -------------------------------- Cliente --------------------------------

@app.route('/cliente/registrar', methods=['POST'])
def registrarCliente():
    datos = request.get_json();

    if(datos == None):
        return "No se encontraron datos en formato JSON";
    
    cliente = CCliente.cliente();
    
    cliente.setCliente(
        datos['nombre'],
        datos['apellido1'],
        datos['apellido2'],
        datos['cumple'],
        datos['tarjeta']);

    return cliente.regCliente();

@app.route('/cliente/mostrar', methods=['GET'])
def mostrarCliente():
    cliente = CCliente.cliente();
    
    return jsonify(cliente.getCliente());

# -------------------------------- Funcion --------------------------------

@app.route('/funcion/registrar', methods=['POST'])
def registrarFuncion():
    datos = request.get_json();

    if(datos == None):
        return "No se encontraron datos en formato JSON";
    
    funcion = CFuncion.funcion();
    # print(datos)
    funcion.setFuncion(
        datos['sala'],
        datos['pelicula'],
        datos['fecha'],
        datos['hora']
    );

    # return datos
    return funcion.regFuncion();

@app.route('/funcion/mostrar', methods=['GET'])
def mostrarFuncion():
    funcion = CFuncion.funcion();
    return jsonify(funcion.getFuncion());

@app.route('/funcion/asientosDisponibles', methods=['GET'])
def mostrarAsientosDisponibles():
    funcion = CFuncion.funcion();
    # print(funcion.getAsientosDisponibles())
    return jsonify(funcion.getAsientosDisponibles());
    # return "a"

@app.route('/funcion/sala/reiniciar')
def reiniciarSala():
    datos = request.get_json();

    funcion = CFuncion.funcion();

    return funcion.reiniciarSala(
        datos['sala'],
        datos['funcion']
    )
# -------------------------------- Sucursal --------------------------------

# -------------------------------- Tarjeta --------------------------------
@app.route('/tarjeta/mostrar', methods=['GET'])
def mostrarTarjeta():
    tarjeta = CTarjeta.tarjeta();
    return jsonify(tarjeta.getTarjetas());

@app.route('/tarjeta/registrar', methods=['POST'])
def registrarTarjeta():
    datos = request.get_json();

    if(datos == None):
        return "No se encontraron datos en formato JSON";
    
    tarjeta = CTarjeta.tarjeta();
    
    tarjeta.setTarjeta(
        datos['nombre'],
        datos['beneficios'],
        datos['puntosNecesarios']
    );

    return tarjeta.regTarjeta();

# -------------------------------- Venta --------------------------------

@app.route('/venta/productos/mostrar', methods=['GET'])
def mostrarVenta():
    venta = CVenta.venta();
    # print(venta.getVentasProductos());
    return jsonify(venta.getVentasProductos());

@app.route('/venta/producto/registrar', methods=['POST'])
def registrarVenta():
    datos = request.get_json();

    if(datos == None):
        return "No se encontraron datos en formato JSON";
    
    venta = CVenta.venta();
    
    venta.setVentaProducto(
        datos['total'],
        datos['empleado'],
        datos['fecha'],
        datos["cliente"],
        datos["productos"],
        datos["combo"]
    );

    return venta.regVentaProducto();

@app.route('/venta/boleto/mostrar', methods=['GET'])
def mostrarVentaboleto():
    venta = CVenta.venta();
    # print(venta.getVentasProductos());
    return jsonify(venta.getVentasBoletos());

@app.route('/venta/boleto/registrar', methods=['POST'])
def registrarVentaBoleto():
    datos = request.get_json();

    if(datos == None):
        return "No se encontraron datos en formato JSON";
    
    venta = CVenta.venta();
    
    venta.setVentaBoleto(
        datos["cantidad"],
        datos["funcion"],
        datos["empleado"],
        datos["cliente"],
        datos["fechaHora"],
        datos["asientos"],
        datos["total"],
        datos["sala"]
    );

    return venta.regVentaBoleto();