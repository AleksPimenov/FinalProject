package com.example.FinalProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalProjectApplication {
	private static final Logger log = LoggerFactory.getLogger(FinalProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

	@Bean

	public CommandLineRunner demo(FinalCustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new FinalCustomer("Jack", "Bauer"));
			repository.save(new FinalCustomer("Chloe", "O'Brian"));
			repository.save(new FinalCustomer("Kim", "Bauer"));
			repository.save(new FinalCustomer("David", "Palmer"));
			repository.save(new FinalCustomer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(customer -> {
				log.info(customer.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			FinalCustomer customer = repository.findById(1L);
			log.info("FinalCustomer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("FinalCustomer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			log.info("");
		};
	}




}
