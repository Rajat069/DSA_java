# Write your MySQL query statement belo
select teacher_id, count( Distinct subject_id ) as cnt
from Teacher
Group By teacher_id;