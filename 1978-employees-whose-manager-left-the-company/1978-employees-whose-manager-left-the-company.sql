# Write your MySQL query statement below
Select employee_id from Employees
Where salary < 30000 AND manager_id NOT in (Select employee_id from Employees)
ORDER BY employee_id;