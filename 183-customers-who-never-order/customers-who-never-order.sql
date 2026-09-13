# Write your MySQL query statement below
SELECT c.name as Customers
FROM Customers as c
LEFT JOIN Orders as o
on c.id = o.customerId
WHERE o.customerId IS NULL;