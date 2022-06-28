-- data.sql file is automatically executed by SPRING at the starting of the application

--create table person
--(
--    id integer not null,
--    name varchar(255) not null,
--    location varchar(255),
--    birth_date timestamp,
--    primary key(id)
--);

INSERT INTO PERSON  (id, name, location, birth_date) values (10001, 'Abhinov', 'Pune', CURRENT_TIMESTAMP());
INSERT INTO PERSON  (id, name, location, birth_date) values (10002, 'Raj', 'Pune', CURRENT_TIMESTAMP());
INSERT INTO PERSON  (id, name, location, birth_date) values (10003, 'Ravi', 'Pune', CURRENT_TIMESTAMP());
INSERT INTO PERSON  (id, name, location, birth_date) values (10004, 'Mahesh', 'Pune', CURRENT_TIMESTAMP());
INSERT INTO PERSON  (id, name, location, birth_date) values (10005, 'Gagan', 'Pune', CURRENT_TIMESTAMP());

-- Course Table for Hibernate tutorial

INSERT INTO COURSE  (id, name) values (1000, 'SQL c1');