/*select con left join*/
SELECT * FROM usuarios LEFT JOIN posts ON usuarios.id = posts.usuario_id;
/*select con left join y filtra los usuarios que no tienen post actibvos*/
SELECT * FROM usuarios LEFT JOIN post ON usuarios.id = posts.usuari_id WHERE posts.usuario_id= NULL;
/*select con RIGHT join MUESTRA LOS POST Y SUS USUARIOS */
SELECT * FROM usuarios RIGHT JOIN posts ON usuarios.id = posts.usuario_id;

/*select con RIGHT join y filtra MUESTRA LOS POST QUE NO TENGAN USUARIO*/
SELECT * FROM usuarios RIGHT JOIN posts ON usuarios.id = posts.usuario_id WHERE posts.usuario_id IS NULL;

/*select con INNER join y MUESTRA LOS COMENTARIOS Y USUARIOS DEJAMDO DE FUERA LOS QUE SON NULOS*/
SELECT * FROM usuarios INNER JOIN posts ON usuarios.id = posts.usuario_id;

/*select con UNION  join HACE LA UNION Y MUESTRA LOS USARIOS QUE TIENEN O NO POST*/
SELECT * FROM usuarios LEFT JOIN posts ON usuarios.id = posts.usuario_id
UNION 
SELECT * FROM usuarios RIGHT JOIN posts ON usuarios.id = posts.usuario_id;
/*select con UNION  join HACE LA UNION Y MUESTRA LOS USARIOS QUE NO TIENEN POST ASOCIADOS Y LOS POSTA QUE NO TIENEN USUARIO ASOCIADO*/
SELECT * FROM usuarios LEFT JOIN posts ON usuarios.id = posts.usuario_id
WHERE posts.usuario_id IS NULL
UNION 
SELECT * FROM usuarios RIGHT JOIN posts ON usuarios.id = posts.usuario_id 
WHERE posts.usuario_id IS NULL;