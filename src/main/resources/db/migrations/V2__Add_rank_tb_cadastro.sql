-- Migration para adiconar a coluna de rank na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN ranking VARCHAR(255);