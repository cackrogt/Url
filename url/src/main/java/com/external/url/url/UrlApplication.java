package com.external.url.url;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controllers.foreignUrlController;

@SpringBootApplication
@ComponentScan(basePackageClasses = foreignUrlController.class)
public class UrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlApplication.class, args);
		System.out.println("hello ankit access wazirx site now, will you");
	}

}
