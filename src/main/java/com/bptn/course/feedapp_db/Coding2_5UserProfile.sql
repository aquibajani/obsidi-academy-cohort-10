-- Retrieve All User IDs: Select all unique userId values from the "User" table
SELECT DISTINCT "userId" FROM "User";

-- Profiles in Canada: Select headline, city, and country for profiles located in 'Canada'
SELECT "headline", "city", "country" FROM "Profile" WHERE "country" LIKE 'Canada';

-- INNER JOIN User and Profile to display firstName, lastName, and headline
SELECT "u"."firstName", "u"."lastName", "p"."headline"
FROM "User" AS "u"
INNER JOIN "Profile" AS "p" ON "u"."userId"="p"."userId";

-- Users Without Profiles (Outer Join): LEFT JOIN to include all users, ORDER BY headline 
SELECT *
FROM "User"
LEFT JOIN "Profile" ON "User"."userId"="Profile"."userId"
WHERE "Profile"."profileId" IS NULL
ORDER BY "Profile"."headline";

-- GROUP BY emailVerified status and COUNT the number of users in each group
SELECT "emailVerified", COUNT(*) FROM "User" GROUP BY "emailVerified";

-- Use UNION to combine userId from all profiles AND users in Canada
SELECT "userId","firstName" FROM "User"
UNION
SELECT "userId", "country" FROM "Profile" WHERE "country"='Canada';

-- Which ACID property is ensured by the UNIQUE constraint on username?

-- Write a TRIGGER function named log_profile_update BEFORE UPDATE on the Profile table
