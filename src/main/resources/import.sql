INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamerica');
INSERT INTO regiones (id, nombre) VALUES (2, 'CentroAmerica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamerica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');


INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1,'Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2,'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3,'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4,'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5,'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6,'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1,'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4,'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6,'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5,'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2,'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3,'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');


/*usuarios*/

INSERT INTO  `usuarios` (username, password, enabled) VALUES ('emir', '$2a$10$ABobr0Zx1489/xqh.v9h8eERYLG8Zz.NRZxapnprqcBbucSCmYKoG', 1);
INSERT INTO  `usuarios` (username, password, enabled) VALUES ('admin', '$2a$10$wZpqtW547sk7PUv7LZ9.RuJ0aDutOgD0AAaLE0WAiodV0AC0xCEhG', 1);

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1,1);

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,2);

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,1);