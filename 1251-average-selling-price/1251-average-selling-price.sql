# Write your MySQL query statement below
select p.product_id,IFNULL(round(sum(p.units*p.price)/sum(p.units),2),0) as average_price from (select p1.product_id,p2.units,p1.start_date,p1.end_date,p2.purchase_date,p1.price from Prices p1 Left join UnitsSold p2 on p1.product_id=p2.product_id and p2.purchase_date between p1.start_date and p1.end_date) p group by p.product_id;
# p3 p3.purchase group by p3.start_date; 

-- select p1.product_id,sum(units*price)/sum(units) from () group by p1.product_id having p1.purchase_date between p1.start_date and p1.end_date;

-- select p1.product_id,p2.units,p1.start_date,p1.end_date,p2.purchase_date,p1.price from Prices p1 Left join UnitsSold p2 on p1.product_id=p2.product_id;















#NumbeR