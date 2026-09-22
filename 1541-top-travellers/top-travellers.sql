# Write your MySQL query statement below
SELECT u.name, CASE
   WHEN r.distance IS NOT NULL THEN SUM(r.distance)
   WHEN r.distance IS NULL THEN  0
   END AS travelled_distance
FROM Users u
LEFT JOIN Rides r
ON u.id = r.user_id
GROUP BY u.id
ORDER BY travelled_distance DESC, name ASC;