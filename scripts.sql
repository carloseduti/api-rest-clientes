CREATE TABLE TB_CLIENTE (
 id SERIAL CONSTRAINT pk_id_cliente PRIMARY KEY,
 nome varchar(100) NOT NULL,
 cpf varchar,
 bairro varchar,
 cep varchar,
 cidade varchar,
 complemento varchar,
 logradouro varchar,
 uf varchar
);

CREATE TABLE TB_EMAIL (
 id SERIAL CONSTRAINT pk_id_email PRIMARY KEY,
 email varchar(100) NOT NULL,
 id_cliente SERIAL
 );
 
 CREATE TABLE TB_CONTATO (
 id SERIAL CONSTRAINT pk_id_contato PRIMARY KEY,
 telefone varchar NOT NULL,
 tipo varchar,
 id_cliente SERIAL
);


 ALTER TABLE TB_EMAIL ADD CONSTRAINT fk_email_cliente
      FOREIGN KEY(id_cliente) 
	  REFERENCES tb_cliente(id);

 ALTER TABLE TB_CONTATO ADD CONSTRAINT fk_contato_cliente
      FOREIGN KEY(id_cliente) 
	  REFERENCES tb_cliente(id);