# Write your MySQL query statement below
-- SELECT n.employee_id  
-- FROM Employees as n
-- LEFT JOIN Salaries as s
-- ON n.employee_id  = s.employee_id
-- WHERE s.employee_id IS NULL 
-- UNION
-- SELECT s.employee_id  
-- FROM Salaries as s
-- RIGHT JOIN Employees as n
-- ON s.employee_id  = n.employee_id
-- WHERE n.employee_id IS NULL ;
SELECT e.employee_id
FROM Employees AS e
LEFT JOIN Salaries AS s
ON e.employee_id = s.employee_id
WHERE s.employee_id IS NULL
UNION
SELECT s.employee_id
FROM Salaries AS s
LEFT JOIN Employees AS e
ON s.employee_id = e.employee_id
WHERE e.employee_id IS NULL
ORDER BY employee_id;