/*Se crea la base de datos */
drop schema if exists prueba;
drop user if exists "usuario_practica";
CREATE SCHEMA prueba ;

/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_practica'@'%' identified by 'la_Clave"';

/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on prueba.* to 'usuario_practica'@'%';
flush privileges;

/* la tabla de categoria contiene categorias de productos*/
create table prueba.arboli (
  id_arboli INT NOT NULL AUTO_INCREMENT,
  nombrecomun VARCHAR(30) NOT NULL,
    tipoflor VARCHAR(30) NOT NULL,
  tipomadera VARCHAR(30) NOT NULL,
  ruta_imagen varchar(1024),
  activo bool,
  PRIMARY KEY (id_arboli))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


/*Se insertan 3 categorias de productos como ejemplo */
INSERT INTO prueba.arboli (id_arboli,nombrecomun,tipoflor,tipomadera,ruta_imagen,activo) VALUES 
('1','Pino', 'Blanda','Perenne', 'https://4.bp.blogspot.com/-nmfMYSsxx2k/U3TknL9UlKI/AAAAAAAABxU/oX91vBD-5qw/s1600/pino.jpg', true), 
('2','Cedro', 'Blanda', 'Perenne', 'https://www.perfume-man.com/wp-content/uploads/2018/05/arbol-cedro-libano.jpg',true),
('3','Abeto','Blanda', 'Perenne', 'https://upload.wikimedia.org/wikipedia/commons/8/85/Sapin_lure.jpg',true),
('4','Caoba', 'Dura', 'Perenne', 'https://www.yucatan.gob.mx/docs/galerias/caoba/1.jpg',true),
('5','Roble', 'Dura', 'Caducifolio', 'https://www.tannins.org/wp-content/uploads/2019/05/quercia-tannino.jpg',false);


