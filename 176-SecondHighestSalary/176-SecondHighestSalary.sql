-- Last updated: 7/9/2026, 3:13:06 PM
select MAX(salary) as SecondHighestSalary
from Employee
where salary < (Select MAX(salary) from Employee); 