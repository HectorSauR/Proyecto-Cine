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



