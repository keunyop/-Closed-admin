package com.rarecare.admin.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rarecare.admin.dto.gpp.GroupPurchasePlanOut;
import com.rarecare.admin.repository.gpp.GrpPurchaseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GroupPurchasePlanService {
	private GrpPurchaseRepository grpPurchaseRepository;

	public List<GroupPurchasePlanOut> getGroupPurchasePlans() {
		return grpPurchaseRepository.findAll().stream()
				.map(gpm -> GroupPurchasePlanOut.builder().groupPurchaseName(gpm.getGrpPurchaseNm()).build())
				.collect(Collectors.toList());
	}
}