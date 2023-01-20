
CREATE TABLE students(
	sid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE teachers(
	tid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE subjects(
	subid int NOT NULL PRIMARY KEY,
    name text NOT NULL
);

CREATE TABLE grades(
	studentID int NOT NULL REFERENCES students(sid),
    teacherID int NOT NULL REFERENCES teachers(tid),
    subjectID int NOT NULL REFERENCES subjects(subid),
    grade int NOT NULL,
    PRIMARY KEY(studentID, teacherID, subjectID)
);

-- Insert data in students table

INSERT INTO students (sid, name) VALUES(1, 'Simon');
INSERT INTO students (sid, name) VALUES(2, 'Alvin');
INSERT INTO students (sid, name) VALUES(3, 'Theo');
INSERT INTO students (sid, name) VALUES(4, 'Brittany');
INSERT INTO students (sid, name) VALUES(5, 'Jenette');
INSERT INTO students (sid, name) VALUES(6, 'Elenor');
INSERT INTO students (sid, name) VALUES(7, 'Stu');

SELECT * FROM students;


-- Insert data in teachers table

INSERT INTO teachers (tid, name) VALUES (1, 'Washington');
INSERT INTO teachers (tid, name) VALUES (2, 'Adams');
INSERT INTO teachers (tid, name) VALUES (3, 'Jefferson');
INSERT INTO teachers (tid, name) VALUES (4, 'Lincoln');

SELECT * FROM teachers;

-- Insert data in subjects table

INSERT INTO subjects (subid, name) VALUES (1, 'History');
INSERT INTO subjects (subid, name) VALUES (2, 'Biology');
INSERT INTO subjects (subid, name) VALUES (3, 'Math');

SELECT * FROM subjects;


-- Insert data in grades table

INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 1, 9);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 2, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 3, 6);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 2, 4);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 1, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (2, 4, 3, 5);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (3, 4, 3, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (1, 2, 3, 10);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 4, 1, 8);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (7, 3, 3, 3);
INSERT INTO grades (studentID, teacherID, subjectID, grade) VALUES (6, 2, 2, 5);

SELECT * FROM grades;


-- List all student names and order them by name
SELECT name FROM students ORDER BY name DESC;

-- Grades in History for Simon

SELECT grade FROM grades WHERE studentID = 1 AND subjectID = 1;


-- List all student names that have not taken any classes (dont have grade in grades table)

SELECT name FROM students WHERE sid NOT IN (SELECT studentID FROM grades);

-- List all student names that have taken atleast one class

SELECT name FROM students WHERE sid IN (SELECT studentID FROM grades);

-- List all teachers that have not yet taught any class

SELECT name FROM teachers WHERE tid NOT IN (SELECT teacherID FROM grades);

-- What ID Biology has

SELECT subid FROM subjects WHERE name = 'Biology';

-- Names of teachers that have taught Biology

SELECT name FROM teachers WHERE tid IN (SELECT teacherID FROM grades WHERE subjectID IN 
		(SELECT subid FROM subjects WHERE name = 'Biology')
);


-- Counting rows

SELECT COUNT(*) FROM grades;

-- Sum column value

SELECT SUM(grade) FROM grades;

SELECT SUM(grade) AS 'Total sum of grades' FROM grades;

-- Sum of all Simons grades

SELECT SUM(grade) AS 'Simons grade sum' FROM grades WHERE studentID IN (SELECT sid FROM students WHERE name = 'Simon');

-- Simons average grade

SELECT AVG(grade) AS 'Simons grade sum' FROM grades WHERE studentID IN (SELECT sid FROM students WHERE name = 'Simon');

-- Minimal grade

SELECT MIN(grade) FROM grades;

-- Maximum grade

SELECT MAX(grade) FROM grades;



