use studentdb;
SELECT * FROM student;

CREATE TABLE student(std_id INT NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
std_name VARCHAR(255) NOT NULL,
branch VARCHAR(255) NOT NULL,
Percentage DECIMAL NOT NULL);

INSERT INTO student(std_id,std_name,branch,percentage)VALUES(0,'Manasi','EC',70);
 UPDATE student set std_name='Aiswarya',branch='CS',percentage=90 WHERE std_id=3;
 -- display branchwise number of students
SELECT branch,count(*) FROM student
group by branch;

-- display percentage wise number of employees
SELECT percentage,count(*) FROM student
GROUP BY Percentage;
