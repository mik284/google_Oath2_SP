package com.googleOauth2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class GoogleOauth2Application {

	@GetMapping
	public String welcomeMessage() {
		return "Hello Welcome to Google OAuth 2.0!";
	}
	@GetMapping("/user")
	public Principal user(Principal principal) {
		System.out.println("username: " +principal.getName());
		return principal;
	}
	public static void main(String[] args) {
		SpringApplication.run(GoogleOauth2Application.class, args);
	}

}
