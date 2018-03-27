DROP TABLE IF EXISTS Roles CASCADE;
DROP TABLE IF EXISTS Documents CASCADE;
DROP TABLE IF EXISTS Countries CASCADE;
DROP TABLE IF EXISTS Cities CASCADE;
DROP TABLE IF EXISTS Users CASCADE;
DROP TABLE IF EXISTS Universities CASCADE;
DROP TABLE IF EXISTS Reviews CASCADE;
DROP TABLE IF EXISTS Scholarships CASCADE;
DROP TABLE IF EXISTS Applications CASCADE;
DROP TABLE IF EXISTS Agreements CASCADE;
DROP TABLE IF EXISTS Courses CASCADE;
DROP TABLE IF EXISTS Evaluations CASCADE;
DROP TABLE IF EXISTS Include CASCADE;
DROP TABLE IF EXISTS Correspond CASCADE;
DROP TABLE IF EXISTS UnversitiesCourses CASCADE;
DROP TABLE IF EXISTS ScholarshipsCourses CASCADE;
DROP TABLE IF EXISTS Have CASCADE;

/*
	Table Roles
*/
CREATE TABLE Roles (
	id_role SERIAL,
	name varchar(40) NOT NULL,
	description text,
	CONSTRAINT pk_roles PRIMARY KEY(id_role),
	CONSTRAINT roles_name_unique UNIQUE (name)
);

/*
	Table Users
*/
CREATE TABLE Users (
	id_user SERIAL,
	username varchar(40) NOT NULL,
	password varchar(40) NOT NULL,
	firstName varchar(40) NOT NULL,
	lastName varchar(40) NOT NULL,
	email varchar(100) NOT NULL,
	birthDate varchar(40),
	address varchar(100),
	id_role INTEGER NOT NULL,
	CONSTRAINT users_email_unique UNIQUE (email),
	CONSTRAINT pk_users PRIMARY KEY(id_user),
	CONSTRAINT users_username_unique UNIQUE (username),
	CONSTRAINT fk_users_roles FOREIGN KEY (id_role) REFERENCES Roles(id_role)
);

/*
	Table Documents
*/
CREATE TABLE Documents (
	id_document SERIAL,
	name varchar(40) NOT NULL,
	url varchar(100),
	id_user INTEGER,
	CONSTRAINT pk_documents PRIMARY KEY(id_document),
	CONSTRAINT fk_documents_users FOREIGN KEY (id_user) REFERENCES Users(id_user)
);

/*
	Table Countries
*/
CREATE TABLE Countries (
	id_country SERIAL,
	name varchar(60) NOT NULL,
	CONSTRAINT pk_countries PRIMARY KEY(id_country)
);

/*
	Table Cities
*/
CREATE TABLE Cities (
	id_city SERIAL,
	name varchar(60) NOT NULL,
	id_country INTEGER NOT NULL,
	CONSTRAINT pk_cities PRIMARY KEY(id_city),
	CONSTRAINT fk_cities_countries FOREIGN KEY (id_country) REFERENCES Countries(id_country)
);

/*
	Table Universities
*/
CREATE TABLE Universities (
	id_university SERIAL,
	name varchar(100) NOT NULL,
	address varchar(100) NOT NULL,
	id_city INTEGER NOT NULL,
	id_responsible INTEGER NOT NULL,
	CONSTRAINT pk_universities PRIMARY KEY(id_university),
	CONSTRAINT fk_universities_cities FOREIGN KEY (id_city) REFERENCES Cities(id_city),
	CONSTRAINT fk_universities_users FOREIGN KEY (id_responsible) REFERENCES Users(id_user)
);

/*
	Table Reviews
*/
CREATE TABLE Reviews (
	id_review SERIAL,
	comment text NOT NULL,
	nbStars INTEGER NOT NULL,
	id_user INTEGER NOT NULL,
	id_university INTEGER NOT NULL,
	CONSTRAINT pk_reviews PRIMARY KEY (id_review),
	CONSTRAINT fk_reviews_user FOREIGN KEY (id_user) REFERENCES Users(id_user),
	CONSTRAINT fk_reviews_universities FOREIGN KEY (id_university) REFERENCES Universities(id_university)
);

/*
	Table Scholarships
*/
CREATE TABLE Scholarships (
	id_scholarship SERIAL,
	description text NOT NULL,
	duration INTEGER NOT NULL,
	startDate DATE NOT NULL,
	endDate DATE NOT NULL,
	domain varchar(40),
	id_sending_university INTEGER NOT NULL,
	id_receiving_university INTEGER NOT NULL,
	CONSTRAINT pk_scholarships PRIMARY KEY (id_scholarship),
	CONSTRAINT fk_scholarships_sending_universities FOREIGN KEY (id_sending_university) REFERENCES Universities(id_university),
	CONSTRAINT fk_scholarships_receiving_universities FOREIGN KEY (id_receiving_university) REFERENCES Universities(id_university)
);

/*
	Table Applications
*/
CREATE TABLE Applications (
	id_application INTEGER NOT NULL,
	date Date NOT NULL,
	comment text,
	id_student INTEGER NOT NULL,
	id_scholarship INTEGER NOT NULL,
	CONSTRAINT pk_applications PRIMARY KEY (id_application),
	CONSTRAINT fk_applications_users FOREIGN KEY (id_student) REFERENCES Users(id_user),
	CONSTRAINT fk_applications_scholarships FOREIGN KEY (id_scholarship) REFERENCES Scholarships(id_scholarship)
);

/*
	Table between Documents and Applications
*/
CREATE TABLE Include (
	id_document INTEGER NOT NULL,
	id_application INTEGER NOT NULL,
	CONSTRAINT pk_include PRIMARY KEY (id_document, id_application),
	CONSTRAINT fk_include_documents FOREIGN KEY (id_document) REFERENCES Documents(id_document),
	CONSTRAINT fk_include_application FOREIGN KEY (id_application) REFERENCES Applications(id_application)
);

/*
	Table Agreements
*/
CREATE TABLE Agreements (
	id_agreement SERIAL,
	startDate DATE NOT NULL,
	endDate DATE NOT NULL,
	comment text,
	id_application INTEGER NOT NULL,
	id_tutor INTEGER,
	CONSTRAINT pk_agreements PRIMARY KEY (id_agreement),
	CONSTRAINT fk_agreements_applications FOREIGN KEY (id_application) REFERENCES Applications(id_application),
	CONSTRAINT fk_agreements_users FOREIGN KEY (id_tutor) REFERENCES Users(id_user)
);

/*
	Table Courses
*/
CREATE TABLE Courses (
	id_course SERIAL,
	name varchar(60) NOT NULL,
	specialization varchar(60),
	CONSTRAINT pk_courses PRIMARY KEY (id_course),
	CONSTRAINT courses_name_unique UNIQUE (name)
);

/*
	Table Evaluations
*/
CREATE TABLE Evaluations (
	id_evaluation SERIAL,
	grade Float NOT NULL,
	date DATE NOT NULL,
	comment text,
	id_agreement INTEGER,
	id_course INTEGER,
	CONSTRAINT pk_evaluations PRIMARY KEY (id_evaluation),
	CONSTRAINT fk_evaluations_agreements FOREIGN KEY (id_agreement) REFERENCES Agreements(id_agreement),
	CONSTRAINT fk_evaluations_courses FOREIGN KEY (id_course) REFERENCES Courses(id_course)
);

/*
	Table between Evaluations and Courses
*/
CREATE TABLE Correspond (
	id_course INTEGER NOT NULL,
	id_evaluation INTEGER NOT NULL,
	CONSTRAINT pk_correspond PRIMARY KEY (id_course, id_evaluation),
	CONSTRAINT fk_correspond_courses FOREIGN KEY (id_course) REFERENCES Courses(id_course),
	CONSTRAINT fk_correspond_evaluations FOREIGN KEY (id_evaluation) REFERENCES Evaluations(id_evaluation)
);

/*
	Table between Universities and Courses
*/
CREATE TABLE UnversitiesCourses (
	id_university INTEGER NOT NULL,
	id_course INTEGER NOT NULL,
	CONSTRAINT pk_universitiesCourses PRIMARY KEY (id_course, id_university),
	CONSTRAINT fk_universitiesCourses_courses FOREIGN KEY (id_course) REFERENCES Courses(id_course),
	CONSTRAINT fk_universitiesCourses_universities FOREIGN KEY (id_university) REFERENCES Universities(id_university)
);

/*
	Table between Scholarships and Courses
*/
CREATE TABLE ScholarshipsCourses (
	id_scholarship INTEGER NOT NULL,
	id_course INTEGER NOT NULL,
	CONSTRAINT pk_scholarshipsCourses PRIMARY KEY (id_course, id_scholarship),
	CONSTRAINT fk_scholarshipsCourses_courses FOREIGN KEY (id_course) REFERENCES Courses(id_course),
	CONSTRAINT fk_scholarshipsCourses_scholarships FOREIGN KEY (id_scholarship) REFERENCES Scholarships(id_scholarship)
);

/*
	Table between Agreements and Courses
*/
CREATE TABLE Have (
	id_agreement INTEGER NOT NULL,
	id_course INTEGER NOT NULL,
	CONSTRAINT pk_have PRIMARY KEY (id_course, id_agreement),
	CONSTRAINT fk_have_courses FOREIGN KEY (id_course) REFERENCES Courses(id_course),
	CONSTRAINT fk_have_scholarships FOREIGN KEY (id_agreement) REFERENCES Agreements(id_agreement)
);

-- Inserting Roles 
INSERT INTO Roles(name) VALUES('Tutor');
INSERT INTO Roles(name) VALUES('Student');
INSERT INTO Roles(name) VALUES('Responsible');
INSERT INTO Roles(name) VALUES('Admin');

-- Inserting Users
INSERT INTO Users(username,password,id_role) VALUES('Melvil','pwd',(SELECT id_role FROM Roles WHERE name = 'Tutor'));
INSERT INTO Users(username,password,id_role) VALUES('Godefroi','pwd',(SELECT id_role FROM Roles WHERE name = 'Responsible'));
INSERT INTO Users(username,password,id_role) VALUES('Loris','pwd',(SELECT id_role FROM Roles WHERE name = 'Student'));