package com.assig4.sandeepSir;

public class LoanAmortizationCalculator {
	int principal;
	int loanTerm ;
	int annualInterestRate;
	private int total;
	
	public LoanAmortizationCalculator(int principal, int loanTerm, int annualInterestRate) {
		super();
		this.principal = principal;
		this.loanTerm = loanTerm;
		this.annualInterestRate = annualInterestRate;
	}
	
	

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public int getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(int annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
}