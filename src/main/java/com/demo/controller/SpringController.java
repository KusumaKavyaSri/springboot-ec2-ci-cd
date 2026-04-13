package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		return "Hi " + name + "!!!! It's good to see u";
	}
}
