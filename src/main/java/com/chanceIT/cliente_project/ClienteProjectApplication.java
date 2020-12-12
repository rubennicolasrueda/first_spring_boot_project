package com.chanceIT.cliente_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring boot aplication
/*
* @SpringBootConfiguration @Configuration
* @EnableAutoConfiguration
* @ComponentScan this let you use the annotations @Service @Component @Controller
* */

@SpringBootApplication
public class ClienteProjectApplication {

	public static void main(String[] args) {
		//runs the aplication
		SpringApplication.run(ClienteProjectApplication.class, args);
	}

}
