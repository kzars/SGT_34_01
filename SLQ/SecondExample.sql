

CREATE TABLE users(
	userID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username varchar(45) NOT NULL,
    password varchar(45) NOT NULL,
    fullname varchar (150) NOT NULL,
    email varchar(45)
);

INSERT INTO users (username, password, fullname, email)
VALUES ('trumpwall','mexico','Donald Trump', 'maga@gmail.com');

INSERT INTO users (username, password, email,fullname) VALUES ('obama','Hawai','barack@gmail.com','Barck Obama');

INSERT INTO users (username, password, fullname) VALUES ('Biden','Old','Joe Biden');

DELETE FROM users WHERE userID = 3;

SELECT * FROM users;

DROP TABLE IF EXISTS users;

SELECT * FROM users WHERE email IS NOT NULL;


CREATE TABLE Pets (
    petID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    petName varchar(45) NOT NULL,
    petType varchar(45) NOT NULL,
    petAge int NOT NULL,
    petWeight float NOT NULL
);

ALTER TABLE Pets ADD isAdopted BOOLEAN NOT NULL DEFAULT 0;


SELECT * FROM pets;

INSERT INTO Pets (petName, petType, petAge, petWeight, isAdopted) VALUES
    ("Fluffy", "dog", 3, 12.5, 1),
    ("Whiskers", "cat", 5, 8.2, 0),
    ("Buddy", "dog", 7, 15.3, 0),
    ("Simba", "cat", 2, 6.7, 0),
    ("Nemo", "fish", 1, 0.2, 1);

UPDATE Pets SET petName = "Steak" WHERE petID = 1;
UPDATE Pets SET petName = "Salmon" WHERE petID = 2;
UPDATE Pets SET petName = "Hamburger" WHERE petID = 3;
UPDATE Pets SET petName = "Pizza" WHERE petID = 4;
UPDATE Pets SET petName = "Sushi" WHERE petID = 5;


