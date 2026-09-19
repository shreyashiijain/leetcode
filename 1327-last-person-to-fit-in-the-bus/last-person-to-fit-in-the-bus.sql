# Write your MySQL query statement below
WITH ans AS(SELECT * , 
SUM(Weight) OVER(ORDER BY turn) AS w
FROM Queue)
SELECT person_name 
FROM ans
WHERE w<=1000
ORDER BY w DESC 
LIMIT 1;