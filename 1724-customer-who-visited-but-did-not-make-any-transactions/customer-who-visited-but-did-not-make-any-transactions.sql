# Write your MySQL query statement below
SELECT v.customer_id  , COUNT(*) as count_no_trans 
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id  = t.visit_id 
WHERE amount IS NULL
GROUP BY customer_id 
ORDER BY count_no_trans ;