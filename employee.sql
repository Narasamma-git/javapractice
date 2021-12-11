SELECT empid,name,salary FROM  employee
where salary>55000.00;

SELECT name,job,salary, salary*3 as annual_Salary from employee;
SELECT name,job,salary,salary-salary*0.25 as decrementn from employee;

-- display employee name,job,salary,75% decrement on annual salary.
SELECT name,job,salary,(salary*12)-((salary*12)*0.75) as annualdecrement from employee;

delete from employee where empid in(50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73);
update employee set name='Aiswarya', job='backend developer' where empid=14;
delete from employee where empid in(16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49);

create table department(dept_no INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
dname VARCHAR(255) NOT NULL,
empid INT NOT NULL);
ALTER TABLE employee
ADD COLUMN dept_no INT NOT NULL AFTER salary;

ALTER TABLE department
DROP COLUMN empid;

INSERT INTO department(dept_no,dname)VALUES(10,'developing'),(20,'testing'),(30,'Management'),(40,'Sales');
-- alias name is inactive in where clause because where clause  execute in select statement.
-- alias name is active in order by clause because order by clause executes after select statement 
ALTER TABLE employee 
ADD COLUMN commision INT NULL AFTER salary;

-- display employee name,salary,commission,60% increment and 50% decrement for all the employee

SELECT name,salary,commision,salary+salary*0.60 as "60%Increment",salary-salary*0.50 as "50%decrement"
from employee;
-- operators
-- 1)arithmetic operator  ->+,-,*,/,%
-- 2)relational operator ->  <,>,<=,>=,==,,!=
-- 3)logical operator -> ANd,OR,NOt
-- 4)speceial operator -> LIKE,IS,IN,BETWEEN
-- 5)set operator  ->Union,Unionall,intersect,minus
-- Logical operators
-- AND (If all conditions are true then only o/p is true)
-- Display employees who is working as salses man and belongs to dept no30
select * from employee
WHERE job='salesman' AND dept_no=30;
ALTER TABLE employee 
ADD COLUMN mgr_no INT NULL AFTER COMMISION;

-- display employee details who is working as manger and 
-- mgr no is1 16
SELECT * from employee
where job='manager' and mgr_no=16;
-- display employee details who are working as clerk or manager
SELECT * FROM employee
WHERE job='clerk' OR job='manager';

-- 
ALTER TABLE employee
ADD COLUMN hiredate date NOT NULL AFTER dept_no;

-- display employee name, job,mgr no only  for the employee who joined company in th year 96
SELECT name,job,salary,mgr_no FROM employee
WHERE hiredate>='1996-06-01';
-- display employee details those who joined company in the year between 96 and 2000
SELECT * FROM employee
WHERE hiredate>'1996-01-01' AND hiredate<'2001-01-01';

-- IN opeartor is multivalued operator which takes single LHS and multiple  RHS)  
-- In operator is used to optimize the query
SELECT * FROM employee
WHERE job IN('manualtester','Manager','salesman');
-- BETWEEN operator is preffered with condition is in the form of range
-- display employee detsils who are earning salary in the range of 10000 to 40000
SELECT * FROM employee
WHERE salary BETWEEN 10000 AND 40000;
-- LIKE operator is used to specify the pattern/wildcards
-- display empoyee details whos name has character a
SELECT * FROM employee 
WHERE ename LIKE '%A%'; 
-- display employee details whos name as exactly 4 or 5 characters and belong to dept no 10;

SELECT * FROM employee
WHERE name LIKE'----' OR name LIKE'-----'
AND dept_no=10;
-- display employee details whose name contains charactern A<E and earning salary in the range  of 10000 to 40000

SELECT * FROM employee
WHERE name like '%A%E%' AND salary between 10000 and 40000;
-- display employee details whose name contains substring 'man' and earning salary in the range of 10000-20000
SELECT * FROM employee 
WHERE name LIKE'%man' AND salary BETWEEN 10000 AND 20000;
-- display the employee details who joined in the month of July
SELECT * FROM employee
WHERE hiredate like'%07%';
-- display employee details who joined company in the year 96 and belongs to 
-- either dept no 10 or 20 and earning salary in the range of 10000 to 50000
-- and working as either clerk or manager or salesman
SELECT * FROM employee 
WHERE hiredate LIKE'1996%' AND dept_no In(10,20,30)
AND job IN('clerk','salesman')
AND salary BETWEEN 10000 AND 50000;
-- display employee details whose name ends with ovels
SELECT * FROM employee
 WHERE name like'%A' OR name like '%E' or name like '%I' or name like'%O' or name LIKE '%U';
-- display employee details whose name ends with consonents

SELECT name FROM employee
 WHERE name NOT LIKE '%A' AND name NOT like '%E' AND name NOT like '%I' AND name NOT like '%O' AND name NOT LIKE '%U';
-- IS operator is used to compare NULL values apartb from null it does not work with any other values

-- disply employee details who is not reorting to any manager
SELECT * FROM EMPLOYEE 
WHERE MGR_NO IS  NULL;

-- DISPLAY EMPLOYEE DETAILS WHO IS NOT EARNING ANY COMMISSION
SELECT * FROM EMPLOYEE
WHERE COMMISION IS NULL;




-- NOT OPERATOR CANNOT BE USED WINDEPENDENTLY LIKE ANY OTHER OPERATOR
-- NOT OPERATOR SHOULD BE USED WITH THE COMBINATION OF SPECIAL OPERATOR
-- NOT IN ,NOT LIKE, NOT BETWEEN

-- NOT IN -->it will select the  only if LHS value is not present in RHS
-- display employee details who is not working as clerk or salesman

SELECT * FROM employee
WHERE job NOT IN('clerk','salesman');
 -- display employee details who doesn't belong to deptno 30 and earning salary in range of 1000 to 25000;
 SELECT * FROM employee
 WHERE dept_no NOT IN(30) AND
 salary BETWEEN 10000 AND 25000;
 
-- display employee details who's name doesn't contain 6 character and not earning any COMMISION;
SELECT * FROM employee
 WHERE name NOT LIKE'____' AND  commision IS NULL;
 -- display employee details who is earning some value as commision;
 SELECT * FROM employee
 WHERE  commision is NOT NULL;
 -- set opearators used to combine multiple queries output into single output 
 -- union -> union operator will combine multiple queries output into single output without duplicate
 -- union all-->operator will combine multiple queries output into single output with duplicates
 -- intersect-> operator is used to combine multiple queries output into single o/p by giving common output
 -- minus-->operator is used to give uncommon o/p
 -- union
 SELECT name From employee
 WHERE dept_no=20
 union 
 SELECT name FROM employee
 WHERE job='automationtesterr';
 -- union all
  
 SELECT name From employee
 WHERE dept_no=20
 union all
 SELECT name FROM employee
 WHERE job='automationtesterr'; 
 
 -- intersect
-- function :functions are set of statements that are written in order to perform specific operation
-- functions are called or invoked by their function name
-- 1)user definde function
-- 2) built-in function or predefined function
--		1)SRF(Single Row Function):
			-- Single Row Function takes one i/p and gives single
			-- no of inputs directly propotional to number of inputs
--		2)MRF(Multi Row Function):
--  It takes n no of inputs and gives single output
-- 1.max(column name)
-- 2.min(column name)
-- 3.avg(column name)
-- 4.sum(column name)
-- 5.count(column name)
-- all MRF takes single input
-- display maximum salary among employees
SELECT MAX(salary) FROM employee;

SELECT job,MAX(salary) FROM employee 
WHERE job IN('.netdeveloper','automationtester','java developer','Manager','salesman')
GROUP BY job;

SELECT job,max(salary) FROM employee ;
-- o/p
-- javadeveloper		80000


select * from employee;
SELECT min(salary) FROM employee;



SELECT avg(salary) FROM employee;

-- group by clause: in oreder to achieve the combination of column name and MRF, we go for group by clause
-- using group  by clause we can create multiple groups in MRF
-- group by clause is used to create  create multiple output values  in the MRF
-- group by clause create multiple groups in MRF

-- display jobwise number of employees
SELECT job,count(*) FROM employee 
GROUP BY job; 
-- display department wise number of employees
SELECT dept_no,count(*) FROM employee
GROUP BY dept_no;
 -- display horedate wise number of employees except manager
 SELECT hiredate,job,count(*) FROM employee
 WHERE job <>'manager'
 GROUP BY hiredate,job;
 
 -- display salarywise number of employees only for the employees who is not earning commisssion
SELECT salary,count(name) FROM employee
 WHERE commision is NULL 
GROUP BY salary; 

-- RULES for group by clause
-- 1)column presenrt in select statement  should be specified in group by clause
-- 2) column present in group by clause need not be present  in the select statement

SELECT job,salary,count(job),count(salary) FROM employee
GROUP BY job;

-- display hiredate wise number of employees for each deptno except president where atleast 2 employees are working
SELECT hiredate,dept_no,count(*) FROM employee
WHERE job<>'manager'
GROUP BY hiredate,dept_no
HAVING count(*) >=2;
-- display salarywise number of employees for each job only for the employees who is earning salary in the range of 1000 to 5000
-- where almost 2 employees are working
SELECT job,salary,count(*) FROM employee
WHERE SALARY BETWEEN 10000 AND 50000
GROUP BY job,salary
HAVING count(*)<=2;

-- display manager number wise employees for each job along with the maximum salary, 
-- only for the employees who is working in deptno 20 or30
-- where atmost 3 employees are working

SELECT job, mgr_no ,count(*),max(salary) FROM employee
 WHERE dept_no IN(20,30)
GROUP BY job,mgr_no 
HAVING count(*)<=3;

-- display department wise number of employees for each manager number along with lowest salary
-- only for the employees who joined 
-- the company in the year 1996 when maximum salary should be less than 20000
SELECT dept_no,mgr_no,count(*),min(salary) FROM employee
GROUP BY dept_no,mgr_no
HAVING max(salary) <20000;
-- having clause:
-- 1). having clause is not independent, it is dependent on group by clause
-- 2).having clause filters the records only after grouping
-- 3) In order to specify MRF as condition we go for having clause
-- 3)we can specify MRF as a condition or column as condition
-- 4) If we want to specify column as condition that column should be present in group by clause
-- 5) MRF specified in having clause need not be specified in select statement
-- Subqueries
-- A query within a query is called subquery or query written inside another query is called subquery
-- compiler will give control to inner query.The output of inner query will give as input to the outer query
-- The outer query will execute based on the condition and provide final output.
-- Based on the input given by the innerquery is clasified into 2 types
-- 1. Single Row Subquery
-- 2. Multi Row Subquery
-- Single Row Subquery: If innerquery gives exactly one output then it is Single Row Subquery
-- Multi Row Subquery: If innerquery gives more than one output then it is Multi Row Subquery
-- incase of Single Row Subquery we can use any Relational and In operator for comparision
-- incase of Multi Row Subquery we can use only In operator for comparision
-- case1: To find unknown or undetermined values

		-- display employee details who is earning same salary as harshitha
        -- Single Row Subquery
SELECT * FROM employee
WHERE salary=(SELECT salary FROM employee WHERE name='harshitha');

-- Single Row Subquery
-- display employee details who are working as same job as narasamma
-- and belongs to the same deptno assangeetha

SELECT * FROM employee
WHERE job=(SELECT job FROM employee WHERE name='narasamma')
 AND
 dept_no=(SELECT dept_no FROM employee	WHERE name='sangeetha');
 
-- display employee details who joined company after Sneha's hiredate and employees who 
 -- are earning salary more than aiswarya's salary
 
 
 SELECT * FROM employee
 WHERE hiredate >(SELECT hiredate FROM employee WHERE name='Sneha') AND
 salary >(SELECT salary FROM employee WHERE name='Aiswarya'); 
 -- outut subquery returns more than 1 column
 -- So we cannot use relational operator we have to use IN operator because it must be handled by set comparision operators
 
-- Multiple-row subqueries are nested queries that can return more than one row of results
--  to the parent query. Multiple-row subqueries are used most commonly in WHERE and HAVING clauses. 
--  Since it returns multiple rows, it must be handled by set comparison operators (IN, ALL, ANY).While IN operator
--  holds the same meaning as discussed in the earlier chapter, ANY operator compares a specified value to each value 
--  returned by the subquery while ALL compares a value to every value returned by a subquery. The below query will 
--  show the error because single-row subquery returns multiple rows.

 SELECT * FROM employee
 WHERE hiredate IN(SELECT hiredate FROM employee WHERE name='Sneha') AND
 salary IN(SELECT salary FROM employee WHERE name='Aiswarya'); 








































