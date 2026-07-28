Provide all the SQL statements you ran for these operations

-- Create the "Feed" table
CREATE TABLE "Feed"(
  "feedId" INTEGER GENERATED ALWAYS AS IDENTITY,
  "userId" INTEGER NOT NULL,
  "content" TEXT NOT NULL,
  "picture" TEXT NOT NULL,
  "createdOn" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT "Feed_pkey" PRIMARY KEY ("feedId"),
  CONSTRAINT "Feed_userId_fkey" FOREIGN KEY("userId") REFERENCES "User"("userId")
);

-- Insert a new row into the "Feed" table.
INSERT INTO "Feed"("userId", "content", "picture") VALUES(2, 'This is my first post!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg');


-- Insert two new rows into the "Feed" table for other users.
INSERT INTO "Feed"("userId", "content", "picture") VALUES(1, 'This is my second post!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg'),
(4, 'This is my third post!', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg');


-- Select all rows from the "Feed" table
SELECT * FROM "Feed";

-- Update the feed content for the feed with feedId = 1
UPDATE "Feed" SET "content"='This is my second post!' WHERE "userId"=1;

-- Delete feed with feedId = 2
DELETE FROM "Feed" WHERE "feedId"=2;

-- Select all rows from the "FeedMetaData" table.
SELECT * FROM "Feed";

-- Select feedMetaData with feedMetaDataId = 1
SELECT * FROM "Feed" WHERE "feedId" = 1;

-- Join the "User" and "Feed" tables.
SELECT * FROM "User" 
JOIN "Feed"
ON "User"."userId" = "Feed"."feedId";

-- Join the "User" and "Feed" tables to display the rows for username = 'amylee'
SELECT *
FROM "User"
JOIN "Feed"
ON "User"."userId" = "Feed"."userId"
WHERE "User"."username" = 'amylee';
