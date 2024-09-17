package com.assig4.sandeepSir;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	int principal;
	int loanTerm ;
	int annualInterestRate;
	private int total;
	
	
	public LoanAmortizationCalculatorUtil() {
		
	}
	public LoanAmortizationCalculatorUtil(int principal, int loanTerm, int annualInterestRate) {
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

//	@Override
//	public String toString() {
//		return "LoanAmortizationCalculator [principal=" + principal + ", loanTerm=" + loanTerm + ", annualInterestRate="
//				+ annualInterestRate + "]";
//	}

	public void calculate(){
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		double numberOfMonths = loanTerm * 12;
		double monthlyPayment= (float) (principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));
		double totalAmountSpent = monthlyPayment * loanTerm * 12;
		System.out.println("Monthly Payment: "+monthlyPayment);
		System.out.println("Total amount paid: "+totalAmountSpent);
		}
//	public void printRecord(){
//		
//		double totalAmountSpent = monthlyPayment * loanTerm * 12;
//		System.out.println("Monthly Payment: "+monthlyPayment);
//		System.out.println("Total amount paid: "+totalAmountSpent);
//	}
	
	Scanner sc = new Scanner (System.in);
	public void acceptRecord() {
		System.out.print("Amount: ");
        this.setPrincipal(sc.nextInt());

        System.out.print("Loan Term (in years): ");
        this.setLoanTerm(sc.nextInt());

        System.out.print("Annual Interest Rate: ");
        this.setAnnualInterestRate(sc.nextInt());
	}
    }