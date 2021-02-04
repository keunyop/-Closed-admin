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
public class GroupPurchaseMaster extends BaseTimeEntity {

	@Id
	@GeneratedValue
	private Long grpPurchId;

	@Column(length = 1000, nullable = false)
	private String grpPurchNm;

	@Column(nullable = false)
	private int progRnd;
	
	@Builder
    public GroupPurchaseMaster(String grpPurchNm, int progRnd) {
        this.grpPurchNm = grpPurchNm;
        this.progRnd = progRnd;
    }
}
