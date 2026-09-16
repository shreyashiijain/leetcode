# Write your MySQL query statement below
select s.score , 
dense_rank() over( order by score desc) as 'rank'
from Scores as s;