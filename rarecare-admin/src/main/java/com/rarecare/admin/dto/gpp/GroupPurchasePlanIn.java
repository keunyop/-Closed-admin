package com.rarecare.admin.dto.gpp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GroupPurchasePlanIn {
	private String  groupPurchaseName;
    private int     progressRound;
}
