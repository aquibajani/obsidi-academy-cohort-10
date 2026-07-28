Provide all the SQL statements you ran for these operations

-- Create the "Profile" table
CREATE TABLE "Profile" (
  "profileId" INTEGER GENERATED ALWAYS AS IDENTITY,
  "userId" INTEGER NOT NULL,
  "headline" VARCHAR(100) NOT NULL,
  "picture" TEXT NOT NULL,
  "bio" VARCHAR(100),
  "city" VARCHAR(50),
  "country" VARCHAR(50),
  CONSTRAINT "Profile_pkey" PRIMARY KEY("profileId"),
  CONSTRAINT "Profile_userId_fkey" FOREIGN KEY("userId") REFERENCES "User"("userId")
);

-- Insert a new row into the "Profile" table
INSERT INTO "Profile"("userId", "headline", "bio", "city", "country", "picture")
VALUES(2, 'Wondergirl Amy!', 'My name is Amy and I am a super hero.', 'Toronto', 'Canada', 'https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg');


-- Select all rows from the "Profile" table
SELECT * FROM "Profile";

-- Insert two new profiles with a single statement using a VALUES list. (use your own data)
INSERT INTO "Profile"("userId", "headline", "bio", "city", "country", "picture")
VALUES(1, 'Jessie is the best!', 'Living the life of my dreams.', 'Toronto', 'Canada', 'https://play-lh.googleusercontent.com/wOkQz7ylaBHJvgQoauxNPPcbOPu3fdflcCD3-W9qbTiOfV5GzD_cgFT4umpoE9IpFDeZ_cQ2XKTOCqsauGXo'),
(4, 'Chef Diana', 'Cooking is my passion.', 'Vancouver', 'British Columbia', 'https://static.vecteezy.com/system/resources/thumbnails/033/161/651/small/ai-generated-cute-little-girl-holding-a-bouquet-of-flowers-in-mothers-day-international-womens-day-st-valentines-day-concept-copy-space-photo.jpg');

-- Select all rows from the "Profile" table where the country is "Canada".

-- Update the profile with userId = 2

-- Delete profile with profileId = 3

-- Select all rows from the "Profile" table

-- Select the row from the "Profile" table with userdId = 2

-- Join the "User" and "Profile" tables to get all the details for ALL users (including the ones without a profile). Hint: Use an outer join.

-- Join the "User" and "Profile" tables to get the details of the users who have a profile.


