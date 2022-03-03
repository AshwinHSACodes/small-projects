package com.basicapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/basicapp/api/v0/")
public class GreetingController {

	@GetMapping(value = "/greetingget")
	public String greetings() {
		return "Hello , Welcome to spring boot : This is get method call.";
	}
	
	@GetMapping(value = "/greetingpathvariable/{input}")
	public String greetingsWithPathVariable(@PathVariable("input") String inputVariable) {
		return "Hello , Welcome to spring boot : This is post method call with pathvariable : " + inputVariable + ".";
	}
	
	@GetMapping(value = "/greetinrequestparameter")
	public String greetingsPost(@RequestParam String requestParameter) {
		return "Hello , Welcome to spring boot : This is post method call : " + requestParameter + "."  ;
	}
	
	@PostMapping(value = "/greetingpost")
	public String greetingsPostQuery() {
		return "Hello , Welcome to spring boot : This is post method call.";
	}
		
}

