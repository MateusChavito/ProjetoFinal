CREATE SEQUENCE sequence_usuario START WITH 1 INCREMENT BY 50;

CREATE TABLE usuario (
  id BIGINT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  data_cadastro date NOT NULL,
  CONSTRAINT pk_usuario PRIMARY KEY (id)
);

CREATE SEQUENCE sequence_categoria_meme START WITH 1 INCREMENT BY 50;

CREATE TABLE categoria_meme (
  id BIGINT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  data_cadastro date NOT NULL,
  CONSTRAINT pk_categoriameme PRIMARY KEY (id)
);

CREATE SEQUENCE sequence_meme START WITH 1 INCREMENT BY 50;

CREATE TABLE meme (
  id BIGINT NOT NULL,
  nome VARCHAR(255) NOT NULL,
  descricao VARCHAR(255) NOT NULL,
  data_cadastro date NOT NULL,
  categoria_meme_id BIGINT,
  usuario_id BIGINT,
  CONSTRAINT pk_meme PRIMARY KEY (id)
);


