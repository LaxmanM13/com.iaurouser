package com.iauroUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class Application {

	public static void main(String[] args) {


		System.out.println("welcome");
		SpringApplication.run(Application.class, args);
	}

}
