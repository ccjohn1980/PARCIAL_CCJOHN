DELIMITER $$
DROP PROCEDURE IF EXISTS mostrar_dato;
CREATE PROCEDURE mostrar_dato()
BEGIN
    Select * from usuario;
END$$
DELIMITER ;
