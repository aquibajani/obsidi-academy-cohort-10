Provide all the SQL statements you ran for these operations


-- Create the "FeedMetaData" table


CREATE TABLE "FeedMetaData" (
    "feedMetaDataId" INTEGER GENERATED ALWAYS AS IDENTITY,
    "feedId" INTEGER NOT NULL,
    "actionUserId" INTEGER NOT NULL,
    "isLike" BOOLEAN NOT NULL,
    "comment" VARCHAR(200),
    "createdOn" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
     CONSTRAINT "FeedMetaData_pkey" PRIMARY KEY ("feedMetaDataId"),
     CONSTRAINT "FeedMetaData_actionUserId_fkey" FOREIGN KEY ("actionUserId") REFERENCES "User"("userId"),
     CONSTRAINT "FeedMetaData_feedId_fkey" FOREIGN KEY ("feedId") REFERENCES "Feed"("feedId")
);


-- Insert a new row into the "FeedMetaData" table.
INSERT INTO "FeedMetaData" ("feedId", "actionUserId", "isLike", "comment")
VALUES(1, 1, true, 'Nice city!');


-- Insert two new rows into the "FeedMetaData" table.
INSERT INTO "FeedMetaData""feedId", "actionUserId", "isLike", "comment")
VALUES(1, 4, false, 'Great view'), (1, 2, true, 'I’ll be back!');


-- Select all rows from the "FeedMetaData" table.
SELECT * FROM "FeedMetaData";


-- Update the feedMetaData content for the feedMetaData with feedMetaDataId = 1
UPDATE "FeedMetaData" SET "comment" = 'Thanks fam!' WHERE "feedMetaDataId" = 1;


-- Delete feedMetaData with feedMetaDataId = 2
DELETE FROM "FeedMetaData"
WHERE "feedMetaDataId"= 2;


-- Select all rows from the "FeedMetaData" table.
SELECT * FROM "FeedMetaData";


-- Select feedMetaData with feedMetaDataId = 1
SELECT * FROM "FeedMetaData"
WHERE "feedMetaDataId" = 1;


-- Join the "Feed" and "FeedMetaData" tables to display a row (or rows) for feedId = 1

SELECT *
FROM "Feed"
LEFT JOIN "FeedMetaData"
ON "Feed"."feedId" = "FeedMetaData"."feedId"
WHERE "Feed"."feedId" = 1;


-- Join the "User", "Feed" and "FeedMetaData" tables to display a row (or rows) for userId = 2
SELECT *
FROM "User"
LEFT JOIN "Feed"
ON "User"."userId" = "Feed"."userId"
LEFT JOIN "FeedMetaData"
ON "Feed"."feedId" = "FeedMetaData"."feedId"
WHERE "User"."userId" = 2;