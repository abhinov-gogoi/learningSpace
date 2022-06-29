-- data.sql file is automatically executed by SPRING at the starting of the application

-- this will be created automatically by spring because
--@Entity @Table(name = "person") annotations

--INSERT INTO PERSON  (id, name, location, birth_date) values (10001, 'Abhinov', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10002, 'Raj', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10003, 'Ravi', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10004, 'Mahesh', 'Pune', CURRENT_TIMESTAMP());
--INSERT INTO PERSON  (id, name, location, birth_date) values (10005, 'Gagan', 'Pune', CURRENT_TIMESTAMP());

INSERT INTO student (id, name) values (10001, 'Abhinov');
INSERT INTO student (id, name) values (10002, 'Raj');
INSERT INTO student (id, name) values (10003, 'Mahesh');
INSERT INTO student (id, name) values (10004, 'Gagan');

INSERT INTO passport (id, number) values (10001, 'HDJ48F');
INSERT INTO passport (id, number) values (10002, 'FKN8EE');
INSERT INTO passport (id, number) values (10003, 'LD94HF');
INSERT INTO passport (id, number) values (10004, 'CNEW83');

INSERT INTO review (id, rating, description) values (10001, '1', 'Bad course');
INSERT INTO review (id, rating, description) values (10002, '2', 'Average course');
INSERT INTO review (id, rating, description) values (10003, '3', 'Good course');
INSERT INTO review (id, rating, description) values (10004, '4', 'Great course');





