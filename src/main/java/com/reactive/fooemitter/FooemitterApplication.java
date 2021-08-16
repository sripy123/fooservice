package com.reactive.fooemitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.reactive.fooemitter"})
public class FooemitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FooemitterApplication.class, args);
	}

}
