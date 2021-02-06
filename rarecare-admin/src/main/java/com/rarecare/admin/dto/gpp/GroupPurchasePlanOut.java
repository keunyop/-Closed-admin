package com.rarecare.admin.dto.gpp;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GroupPurchasePlanOut {
	private String  groupPurchaseName;
    private int     progressRound;
    
    @Builder
    public GroupPurchasePlanOut(String groupPurchaseName, int progressRound) {
		this.groupPurchaseName = groupPurchaseName;
		this.progressRound = progressRound;
	}
}
