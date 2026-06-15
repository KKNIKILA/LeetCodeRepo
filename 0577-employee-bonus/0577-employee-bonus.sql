# Write your MySQL query statement below
select p1.name,p2.bonus from Employee p1 left join Bonus p2 on p1.empId=p2.empId where p2.bonus<1000 or bonus is null;






















#NumbeR