package com.lti.movierating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.movierating") 
@EntityScan("com.lti.movierating.entity")
public class MovieratingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieratingApplication.class, args);
	}

}
