package com.rarecare.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupPurchasePlanController {

	@GetMapping("/gpps")
	public void getGPPs() {
		System.out.println("gpps");
	}
}