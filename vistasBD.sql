create view ver_empleados as
select  `empleado`.`empleado_id`,
    `empleado`.`nombre_empleado`,
    `empleado`.`apellido1_empleado`,
    `empleado`.`apellido2_empleado`,
    `empleado`.`direccion`,
    `empleado`.`puesto_id`,
    `empleado`.`sucursal_id`
FROM `db_cine`.`empleado`;

create view ver_producto as
select nombre_producto as producto,tam_producto.nombre_tam as tamaño,unidad_medida.nombre_unidad_medida as unidad_medida,precio_producto as precio from producto
inner join unidad_medida on producto.unidad_medida_id = unidad_medida.unidada_medida_id
inner join tam_producto on producto.tam_producto_id = tam_producto.tam_producto_id;

select * from ver_producto;

CREATE VIEW ver_usuarios as
select usuario,contrasena,puesto_id from empleado;

create view ver_clientes as
select nombre_cliente,apellido1_cliente,apellido2_cliente,fecha_cumple,tarjeta_cine.nombre_tarjeta from cliente
inner join tarjeta_cliente on cliente.tarjeta_cliente_id = tarjeta_cliente.tarjeta_cliente_id
inner join tarjeta_cine on tarjeta_cliente.tarjeta_cine_id = tarjeta_cine.tarjeta_cine_id;
select * from ver_usuarios;

create view ver_combo as
select combo.combo_id as ID,combo.nombre_combo as nombreCombo, combo.precio_combo as precio, producto.nombre_producto as nombreProd, tam_producto.nombre_tam as tamano, detalle_combo.cantidad as cantidad from detalle_combo
inner join combo on combo.detalle_combo_id = detalle_combo.detalle_combo_id
inner join producto on detalle_combo.producto_id = producto.producto_id
inner join tam_producto on producto.tam_producto_id = tam_producto.tam_producto_id;


create view ver_pelicula as
select nombre_pelicula as nombre, categoria.nombreCategoria as categoria, duracion_pelicula as duracion, idioma.nombreIdioma as idioma,precio_boleto as precio, imagen_pelicula as ruta from pelicula
inner join categoria on pelicula.categoria_id = categoria.categoria_id
inner join idioma on pelicula.idoma_pelicula_id = idioma.idioma_id;

create view ver_funciones as
select pelicula.nombre_pelicula as nombre, 
	categoria.nombreCategoria as categoria, 
	pelicula.duracion_pelicula as duracion,
    idioma.nombreIdioma as idioma,
    pelicula.precio_boleto as precio, 
	fecha,
    hora,
    sala_id
    from funcion
inner join pelicula on funcion.pelicula_id = pelicula.pelicula_id
inner join categoria on pelicula.categoria_id = categoria.categoria_id
inner join idioma on pelicula.idoma_pelicula_id = idioma.idioma_id;

create view ver_asientos_disponibles as
select 
	pelicula.nombre_pelicula as nombre,
    concat(sala.numAsiento,sala.filaAsientos) as Asiento,
	fecha,
    hora,
    funcion.sala_id
    from funcion
inner join pelicula on funcion.pelicula_id = pelicula.pelicula_id
inner join sala on funcion.sala_id = sala.sala_id
where estadoAsiento = 1
order by funcion_id;

select * from ver_asientos_disponibles;

select * from sala;















