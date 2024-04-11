# Write your MySQL query statement below
select n.employee_id
from (SELECT * FROM Employees LEFT JOIN Salaries USING(employee_id)
   UNION  
   SELECT * FROM Employees RIGHT JOIN Salaries USING(employee_id)) as n
where n.name is NULL or n.salary is NULl
order by employee_id asc