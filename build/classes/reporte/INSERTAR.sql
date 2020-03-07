DELIMITER $$
CREATE PROCEDURE insertar_usuario(
  IN  dni  int,
  IN  multa  varchar(30),
  IN monto INT,
  IN correo varchar (30)  
)
INSERT INTO usuario (dni,multa,monto, correo) VALUES (12164572, 'Alta Velocidad', 300,'jose@gmail.com');
INSERT INTO usuario (dni,multa,monto, correo) VALUES (24589987, 'Pico Placa', 400, 'maria@gmail.com');
INSERT INTO usuario (dni,multa,monto, correo) VALUES (31578998, 'Alta Velocidad', 500, 'pedro@gmail.com');
INSERT INTO usuario (dni,multa,monto, correo) VALUES (44588788, 'Pasar luz Roja', 600, 'juaquin@gmail.com');

END$$
DELIMITER ;