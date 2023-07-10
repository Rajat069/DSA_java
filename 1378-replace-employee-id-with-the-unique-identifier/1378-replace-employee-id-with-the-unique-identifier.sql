# Write your MySQL query statement below
Select ee.unique_id,e.name from EmployeeUNI ee
RIGHT JOIN Employees e ON ee.id=e.id;
