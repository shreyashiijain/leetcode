# Write your MySQL query statement below
with ans as(
    SELECT id,
    ROW_NUMBER() OVER(PARTITION BY email ORDER BY id) AS rnk
    FROM Person 
)
DELETE FROM Person
WHERE id IN (SELECT id FROM ans WHERE rnk > 1);