package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SbPokus001Application {

	public static void main(String[] args) {
		System.out.println("START start");
		SpringApplication.run(SbPokus001Application.class, args);
		System.out.println("START end");
	}

}
