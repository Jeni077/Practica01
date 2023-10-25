/*Se crea la base de datos */
drop schema if exists práctica;
drop user if exists usuario_practica;
CREATE SCHEMA práctica ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_practica'@'%' identified by 'la_Clave';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on práctica.* to 'usuario_practica'@'%';
flush privileges;

/* la tabla de categoria contiene categorias de productos*/
create table práctica.arbol (
  id_arbol INT NOT NULL AUTO_INCREMENT,
  nombre_comun VARCHAR(30) NOT NULL,
  tipo_madera VARCHAR(35) NOT NULL,
  tipo_flor VARCHAR(35) NOT NULL,
  ruta_imagen varchar(1024) NOT NULL,
  PRIMARY KEY (id_arbol))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;

/*Se insertan 3 tipos de arboles como ejemplo */
INSERT INTO práctica.arbol (id_arbol,nombre_comun,tipo_madera,tipo_flor,ruta_imagen) VALUES 
('1','Pino', 'Blanda','Perenne', 'https'), 
('2','Cedro', 'Blanda', 'Perenne', 'https'),
('3','Abeto','Blanda', 'Perenne', 'https'),
('4','Caoba', 'Dura', 'Perenne', 'https'),
('5','Roble', 'Dura', 'Caducifolio', 'https');
