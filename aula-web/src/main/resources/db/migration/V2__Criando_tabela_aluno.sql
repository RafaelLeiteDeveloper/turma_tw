CREATE TABLE IF NOT EXISTS aluno (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT,
    id_sala INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_sala)
        REFERENCES sala (id)
        ON UPDATE RESTRICT ON DELETE CASCADE
);
