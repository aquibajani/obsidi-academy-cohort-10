-- Provide all the SQL statements you ran for these operations

-- Create the "User" table
CREATE TABLE "User" (
  "userId" INTEGER GENERATED ALWAYS AS IDENTITY,
  "firstName" VARCHAR(50) NOT NULL,
  "lastName" VARCHAR(50) NOT NULL,
  "username" VARCHAR(50) NOT NULL,
  "phone" VARCHAR(15) NOT NULL,
  "emailId" VARCHAR(100) NOT NULL,
  "password" VARCHAR(50) NOT NULL,
  "emailVerified" BOOLEAN NOT NULL,
  "createdOn" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT "User_pkey" PRIMARY KEY("userId"),
  CONSTRAINT "User_emailId_key" UNIQUE("emailId"),
  CONSTRAINT "User_username_key" UNIQUE("username")
);

-- Insert a new row into the "User" table
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES('Jessie', 'Doe', 'jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', 'true');

-- Select all rows from the "User" table
SELECT * FROM "User";

-- Insert multiple users with a single insert statement using a VALUES list
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true),
('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false),
('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false);

-- Select all rows from the "User" table where the value of the "emailVerified" column is true
SELECT * FROM "User" WHERE "emailVerified" = TRUE;

-- Insert a few more users into the "User" table, (at least four more)
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES ('Saba', 'Mushtaq', 'sabamushtaq', '+1-111-1111', 'saba@example.com', 'password123', true),
('Aquib', 'Ajani', 'aquibajani', '+1-222-2222', 'aquib@example.com', 'passwordabc', false),
('Hrithik', 'Advani', 'hrithikadvani', '+1-333-3333', 'hrithik@example.com', 'password123', false),
('Kazeem', 'J', 'kazeemj', '+1-444-4444', 'kazeemj@example.com', 'password123', false);

-- Update user with username "tomjones"
UPDATE "User" SET "username"='randyjones' WHERE "username"='tomjones';

-- Select user with username "tomjones"
SELECT * FROM "User" WHERE "username"='tomjones';

-- Delete user with username "randyjones"
DELETE FROM "User" WHERE "username"='randyjones';

-- Select all rows from the "User" table
SELECT * FROM "User";
