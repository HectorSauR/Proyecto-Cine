create view ver_empleados as
select  `empleado`.`empleado_id`,
    `empleado`.`nombre_empleado`,
    `empleado`.`apellido1_empleado`,
    `empleado`.`apellido2_empleado`,
    `empleado`.`direccion`,
    `empleado`.`puesto_id`,
    `empleado`.`sucursal_id`
FROM `db_cine`.`empleado`;

ALTER VIEW ver_producto AS
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

Alter VIEW ver_clientes AS
    SELECT 
        nombre_cliente as Nombre,
        apellido1_cliente as Apellido_1,
        apellido2_cliente as Apellido_2,
        DATE_FORMAT(fecha_cumple, '%Y/%m/%d') as cumple, 
        tarjeta_cine.nombre_tarjeta as Tarjeta
    FROM
        cliente
            INNER JOIN
        tarjeta_cliente ON cliente.tarjeta_cliente_id = tarjeta_cliente.tarjeta_cliente_id
            INNER JOIN
        tarjeta_cine ON tarjeta_cliente.tarjeta_cine_id = tarjeta_cine.tarjeta_cine_id;

select * from ver_clientes;
select * from cliente;
select * from tarjeta_cliente;
select * from tarjeta_cine;

delete from cliente where cliente_id > 1;
delete from tarjeta_cliente where tarjeta_cliente_id > 1;


INSERT INTO tarjeta_cliente values(1,0,1);

INSERT INTO cliente values(1,"Elder","Sauceda","Ruiz","14/03/00",1);

update cliente set fecha_cumple = "00/03/14" where cliente_id = 1;

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

ALTER VIEW ver_funciones AS
    SELECT 
        pelicula.nombre_pelicula AS nombre,
        categoria.nombreCategoria AS categoria,
        pelicula.duracion_pelicula AS duracion,
        idioma.nombreIdioma AS idioma,
        pelicula.precio_boleto AS precio,
        DATE_FORMAT(fecha, '%Y/%m/%d') as Fecha,
        convert(hora,char) as Hora,
        sala_id
    FROM
        funcion
            INNER JOIN
        pelicula ON funcion.pelicula_id = pelicula.pelicula_id
            INNER JOIN
        categoria ON pelicula.categoria_id = categoria.categoria_id
            INNER JOIN
        idioma ON pelicula.idoma_pelicula_id = idioma.idioma_id;

select * from ver_funciones;

ALTER VIEW ver_asientos_disponibles AS
    SELECT 
        pelicula.nombre_pelicula AS nombre,
        CONCAT(sala.numAsiento, sala.filaAsientos) AS Asiento,
        DATE_FORMAT(fecha, '%Y/%m/%d') as Fecha,
        convert(hora,char) as Hora,
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




create view ventas_productos as
    Select
        venta_producto_id  as ID
    From
        venta_producto
            inner join
        cliente on venta_producto.cliente_id = cliente.cliente_id
            inner join
        detalle_venta_combo on venta_producto.detalle_venta_combo = detalle_venta_combo.detalle_venta_combo_id
            inner join
        detalle_venta_individual on venta_producto.detalle_venta_individual = detalle_venta_individual.detalle_venta_individual_id
    













