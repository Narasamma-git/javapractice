CREATE TABLE student(student_id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL
);

CREATE TABLE subject(subject_code INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
subject_name VARCHAR(255) NOT NULL);

CREATE TABLE marks(marks_id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
marks INT NOT NULL,
student_id INT NOT NULL,
subject_code INT NOT NULL
);

INSERT INTO student(name) VALUES('Narasamma'),('Keerthi'),('Harika'),('Jyothi');
Insert INTO subject(subject_name)VALUES('Java'),('SQL'),('J2EE'),('WEBTECHNOLOGY');
INSERT INTO marks(marks,student_id,subject_code)VALUES(80,1,1),(50,1,2),(75,1,3),(55,1,4);
ALTER TABLE marks
ADD COLUMN result VARCHAR(200) NOT NULL;
select * from student;
select * from subject;
select * from marks;

select count(student_id),subject_name
from marks
join student using(student_id)
join Subject using(subject_code)
where  result='FAIL'
group by subject_name;

