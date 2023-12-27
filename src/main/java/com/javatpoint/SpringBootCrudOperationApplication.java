package com.javatpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatpoint.model.Books;
import com.javatpoint.service.BooksService;


@SpringBootApplication
public class SpringBootCrudOperationApplication implements CommandLineRunner {
	
	//h2 console --> http://localhost:8080/h2-console --> Database books_data
	
	@Autowired
	BooksService bookService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudOperationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookService.saveOrUpdate(new Books("2 States", "Chetan Bhagat", 1000));
		bookService.saveOrUpdate(new Books("Half girlfriend", "Chetan Bhagat", 1500));
	}
}
