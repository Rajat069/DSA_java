# Write your MySQL query statement below
Select e.name as Employee
from Employee e
INNER Join Employee m on e.managerId = m.id
Where e.salary>m.salary;