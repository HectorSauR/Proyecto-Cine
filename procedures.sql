#-----------------------------PELICULA-------------------------
#CREATE PROCEDURE registrar_pelicula as

DELIMITER $$
create PROCEDURE registrarPelicula(
	IN nombre varchar(100),
    IN categoria int,
    IN duracion int,
    IN idioma int,
    IN precio float,
    IN imagen blob
)
BEGIN
	set @contador = (select count(*) from pelicula)+1;
    insert into pelicula values(
		@contador,
        nombre,
        categoria,
        duracion,
        idioma,
        precio,
        imagen);
	select * from pelicula;
END$$
#DELIMITER
drop procedure registrarPelicula;


call registrarPelicula ("cosa",1,210,1,50,'xd')