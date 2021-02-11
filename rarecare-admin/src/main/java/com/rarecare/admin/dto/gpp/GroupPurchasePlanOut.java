package com.rarecare.admin.dto.gpp;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GroupPurchasePlanOut {
	private String groupPurchaseName;
	private int progressRound;
	private String paymentPlatformDscd;

	@Builder
	public GroupPurchasePlanOut(String groupPurchaseName, int progressRound, String paymentPlatformDscd) {
		this.groupPurchaseName = groupPurchaseName;
		this.progressRound = progressRound;
		this.paymentPlatformDscd = paymentPlatformDscd;
	}
}
