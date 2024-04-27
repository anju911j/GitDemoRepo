package com.example.Gitauth2Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/ServiceApp")
	public String hi() {
		return "Hello Anjana Here";
	}
}