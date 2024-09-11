package assignments.sandeepSir;
import java.util.Scanner;

public class Calculator {
	
		double principalAmount;
		double annualInterestRate;
		double loanTerm;
		
		
		Scanner sc = new Scanner(System.in);  	//accepting i/p
		
		public void acceptRecord(){
		System.out.print("Enter the annual principal amount: ");
		principalAmount  = sc.nextInt();    //also known as loan amount 
		System.out.print("Enter the Annual Interest Rate: ");
		annualInterestRate = sc.nextInt();
		System.out.print("Enter Loan Term: ");
		loanTerm = sc.nextInt(); //in years 
		sc.close();
		}
		
		public double calculate(){
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		double numberOfMonths = loanTerm * 12;
		return (principalAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1));
		}
		
		public void printRecord(){
			Double monthlyPayment = calculate();
			double totalAmountSpent = monthlyPayment * loanTerm * 12;
			System.out.println("Monthly Payment: "+monthlyPayment);
			System.out.println("Total amount paid: "+totalAmountSpent);
		}
		
		public static void main(String[] args) {
			Calculator s = new Calculator();
			s.acceptRecord();
			s.printRecord();
		}
		
}






