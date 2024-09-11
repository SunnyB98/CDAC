package assignment.sandeepSir;

import java.util.Scanner;

//2. Compound Interest Calculator for Investment (18 lines code)

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter the Initial Investment Amount: ");
		int principal  = sc.nextInt();
		
		System.out.print("Enter the Annual Intrest Rate: ");
		int annualInterestRate   = sc.nextInt(); 
		
		System.out.print("Enter number of times the interest is compounded per year: ");
		int numberOfCompounds = sc.nextInt(); 
		
		System.out.println("Enter Investment duration: ");
		int years = sc.nextInt(); 
		
//		Future Value Calculation.
//		Formula
		int futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years);

//		Total Interest Earned
		int totalInterest = futureValue - principal;
		
		System.out.println("Future value: "+futureValue+"\nTotal interest earned: "+totalInterest);			
	}
}