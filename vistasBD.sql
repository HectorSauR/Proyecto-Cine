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
inner join tam_producto on producto.tam_producto = tam_producto.tam_producto_id;

CREATE VIEW ver_usuarios as
select usuario,contrasena,puesto_id from empleado;

select * from ver_usuarios;