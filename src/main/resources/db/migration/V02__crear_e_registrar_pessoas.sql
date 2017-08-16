CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo TINYINT(1)  NOT NULL,
	logradouro VARCHAR(100) NULL,
  numero  VARCHAR(4) NULL,
  complemento VARCHAR(50) NULL,
  bairro VARCHAR(50) NULL,
  cep VARCHAR(11) NULL,
  cidade VARCHAR(50) NULL,
  estado VARCHAR(50)  NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, numero, cep, cidade, estado, logradouro, bairro, complemento)
  values ('Vítor', 1, '3', '7226000', 'ceilandia', 'df', 'nao sei','ceilandia norte', '2');

INSERT INTO pessoa (nome, ativo, numero, cep, cidade, estado, logradouro, bairro, complemento)
  values ('Fabiana', 1, '34', '7226001', 'taguatingua', 'df', 'nao sei','pistao', 's');

INSERT INTO pessoa (nome, ativo, numero, cep, cidade, estado, logradouro, bairro, complemento)
  values ('Carlos', 0, '35', '7226002', 'gama', 'df', 'nao sei', 'gama', '2');

INSERT INTO pessoa (nome, ativo, numero, cep, cidade, estado, logradouro, bairro, complemento)
  values ('Maria', 1, '36', '7226003', 'brasilia', 'df', 'nao sei','asa norte', '12');

INSERT INTO pessoa (nome, ativo)
values ('Jose das Dores', 1);


