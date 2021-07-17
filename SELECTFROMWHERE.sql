/*muestra los datos menores a 50*/
SELECT * FROM posts WHERE id < 50 ;
/*muestra los post donde su estatus sea activo*/
SELECT * FROM posts WHERE estatus = 'activo' ;
/*muestra los post donde su estatus sea inactivo*/
SELECT * FROM posts WHERE estatus = 'inactivo' ;
/*muestra los post donde su estatus SEA DIFERENTE DE 50*/
SELECT * FROM posts WHERE id != 50 ;
/*muestra los post donde los titulos se asemenjen ala palabra encerrada en %palabr%*/
SELECT * FROM posts WHERE titulo LIKE  '%Escandalo%' ;
/*muestra las publicaciones donde la fecha de publicacion sea mayor a una fecha dada*/
SELECT	* FROM		posts WHERE	fecha_publicacion > '2025-01-01';
/*MUESTRA LOS POST DONDE LA FECHA DE PUBLICACION ESTE ENTRE 01/01/23 Y 31/12/25*/
SELECT	* FROM		posts WHERE	fecha_publicacion BETWEEN '2023-01-01' AND '2025-12-31';
/*MUESTRA LOS POST DONDE LA FECHA DE PUBLICACION ESTE ENTRE EL AÑO 2023 Y EL 2024*/
SELECT	* FROM		posts WHERE	YEAR(fecha_publicacion) BETWEEN '2023' AND '2024';
/*MUESTRA LAS PUBLICACIONES DONDE EL MES DE PUBLICACION SEA 4*/
SELECT	* FROM		posts WHERE	MONTH(fecha_publicacion) = '04';
/*MUESTRA LAS PUBLICACIONES DONDE EL ID DEL USUARIO NO SEA NULO*/
SELECT	* FROM		posts WHERE	usuario_id IS NOT NULL;
/*MUESTRA LAS PUBLICACIONES DONDE ELUSUARIO es NULO*/
SELECT	* FROM		posts WHERE	usuario_id IS NULL;

/*MUESTRA LAS PUBLICACIONES DONDE EL ID DEL USUARIO NO SEA NULO y su id es menor  a 50*/
SELECT	* FROM		posts WHERE	usuario_id IS NOT NULL AND usuario_id < 50;

/*MUESTRA LAS PUBLICACIONES DONDE EL ID DEL USUARIO NO SEA NULO este activo */
SELECT	* FROM		posts WHERE	usuario_id IS NOT NULL AND estatus ='activo';
/*MUESTRA LAS PUBLICACIONES DONDE EL ID DEL USUARIO NO SEA NULO este activo y el idde del post sea diferente de 45 */
SELECT	* FROM		posts 
WHERE	usuario_id IS NOT NULL 
AND estatus ='activo' 
AND id !=45;
/*MUESTRA LOS POST DONDE EL USARIO NO ES NULO EL ESTATUS ES ACTIVO Y LA CATEGORIA ES 2*/
SELECT * FROM posts where usuario_id IS NOT NULL
AND estatus = 'activo'
AND categoria_id = 2;
/*MUESTRA LOS POST DONDE EL USARIO NO ES NULO EL ESTATUS ES ACTIVO Y LA CATEGORIA ES 2  YSU FECHA DE PUBLICACION SEA 2025*/
SELECT * FROM posts where usuario_id IS NOT NULL
AND estatus = 'activo'
AND categoria_id = 2
AND year(fecha_publicacion) = 2025;