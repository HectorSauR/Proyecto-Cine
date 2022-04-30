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

select * from ver_usuarios;

create view ver_combo as
select combo.nombre_combo as nombreCombo, combo.precio_combo as precio, producto.nombre_producto as nombreProd, detalle_combo.cantidad as cantidad from combo
inner join detalle_combo on combo.detalle_combo_id = detalle_combo.detalle_combo_id
inner join producto on detalle_combo.producto_id = producto.producto_id;


















