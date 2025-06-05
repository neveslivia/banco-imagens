CREATE DATABASE banco_imagens;
USE 'banco_imagens';

DROP IF EXISTS 'imagens'

CREATE TABLE 'imagens'(
    'id' BIGINT(20) PRIMARY KEY IDENTITY NOT NULL,
    'nome' VARCHAR(200) NOT NULL,
    'url' TEXT NOT NULL
);