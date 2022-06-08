
select * from venta_productos;

using db_cine;

ALTER TABLE `empleado` ADD `usuario` varchar(80) NOT NULL,
ADD `contrasena` varchar(80) NOT NULL
 
select * from empleado;

create view ver_empleados as
select  `empleado`.`empleado_id`,
    `empleado`.`nombre_empleado`,
    `empleado`.`apellido1_empleado`,
    `empleado`.`apellido2_empleado`,
    `empleado`.`direccion`,
    `empleado`.`puesto_id`,
    `empleado`.`sucursal_id`
FROM `db_cine`.`empleado`;


CREATE VIEW ver_usuarios as
select usuario,contrasena,puesto_id from empleado;

select * from ver_usuarios;

INSERT into idioma values (1,"Español");

alter view venta_productos as
    Select
        v.venta_producto_id  as ID,
        vprd.Nombre_Combo as Nombre,
        convert(vprd.Precio_Combo,char) as Precio,
        convert(total_venta_producto,char) as Total_Venta,
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

select * from detalle_venta_individual;

select * from venta_producto;

select * from detalle_venta_combo;