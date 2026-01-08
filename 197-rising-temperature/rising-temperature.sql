# Write your MySQL query statement below
select w2.id
from Weather  w1, Weather w2
where w1.temperature<w2.temperature and datediff(w2.recordDate,w1.recorddate)=1