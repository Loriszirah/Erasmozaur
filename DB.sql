DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Types_user;

CREATE TABLE Types_user (
	id_type_user SERIAL,
	name varchar(40) NOT NULL,
	CONSTRAINT pk_types_user PRIMARY KEY(id_type_user)
);

CREATE TABLE Users (
	id_user SERIAL,
	username varchar(40) NOT NULL UNIQUE,
	password varchar(40) NOT NULL,
	id_type_user INTEGER,
	CONSTRAINT pk_users PRIMARY KEY(id_user),
	CONSTRAINT users_username_unique UNIQUE (username),
	CONSTRAINT fk_users_types_user FOREIGN KEY (id_type_user) REFERENCES Types_user(id_type_user)
);

TRUNCATE TABLE Users;
TRUNCATE TABLE Types_user;

INSERT INTO Types_user(name) VALUES('Tutor');
INSERT INTO Types_user(name) VALUES('Student');
INSERT INTO Users(username,password,id_type_user) VALUES('Melvil','pwd',(SELECT id_type_user FROM Types_user WHERE name = 'Tutor'));
INSERT INTO Users(username,password,id_type_user) VALUES('Godefroi','pwd',(SELECT id_type_user FROM Types_user WHERE name = 'Tutor'));
INSERT INTO Users(username,password,id_type_user) VALUES('Loris','pwd',(SELECT id_type_user FROM Types_user WHERE name = 'Student'));

SELECT * FROM Types_user;
SELECT * FROM Users;
SELECT id_user, username, password, u.id_type_user, name FROM Users u INNER JOIN Types_user tu ON tu.id_type_user = u.id_type_user;