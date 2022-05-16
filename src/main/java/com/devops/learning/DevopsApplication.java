package com.devops.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

	@GetMapping("/get/{message}")
	public String getMessage(@PathVariable String message) {
		return message;
	}
	
	@PostMapping("/getBody")
	public String getBody(@RequestBody String message) {
		return message;
	}
	
	@GetMapping("/health")
	public String health() {
		return "Hello";
	}
}
