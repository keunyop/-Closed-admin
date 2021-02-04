package com.rarecare.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value="/demo")
	public String demo() {
		System.out.println("DEMO!!!");
		return "hi";
	}
}
