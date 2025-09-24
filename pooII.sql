CREATE DATABASE dbprojeto;
USE dbprojeto;

CREATE TABLE tbusuario (
	pkusuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(60),
    email VARCHAR(40) UNIQUE NOT NULL,
    senha VARCHAR(40) NOT NULL,
    datanasc DATE,
    ativo BOOLEAN DEFAULT TRUE    
);

INSERT INTO tbusuario(nome, email, senha, datanasc, ativo) VALUES
('theo', 'theo@gmail.com', 'musica', '2007-08-13', true);
UPDATE tbusuario SET senha = SHA1('musica');

INSERT INTO tbmusica(titulo, duracao, genero, ano) VALUES
('Pereka Safada', '4h', 'Gospel', '2025');

CREATE TABLE tbartista (
    pkartista INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    genero VARCHAR(40),
    pais_origem VARCHAR(40)
);

CREATE TABLE tbmusica (		
    pkmusica INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    duracao VARCHAR(10),
    genero VARCHAR(40),
    ano INT
);

CREATE TABLE tbplaylist (
    pkplaylist INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    fkusuario INT,
    FOREIGN KEY (fkusuario) REFERENCES tbusuario(pkusuario)
);

CREATE TABLE tbcolaboração (
    fk_musica INT,
    fk_artista INT,
    PRIMARY KEY (fk_musica, fk_artista),
    FOREIGN KEY (fk_musica) REFERENCES tbmusica(pkmusica),
    FOREIGN KEY (fk_artista) REFERENCES tbartista(pkartista)
);

CREATE TABLE tbplaylist_item (
    fk_musica INT,
    fk_playlist INT,
    PRIMARY KEY (fk_musica, fk_playlist),
    FOREIGN KEY (fk_musica) REFERENCES tbmusica(pkmusica),
    FOREIGN KEY (fk_playlist) REFERENCES tbplaylist(pkplaylist)
);




select 
	m.*,
    (SELECT GROUP_CONCAT(a.nome  SEPARATOR ', ') AS nomes
	FROM tbartista a 
	JOIN tbcolaboracao c ON a.pkartista = c.fk_artista
	WHERE c.fk_musica = m.pkmusica) AS artistas
from tbmusica m;

SELECT * FROM tbmusica;
SELECT * FROM tbcolaboracao;
SELECT * FROM tbartista;
