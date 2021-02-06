package com.rarecare.admin.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rarecare.admin.dto.gpp.GroupPurchasePlanOut;
import com.rarecare.admin.service.GroupPurchasePlanService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GroupPurchasePlanController {
	
	private GroupPurchasePlanService groupPurchasePlanService;

	@GetMapping("/gpps")
	public List<GroupPurchasePlanOut> getGPPs() {
		return groupPurchasePlanService.getGroupPurchasePlans();
	}
}