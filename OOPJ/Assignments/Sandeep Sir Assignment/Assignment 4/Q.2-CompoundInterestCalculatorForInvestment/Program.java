package assignment4.Q2;
import java.util.Scanner;

class CompoundInterestCalculator {
	//fields
	private double principal ;
	private double annualInterestRate ; //must provide this /100 value as I/P ie. for 1.2 it is 0.012
	private double numberOfCompounds;
	private double years;

	//default constructor
	public CompoundInterestCalculator( ) {
			      //Constructor Chaining
	}
	//parametrize constructors
	public CompoundInterestCalculator(double principal, double annualInterestRate, int numberOfCompounds, int years) {
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompounds = numberOfCompounds;
		this.years = years;
	}
	
	//getters & Setters
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getNumberOfCompounds() {
		return numberOfCompounds;
	}
	public void setNumberOfCompounds(double numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	//businessLogic method - 1
	public double bussinessLogic1(){
		double futureValue =  (principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years));
		return futureValue;
	}
	//businessLogic method - 2
	public double bussinessLogic2() {
		double totalInterest = bussinessLogic1() - principal;
		return totalInterest;
	}
	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", numberOfCompounds=" + numberOfCompounds + ", years=" + years + ", getPrincipal()=" + getPrincipal()
				+ ", getAnnualInterestRate()=" + getAnnualInterestRate() + ", getNumberOfCompounds()="
				+ getNumberOfCompounds() + ", getYears()=" + getYears() + ", bussinessLogic1()=" + bussinessLogic1()
				+ ", bussinessLogic2()=" + bussinessLogic2() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}

class CompoundInterestCalculatorUtil {
	CompoundInterestCalculator cic = new CompoundInterestCalculator();
	
	public void acceptRecord(Scanner sc){
		System.out.print("Enter Principal:    ");
		cic.setPrincipal(sc.nextFloat());
//		sc.nextFloat();
		System.out.print("Enter Annaul Interest Rate(%):     ");
		cic.setAnnualInterestRate(sc.nextFloat());
		System.out.print("Enter Number of Compounds:    ");
		cic.setNumberOfCompounds(sc.nextDouble());
		System.out.print("Enter Investment Duration(years):     ");
		cic.setYears(sc.nextDouble());
		System.out.println("************************************************************");		
	}
	public void printRecord(){
		double futureValue = cic.bussinessLogic1();
		double totalInterest = cic.bussinessLogic2();
		String formatedFutureValue = String.format("%.2f", futureValue);
		String formatedTotalInterest = String.format("%.2f", totalInterest);
		System.out.println("Future Value is:   "+formatedFutureValue+"\n Total Interets Rate:   "+ formatedTotalInterest);	
		
//		String.format("Future Value is:   %.2f", futureValue)+String.format("\n Total Interets Rate:   %.2f", totalInterest)
	}
	public static int menuList(Scanner sc){
		System.out.println("0. Exit");
		System.out.println("1. acceptRecord.");
		System.out.println("2. printRecord.");
		System.out.println("Enter choice:    ");
		int choice = sc.nextInt();
		return choice;
	}	
}

public class Program {
	public static void main(String[] args) {
		CompoundInterestCalculatorUtil util = new CompoundInterestCalculatorUtil();
		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice= CompoundInterestCalculatorUtil.menuList(sc)) != 0) {
			switch(choice) {
			case 1:
				util.acceptRecord(sc);
				break;
			case 2:
				util.printRecord();
				break;
			}
		}sc.close();	
	}
}
