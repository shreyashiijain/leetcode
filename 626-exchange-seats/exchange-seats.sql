# Write your MySQL query statement below
WITH ans AS(SELECT id,student, LAG(student) OVER(ORDER BY id) as bef,
LEAD(student) OVER(ORDER BY id) as aft
FROM Seat)
SELECT id , CASE
WHEN aft IS NULL AND id % 2 != 0 THEN student -- Last odd row stays the same
           WHEN id % 2 = 0 THEN bef                     -- Even rows get previous student
           ELSE aft 
END AS student
FROM ans
ORDER BY id;