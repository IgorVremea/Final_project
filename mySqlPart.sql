-- ------------------------ Задание №8 ------------------------
-- DROP DATABASE humansFriends;
CREATE DATABASE humansFriends;
USE humansFriends;
CREATE TABLE cats(
	id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);
CREATE TABLE dogs(
	id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);
CREATE TABLE hamsters(
	id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);
CREATE TABLE donkeys(
	id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);
CREATE TABLE horses(
	id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);
CREATE TABLE camels(
	id INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);


-- ------------------------ Задание №9 ------------------------

-- DROP PROCEDURE IF EXISTS addPets;
-- DROP PROCEDURE IF EXISTS addPackAnimals;
DELIMITER //
CREATE PROCEDURE addPets()
BEGIN
INSERT INTO hamsters(name, birthDate, commands) VALUES ('Homeak_Dolgojitel', '2000-01-01', 'Vse cmd crome UMIRATI');
INSERT INTO hamsters(name, birthDate, commands) VALUES ('Homeak', '2024-01-02', 'Sideti, lejati, bejati pod mashinu');
INSERT INTO cats(name, birthDate, commands) VALUES ('Cat', '2005-06-10', 'Ksksks');
INSERT INTO dogs(name, birthDate, commands) VALUES ('Dog', '2012-01-02', 'Co mne, fas, salto nazad');
END;
// DELIMITER ;

DELIMITER //
CREATE PROCEDURE addPackAnimals()
BEGIN
INSERT INTO horses(name,  birthDate, commands) VALUES ('Koni_v_palto', '2000-12-01', 'Prrr');
INSERT INTO donkeys(name, birthDate, commands) VALUES ('Glupets', '2024-10-02', 'I-a, no');
INSERT INTO camels(name, birthDate, commands) VALUES ('Mr_Plevok', '2018-06-10', 'Tfu, stop');
INSERT INTO horses(name, birthDate, commands) VALUES ('Vsadnik', '2022-01-02', 'Perednie, tri');
END;
// DELIMITER ;

CALL addPets();
CALL addPackAnimals();
-- ------------------------ Задание №10 ------------------------

TRUNCATE camels;
CREATE TABLE horses_donkeys (
	id INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(255),
    animalFamilyType VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400)
);

INSERT INTO horses_donkeys(name, birthDate, commands) SELECT name, birthDate, commands FROM horses;
UPDATE horses_donkeys SET animalFamilyType = 'Horse' WHERE animalFamilyType IS NULL;
INSERT INTO horses_donkeys(name, birthDate, commands) SELECT name, birthDate, commands FROM donkeys;
UPDATE horses_donkeys SET animalFamilyType = 'DONKEY' WHERE animalFamilyType IS NULL;

SELECT * FROM horses_donkeys;

-- ----------------------Задание №12 ------------------------
--  PROCEDURE IF EXISTS updateAnimalsTable;
DELIMITER //
CREATE PROCEDURE updateAnimalsTable()
BEGIN
	DROP TEMPORARY TABLE IF EXISTS animals;
	CREATE TEMPORARY TABLE IF NOT EXISTS animals(
		id INT(10) UNIQUE NOT NULL AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        animalType VARCHAR(255),
        animalFamilyType VARCHAR(255),
        birthDate DATE NOT NULL,
        commands VARCHAR(400) NOT NULL
    );
    INSERT INTO animals(name,  birthDate, commands) SELECT name, birthDate, commands FROM cats;
    UPDATE animals SET animalType = 'Pet', animalFamilyType = 'Cat' WHERE animalType IS NULL AND animalFamilyType IS NULL;
    INSERT INTO animals(name,  birthDate, commands) SELECT name, birthDate, commands FROM dogs;
    UPDATE animals SET animalType = 'Pet', animalFamilyType = 'Dog' WHERE animalType IS NULL AND animalFamilyType IS NULL;
    INSERT INTO animals(name,  birthDate, commands) SELECT name, birthDate, commands FROM hamsters;
    UPDATE animals SET animalType = 'Pet', animalFamilyType = 'Hamster' WHERE animalType IS NULL AND animalFamilyType IS NULL;
    INSERT INTO animals(name,  birthDate, commands) SELECT name, birthDate, commands FROM horses;
    UPDATE animals SET animalType = 'Pack animal', animalFamilyType = 'Horse' WHERE animalType IS NULL AND animalFamilyType IS NULL;
    INSERT INTO animals(name,  birthDate, commands) SELECT name, birthDate, commands FROM donkeys;
    UPDATE animals SET animalType = 'Pack animal', animalFamilyType = 'Donkey' WHERE animalType IS NULL AND animalFamilyType IS NULL;
    INSERT INTO animals(name,  birthDate, commands) SELECT name, birthDate, commands FROM camels;
    UPDATE animals SET animalType = 'Pack animal', animalFamilyType = 'Camel' WHERE animalType IS NULL AND animalFamilyType IS NULL;
END;
// DELIMITER ;
CALL updateAnimalsTable();
SELECT * FROM animals;

-- ------------------------ Задание №11 ------------------------
-- DROP FUNCTION IF EXISTS countAgeYear;
-- DROP FUNCTION IF EXISTS countAgeMonthInPlus;

SET GLOBAL log_bin_trust_function_creators = 1;
DELIMITER //
CREATE FUNCTION countAgeYear(bDate DATE)
RETURNS INT(10)
BEGIN
	RETURN (YEAR(CURRENT_DATE)-YEAR(bDate))-(RIGHT(CURRENT_DATE,5)<RIGHT(bDate,5));
END;
// DELIMITER ;

DELIMITER //
CREATE FUNCTION countAgeMonthInPlus(bDate DATE)
RETURNS int(4)
BEGIN
	DECLARE temp INT(4);
    SET temp = (MONTH(CURRENT_DATE)-MONTH(bDATE));
	RETURN IF(temp < 0, 12+temp, temp);
END;
// DELIMITER ;

CREATE TABLE youngAnimals(
	id INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(255),
    animalFamilyType VARCHAR(255),
    birthDate DATE,
    commands VARCHAR(400),
    age INT(4),
    month INT(4)
);


CALL updateAnimalsTable();
INSERT INTO youngAnimals (name, animalFamilyType, birthDate, commands) SELECT name, animalFamilyType, birthDate, commands FROM animals WHERE (countAgeYear(birthDate) >= 1) AND  (countAgeYear(birthDate) <= 3);
UPDATE youngAnimals SET age = countAgeYear(birthDate), month = countAgeMonthInPlus(birthDate);
SELECT * FROM youngAnimals;

	


