INSERT INTO "courses" ("courseName") VALUES
('Introduction to Computer Science'),
('Data Structures and Algorithms'),
('Database Management Systems'),
('Web Development Fundamentals'),
('Artificial Intelligence Basics'),
('Machine Learning Fundamentals'),
('Software Engineering Principles'),
('Computer Networks and Security'),
('Operating Systems Concepts'),
('Object-Oriented Programming'),
('Introduction to Python Programming'),
('Java Programming Essentials'),
('C++ Programming Fundamentals'),
('Data Analytics Techniques'),
('Information Retrieval Methods'),
('Mobile App Development'),
('Human-Computer Interaction'),
('Computer Graphics and Visualization'),
('Cloud Computing Technologies');

INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone") VALUES
(1, 'John Smith', 'john.smith@gmail.com', '4165551234'),
(1, 'Emily Johnson', 'emily.johnson@yahoo.com', '6475552345'),
(2, 'Michael Davis', 'michael.davis@hotmail.com', '9055553456'),
(2, 'Sophia Brown', 'sophia.brown@gmail.com', '+14165554567'),
(1, 'William Wilson', 'william.wilson@yahoo.com', '647-555-5678'),
(2, 'Olivia Taylor', 'olivia.taylor@hotmail.com', '9055556789'),
(4, 'James Anderson', 'james.anderson@gmail.com', '416-555-7890'),
(4, 'Ava Thomas', 'ava.thomas@yahoo.com', '6475558901'),
(5, 'Benjamin Martinez', 'benjamin.martinez@hotmail.com', '9055559012'),
(5, 'Mia Hernandez', 'mia.hernandez@gmail.com', '4165550123'),
(6, 'Daniel Lopez', 'daniel.lopez@yahoo.com', '6475551234'),
(6, 'Charlotte Clark', 'charlotte.clark@hotmail.com', '9055552345'),
(7, 'Joseph Lewis', 'joseph.lewis@gmail.com', '4165553456'),
(7, 'Amelia Lee', 'amelia.lee@yahoo.com', '6475554567'),
(8, 'David Walker', 'david.walker@hotmail.com', '9055555678'),
(8, 'Sofia Hall', 'sofia.hall@gmail.com', '4165556789'),
(9, 'Andrew Young', 'andrew.young@yahoo.com', '6475557890'),
(9, 'Harper Hernandez', 'harper.hernandez@hotmail.com', '9055558901'),
(10, 'Alexander King', 'alexander.king@gmail.com', '416-555-9012'),
(10, 'Abigail White', 'abigail.white@yahoo.com', '6475550123'),
(11, 'Ethan Hill', 'ethan.hill@hotmail.com', '9055551234'),
(11, 'Emily Adams', 'emily.adams@gmail.com', '4165552345'),
(12, 'James Wright', 'james.wright@yahoo.com', '6475553456'),
(13, 'Avery Scott', 'avery.scott@hotmail.com', '9055554567'),
(14, 'Logan Green', 'logan.green@gmail.com', '4165555678'),
(15, 'Ella Martinez', 'ella.martinez@yahoo.com', '6475556789'),
(16, 'Lucas Rodriguez', 'lucas.rodriguez@hotmail.com', '9055557890'),
(17, 'Scarlett Perez', 'scarlett.perez@gmail.com', '4165558901'),
(18, 'Henry Cooper', 'henry.cooper@yahoo.com', '6475559012'),
(19,  'Jane Smith',   'jane@gmail.com', NULL),
(5,   'Bob Wilson',  'bob@hotmail.com', NULL);


-- Using dot notation, we tell PostgreSQL what we want to see output to the console: students.studentName and courses.courseName. We need the "" to tell PSQL what entities it's looking for, as explained in a previous lesson:
SELECT "courses"."courseName", "students"."studentName", "students"."studentEmail"
-- Here, we tell it the first table from which data will be taken:
FROM "students"
-- And then tell it to "join" that data with the other table from which the data should be taken:
JOIN "courses"
-- Finally, we tell it what values it should be matching up in order to create the lines we want to see:
ON "students"."courseId" = "courses"."courseId";
-- The above will make sure that the values in students.courseId are matched up to the same values in courses.courseId.


-- Using dot notation, we tell PostgreSQL what we want to see output to the console: students.studentName and courses.courseName. We need the "" to tell PSQL what entities it's looking for, as explained in a previous lesson:
SELECT "courses"."courseName", "students"."studentName", "students"."studentEmail"
-- Here, we tell it the first table from which data will be taken:
FROM "students"
-- And then tell it to "join" that data with the other table from which the data should be taken:
FULL JOIN "courses"
-- Finally, we tell it what values it should be matching up in order to create the lines we want to see:
ON "students"."courseId" = "courses"."courseId";
-- The above will make sure that the values in students.courseId are matched up to the same values in courses.courseId.


-- Using dot notation, we tell PostgreSQL what we want to see output to the console: students.studentName and courses.courseName. We need the "" to tell PSQL what entities it's looking for, as explained in a previous lesson:
SELECT *
-- Here, we tell it the first table from which data will be taken:
FROM "courses"
-- And then tell it to "join" that data with the other table from which the data should be taken:
RIGHT JOIN "students"
-- Finally, we tell it what values it should be matching up in order to create the lines we want to see:
ON "courses"."courseId" = "students"."courseId";
-- The above will make sure that the values in students.courseId are matched up to the same values in courses.courseId.


-- Using dot notation, we tell PostgreSQL what we want to see output to the console: students.studentName and courses.courseName. We need the "" to tell PSQL what entities it's looking for, as explained in a previous lesson:
SELECT *
-- Here, we tell it the first table from which data will be taken:
FROM "courses"
-- And then tell it to "join" that data with the other table from which the data should be taken:
LEFT JOIN "students"
-- Finally, we tell it what values it should be matching up in order to create the lines we want to see:
ON "courses"."courseId" = "students"."courseId";
-- The above will make sure that the values in students.courseId are matched up to the same values in courses.courseId.


SELECT 
  "s"."studentId", 
  "c"."courseId", 
  "s"."studentName", 
  "c"."courseName"
FROM "students" 
  AS "s" 
INNER JOIN "courses" 
  AS "c" 
ON "s"."courseId" = "c"."courseId"

SELECT DISTINCT "courseId" 
FROM "students" 
ORDER BY "courseId";

-- Get a list of all the names of courses
SELECT DISTINCT st."courseId", co."courseName" 
FROM "students" AS st 
INNER JOIN "courses" AS co 
ON st."courseId" = co."courseId" ORDER BY st."courseId";

SELECT DISTINCT COUNT("studentName") FROM students;
