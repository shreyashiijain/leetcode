# Write your MySQL query statement below
WITH ans AS(SELECT d.name AS Department , e.name AS Employee , e.Salary , 
DENSE_RANK() OVER (PARTITION BY d.name ORDER BY e.Salary DESC) as p 
FROM Employee as e
LEFT JOIN Department as d 
ON e.departmentId  =  d.Id)
SELECT Department , Employee , Salary
FROM ans
WHERE p<4;