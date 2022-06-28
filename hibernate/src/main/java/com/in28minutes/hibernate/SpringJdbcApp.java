package com.in28minutes.hibernate;

import com.in28minutes.hibernate.repository.jdbc.PersonJDBCDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApp implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	@Autowired
	PersonJDBCDao personJDBCDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("All Users : {}", personJDBCDao.findAll());
//		logger.info("findById User : {}", personJDBCDao.findById(10001));
//		logger.info("deleteById User : {}", personJDBCDao.deleteById(10002));
//
//		logger.info("inserting 10008 User : {}", personJDBCDao.insert(
//				new Person(10008, "Zack","AZ", new Date(System.currentTimeMillis()))
//		));
//
//		logger.info("inserting 10008 User : {}", personJDBCDao.update(
//				new Person(10008, "Zack","AZ2", new Date(System.currentTimeMillis()))
//		));

	}
}
