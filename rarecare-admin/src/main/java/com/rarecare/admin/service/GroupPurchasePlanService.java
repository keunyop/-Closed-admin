package com.rarecare.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rarecare.admin.domain.gpp.GroupPurchaseMaster;
import com.rarecare.admin.dto.gpp.GroupPurchasePlanIn;
import com.rarecare.admin.repository.gpp.GroupPurchaseMasterRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GroupPurchasePlanService {

	private GroupPurchaseMasterRepository groupPurchaseMasterRepository;
	
	
	public List<GroupPurchasePlanIn> getGroupPurchasePlans() {
		List<GroupPurchaseMaster> groupPurchaseMasters = groupPurchaseMasterRepository.findAll();
		
		return null;
	}
}
