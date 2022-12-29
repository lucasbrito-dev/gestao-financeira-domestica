INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$sFKmbxbG4ryhwPNx/l3pgOJSt.fW1z6YcUnuE2X8APA/Z3NI/oSpq');
INSERT INTO USUARIO(nome, email, senha) VALUES('Moderador', 'moderador@email.com', '$2a$10$sFKmbxbG4ryhwPNx/l3pgOJSt.fW1z6YcUnuE2X8APA/Z3NI/oSpq');
INSERT INTO USUARIO(nome, email, senha) VALUES('Gabriela', 'gabi.gcoimbra@gmail.com', 'a');
INSERT INTO USUARIO(nome, email, senha) VALUES('Lucas', 'lucasbritodev@gmail.com', 'b');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_AUXILIAR');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_ADMINISTRADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2, 2);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(3, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(4, 2);

INSERT INTO BALANCO(total_entradas, total_saidas, saldo_posterior, data_criacao, lancador_id) VALUES(1000, 200, 800, '2019-05-05 18:00:00', 1);
INSERT INTO BALANCO(total_entradas, total_saidas, saldo_posterior, data_criacao, lancador_id) VALUES(1200, 500, 700, '2019-05-05 19:00:00', 2);
INSERT INTO BALANCO(total_entradas, total_saidas, saldo_posterior, data_criacao, lancador_id) VALUES(1500, 600, 900, '2019-05-05 20:00:00', 3);
INSERT INTO BALANCO(total_entradas, total_saidas, saldo_posterior, data_criacao, lancador_id) VALUES(1550, 650, 900, '2019-05-05 21:00:00', 3);
INSERT INTO BALANCO(total_entradas, total_saidas, saldo_posterior, data_criacao, lancador_id) VALUES(1800, 700, 1100, '2019-05-05 22:00:00', 4);