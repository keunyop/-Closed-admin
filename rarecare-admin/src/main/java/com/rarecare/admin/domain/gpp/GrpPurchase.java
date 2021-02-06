package com.rarecare.admin.domain.gpp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.rarecare.admin.domain.BaseTimeEntity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@ToString
public class GrpPurchase extends BaseTimeEntity {

	@Id
	@GeneratedValue
	private Long grpPurchaseId;

	@Column(length = 1000, nullable = false)
	private String grpPurchaseNm;

	@Column(nullable = false)
	private int progressRound;
	
	@Builder
    public GrpPurchase(String grpPurchaseNm, int progressRound) {
        this.grpPurchaseNm = grpPurchaseNm;
        this.progressRound = progressRound;
    }
}
