# Write your MySQL query statement below;
SELECT IFNULL((SELECT Distinct Salary FROM Employee ORDER BY Salary desc limit 1,1), NULL) as SecondHighestSalary