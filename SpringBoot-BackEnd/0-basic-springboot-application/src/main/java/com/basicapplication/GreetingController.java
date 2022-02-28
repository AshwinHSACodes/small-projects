package com.basicapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "greeting")
public class GreetingController {

	@GetMapping(value = "/greeting")
	public String greetings() {
		return "Hello , Welcome to spring boot";
	}
}
