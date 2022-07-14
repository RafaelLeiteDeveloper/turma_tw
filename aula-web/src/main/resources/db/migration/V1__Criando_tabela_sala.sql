CREATE TABLE IF NOT EXISTS sala (
    id INT AUTO_INCREMENT,
    descricao VARCHAR(255) NOT NULL,
    numero_alunos INT,
    turma VARCHAR(255),
    PRIMARY KEY (id)
);