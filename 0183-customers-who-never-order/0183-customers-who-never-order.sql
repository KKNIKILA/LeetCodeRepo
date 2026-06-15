# Write your MySQL query statement below
select p1.name as Customers from Customers p1 left join Orders p2 on p1.id=p2.customerId where p2.customerId is null; 