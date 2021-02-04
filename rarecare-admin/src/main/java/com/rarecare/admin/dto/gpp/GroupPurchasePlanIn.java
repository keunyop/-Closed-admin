package com.rarecare.admin.dto.gpp;

import com.rarecare.admin.domain.gpp.GroupPurchaseMaster;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GroupPurchasePlanIn {
	private String  groupPurchaseName;
    private int     progressRound;

    public GroupPurchaseMaster toEntity() {
        return GroupPurchaseMaster.builder().grpPurchNm(groupPurchaseName).progRnd(progressRound).build();
    }
}
