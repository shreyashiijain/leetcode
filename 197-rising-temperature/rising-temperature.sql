# Write your MySQL query statement below
WITH ans AS(SELECT id, temperature, recordDate,
           temperature-LAG(temperature) OVER (ORDER BY recordDate) AS diff,
           LAG(recordDate) OVER (ORDER BY recordDate) AS prev_date
    FROM Weather)
SELECT id AS Id
FROM ans
WHERE diff>0 AND DATEDIFF(recordDate,prev_date)=1;