# Write your MySQL query statement below
SELECT Email
FROM Person
GROUP BY email
HAVING COUNT(*)>1;