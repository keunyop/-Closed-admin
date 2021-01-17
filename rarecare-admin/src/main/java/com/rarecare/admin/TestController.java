package com.rarecare.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value="/demo")
	public String demo() {
		System.out.println("DEMO!!!");
		return "demo";
	}
}
