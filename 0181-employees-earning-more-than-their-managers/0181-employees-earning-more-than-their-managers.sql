# Write your MySQL query statement below
select p1.name as Employee from employee p1 inner join employee p2 on p1.managerId=p2.id where p1.salary>p2.salary;