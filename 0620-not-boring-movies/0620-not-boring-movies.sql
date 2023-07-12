# Write your MySQL query statement below
Select id,movie,description,rating from Cinema
Where description NOT LIKE 'boring' AND (SELECT MOD(id, 2)) != 0
ORDER BY rating DESC;