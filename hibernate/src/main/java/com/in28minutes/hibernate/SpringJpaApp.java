package com.in28minutes.hibernate;

import com.in28minutes.hibernate.entity.Person;
import com.in28minutes.hibernate.repository.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class SpringJpaApp implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	@Autowired
	PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		/**
//		 * CREATE/UPDATE - upsert
//		 */
//		logger.info("inserting 10008 User : {}", personJpaRepository.upsert(
//				new Person("JPAAMan", "AtZ", new Date(System.currentTimeMillis()))
//		));
//
//		/**
//		 * READ
//		 */
//		logger.info("findById User : {}", personJpaRepository.findById(10001));
//		logger.info("All Users : {}", personJpaRepository.findAll());
//		/**
//		 * DELETE
//		 */
//		personJpaRepository.deleteById(10002);


	}
}
