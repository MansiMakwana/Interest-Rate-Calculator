package com.mansi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class LoanInfo {
	
	private int creditScore;
	private Boolean salariedOrSelfEmployed;
	private double interestRate;
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public Boolean getSalariedOrSelfEmployed() {
		return salariedOrSelfEmployed;
	}
	public void setSalariedOrSelfEmployed(Boolean salariedOrSelfEmployed) {
		this.salariedOrSelfEmployed = salariedOrSelfEmployed;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public LoanInfo(int creditScore, Boolean salariedOrSelfEmployed, double interestRate) {
		super();
		this.creditScore = creditScore;
		this.salariedOrSelfEmployed = salariedOrSelfEmployed;
		this.interestRate = interestRate;
	}
	public LoanInfo() {
		super();
	}
	
	

}
