# Write your MySQL query statement below
with ans as(select num as ConsecutiveNums,
lag(num,2) over() as prev2, lag(num) over() as prev1
from Logs)
select distinct(ConsecutiveNums) from ans where ConsecutiveNums = prev1 && prev1 = prev2;