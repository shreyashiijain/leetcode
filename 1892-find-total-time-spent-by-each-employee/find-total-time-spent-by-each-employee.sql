# Write your MySQL query statement below
SELECT event_day AS day, emp_id, sum(out_time-in_time) as total_time
FROM Employees
GROUP BY day, emp_id;