create view ver_empleados as
select  `empleado`.`empleado_id`,
    `empleado`.`nombre_empleado`,
    `empleado`.`apellido1_empleado`,
    `empleado`.`apellido2_empleado`,
    `empleado`.`direccion`,
    `empleado`.`puesto_id`,
    `empleado`.`sucursal_id`
FROM `db_cine`.`empleado`;

CREATE VIEW ver_producto AS
    SELECT 
        producto.nombre_producto AS producto,
        tam_producto.nombre_tam AS tamaño,
        unidad_medida.nombre_unidad_medida AS unidad_medida,
        producto.precio_producto AS precio
    FROM
        producto
            INNER JOIN
        unidad_medida ON producto.unidad_medida_id = unidad_medida.unidada_medida_id
            INNER JOIN
        tam_producto ON producto.tam_producto_id = tam_producto.tam_producto_id;

SELECT 
    *
FROM
    ver_producto;

CREATE VIEW ver_usuarios AS
    SELECT 
        usuario, contrasena, puesto_id
    FROM
        empleado;

CREATE VIEW ver_clientes AS
    SELECT 
        nombre_cliente,
        apellido1_cliente,
        apellido2_cliente,
        fecha_cumple,
        tarjeta_cine.nombre_tarjeta
    FROM
        cliente
            INNER JOIN
        tarjeta_cliente ON cliente.tarjeta_cliente_id = tarjeta_cliente.tarjeta_cliente_id
            INNER JOIN
        tarjeta_cine ON tarjeta_cliente.tarjeta_cine_id = tarjeta_cine.tarjeta_cine_id;

SELECT 
    *
FROM
    ver_usuarios;

CREATE VIEW ver_combo AS
    SELECT 
        combo.combo_id AS id,
        combo.nombre_combo AS nombreCombo,
        combo.precio_combo AS precio,
        producto.nombre_producto AS nombreProd,
        tam_producto.nombre_tam AS tamano,
        detalle_combo.cantidad AS cantidad
    FROM
        detalle_combo
            INNER JOIN
        combo ON combo.detalle_combo_id = detalle_combo.detalle_combo_id
            INNER JOIN
        producto ON detalle_combo.producto_id = producto.producto_id
            INNER JOIN
        tam_producto ON producto.tam_producto_id = tam_producto.tam_producto_id;


CREATE VIEW ver_pelicula AS
    SELECT 
        nombre_pelicula AS nombre,
        categoria.nombreCategoria AS categoria,
        duracion_pelicula AS duracion,
        idioma.nombreIdioma AS idioma,
        precio_boleto AS precio,
        imagen_pelicula AS ruta
    FROM
        pelicula
            INNER JOIN
        categoria ON pelicula.categoria_id = categoria.categoria_id
            INNER JOIN
        idioma ON pelicula.idoma_pelicula_id = idioma.idioma_id;

CREATE VIEW ver_funciones AS
    SELECT 
        pelicula.nombre_pelicula AS nombre,
        categoria.nombreCategoria AS categoria,
        pelicula.duracion_pelicula AS duracion,
        idioma.nombreIdioma AS idioma,
        pelicula.precio_boleto AS precio,
        fecha,
        hora,
        sala_id
    FROM
        funcion
            INNER JOIN
        pelicula ON funcion.pelicula_id = pelicula.pelicula_id
            INNER JOIN
        categoria ON pelicula.categoria_id = categoria.categoria_id
            INNER JOIN
        idioma ON pelicula.idoma_pelicula_id = idioma.idioma_id;

CREATE VIEW ver_asientos_disponibles AS
    SELECT 
        pelicula.nombre_pelicula AS nombre,
        CONCAT(sala.numAsiento, sala.filaAsientos) AS Asiento,
        fecha,
        hora,
        funcion.sala_id
    FROM
        funcion
            INNER JOIN
        pelicula ON funcion.pelicula_id = pelicula.pelicula_id
            INNER JOIN
        sala ON funcion.sala_id = sala.sala_id
    WHERE
        estadoAsiento = 1
    ORDER BY funcion_id;

SELECT 
    *
FROM
    ver_asientos_disponibles;

SELECT 
    *
FROM
    sala;















