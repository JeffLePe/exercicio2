﻿
CREATE TABLE client (
	name VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL
);

ALTER TABLE client ADD COLUMN id INTEGER;

CREATE SEQUENCE seq_clients;

SELECT * FROM client;