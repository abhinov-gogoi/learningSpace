-- data.sql file is automatically executed by SPRING at the starting of the application

-- this will be created automatically by spring because
--@Entity @Table(name = "person") annotations

--INSERT INTO PERSON  (id, name, location, birth_date) values (10001, 'Abhinov', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10002, 'Raj', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10003, 'Ravi', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10004, 'Mahesh', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10005, 'Gagan', 'Pune', CURRENT_TIMESTAMP());

INSERT INTO passport (id, number) values (10001, 'HDJ48F');
INSERT INTO passport (id, number) values (10002, 'FKN8EE');
INSERT INTO passport (id, number) values (10003, 'LD94HF');
INSERT INTO passport (id, number) values (10004, 'CNEW83');

INSERT INTO student (id, name, passport_id) values (10001, 'Abhinov', 10001);
INSERT INTO student (id, name, passport_id) values (10002, 'Raj', 10002);
INSERT INTO student (id, name, passport_id) values (10003, 'Mahesh', 10003);
INSERT INTO student (id, name, passport_id) values (10004, 'Gagan', 10004);

INSERT INTO course (id, name, created_date, last_updated_date) values (10001, 'Spring in 100s', CURRENT_DATE(), CURRENT_DATE());
INSERT INTO course (id, name, created_date, last_updated_date) values (10002, 'Java in 100s', CURRENT_DATE(), CURRENT_DATE());
INSERT INTO course (id, name, created_date, last_updated_date) values (10003, 'Maven in 100s', CURRENT_DATE(), CURRENT_DATE());
INSERT INTO course (id, name, created_date, last_updated_date) values (10004, 'SQL in 100s', CURRENT_DATE(), CURRENT_DATE());

INSERT INTO review (id, rating, description, course_id) values (10001, '1', 'Bad course', 10001);
INSERT INTO review (id, rating, description, course_id) values (10002, '2', 'Average course', 10002);
INSERT INTO review (id, rating, description, course_id) values (10003, '3', 'Good course', 10003);
INSERT INTO review (id, rating, description, course_id) values (10004, '4', 'Great course', 10004);





