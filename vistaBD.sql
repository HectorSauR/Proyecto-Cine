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

select * from db_cine.combo; 

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
        CONCAT(sala.numAsiento,"-",sala.filaAsientos) AS Asiento,
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

select * from tarjeta_cine;


create view venta_productos as
    Select
        v.venta_producto_id  as ID,
        vprd.Nombre_Combo as Nombre,
        vprd.Precio_Combo as Precio,
        total_venta_producto as Total_Venta,
        concat(empleado.nombre_empleado," ",empleado.apellido1_empleado," ",empleado.apellido2_empleado) as Empleado,
        concat(cliente.nombre_cliente," ",cliente.apellido1_cliente," ",cliente.apellido2_cliente) as Cliente,
        convert(fechaHora,char) as Fecha,
        v.sucursal_id
    From
        venta_producto v
            LEFT JOIN
        cliente ON v.cliente_id = cliente.cliente_id
            INNER JOIN
        empleado ON v.empleado_id = empleado.empleado_id 
            INNER JOIN
        venta_prd vprd ON vprd.ID = v.venta_producto_id


create view venta_prd as
    select * FROM ventas_productos_combo 
    UNION select * FROM ventas_productos_individual;

select * from venta_prd;

alter view ventas_productos_combo as
    Select
        v.venta_producto_id  as ID,
        combo.nombre_combo as Nombre_Combo,
        combo.precio_combo as Precio_Combo
    From
        venta_producto as v
            left JOIN
                detalle_venta_combo as dc 
                    ON v.detalle_venta_combo = dc.detalle_venta_combo_id
            INNER JOIN
        combo ON combo.combo_id = dc.combo_id

select * from ventas_productos_combo;

select * from ventas_productos_individual;

alter view ventas_productos_individual as
    Select
        venta_producto.venta_producto_id  as ID,
        concat(producto.nombre_producto," ",tam_producto.nombre_tam) as Nombre_Producto,
        producto.precio_producto as Precio_Producto
    From
        venta_producto
            INNER JOIN
        detalle_venta_individual ON venta_producto.detalle_venta_individual = detalle_venta_individual.detalle_venta_individual_id
            INNER JOIN
        producto ON producto.producto_id = detalle_venta_individual.producto_id
            INNER JOIN
        tam_producto ON producto.tam_producto_id = tam_producto.tam_producto_id
    


