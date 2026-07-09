-- Last updated: 7/9/2026, 3:12:55 PM
select name as Customers
from Customers LEFT JOIN Orders
ON Customers.id=Orders.customerId
Where Orders.customerId IS NULL;