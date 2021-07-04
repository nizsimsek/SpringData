package com.nizsimsek.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner databasePopulator(CustomerRepository repository) {
        return args -> {
            repository.save(new Customer(20,"Nizamettin"));
            repository.save(new Customer(21,"Mehmet"));
            repository.save(new Customer(20,"Ali"));
        };
    }
}
