# Write your MySQL query statement below
Select user_id,count(*) as followers_count
From Followers
Group By user_id
Order By user_id;