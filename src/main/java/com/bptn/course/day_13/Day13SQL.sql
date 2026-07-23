-- CREATE DB
CREATE DATABASE bptn;

-- CREATE courses TABLE
CREATE TABLE "courses"(
   "courseId" INT GENERATED ALWAYS AS IDENTITY,
   "courseName" VARCHAR(120) NOT NULL,
    CONSTRAINT "courses_pk" PRIMARY KEY ("courseId")
);

-- CREATE students TABLE
CREATE TABLE "students" (
  "studentId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  "courseId" INT NOT NULL,
  "studentName" VARCHAR(120) NOT NULL,
  "studentEmail" VARCHAR(120) UNIQUE NOT NULL,
  "studentPhone" VARCHAR(20),
  FOREIGN KEY ("courseId") 
    REFERENCES courses("courseId")
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID
);

-- INSERT data
INSERT INTO "courses" ("courseName")
VALUES ('Quantum Computing');

INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone")
VALUES (1, 'John Doe', 'john@doe.com', '4586272890');


-- SELECT data
SELECT * FROM courses;
SELECT "studentName", "studentEmail" FROM students;


-- UPDATE data
UPDATE "students" SET "studentName" = 'Alex' WHERE "studentId" = 1;\


-- DELETE data
DELETE FROM "students" WHERE "studentId" = 1;