package com.chanceIT.first_spring_boot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring boot aplication
/*
* @SpringBootConfiguration @Configuration
* @EnableAutoConfiguration
* @ComponentScan this let you use the annotations @Service @Component @Controller
* */

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
		//runs the aplication
		SpringApplication.run(FirstSpringBootProjectApplication.class, args);
	}

}
