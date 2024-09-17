package assignment.Q4;
import java.util.Scanner;

class DiscountCalculator {
	double originalPrice;
	double discountRate ;
	
	public DiscountCalculator(){
		
	}
	
	public DiscountCalculator(double originalPrice, double discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public double bussinessLogic1(){
		double discountAmount = originalPrice * (discountRate / 100);
		return discountAmount;
	}
	public double bussinessLogic2(){
		double finalPrice = originalPrice - bussinessLogic1();
		return finalPrice;
	}

	@Override
	public String toString() {
		return "DiscountCalculator [originalPrice=" + originalPrice + ", discountRate=" + discountRate
				+ ", getOriginalPrice()=" + getOriginalPrice() + ", getDiscountRate()=" + getDiscountRate()
				+ ", bussinessLogic1()=" + bussinessLogic1() + ", bussinessLogic2()=" + bussinessLogic2()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
	
}

class DiscountCalculatorUtil {
	DiscountCalculator dc = new DiscountCalculator();
	
	public void acceptRecord(Scanner sc){
		System.out.print("Enter Original price (Rs.):    ");
		dc.setOriginalPrice(sc.nextDouble()); 
		System.out.print("Discount Rate (Rs.):    ");
		dc.setDiscountRate(sc.nextDouble()); 
		
	}
	public void printRecord(){
		double finalPrice = dc.bussinessLogic2();
		double discountAmount = dc.bussinessLogic1();
		System.out.println("Final Price(Rs.):    "+finalPrice );
		System.out.println("Discount Amouunt:    "+discountAmount);
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
		DiscountCalculatorUtil util = new DiscountCalculatorUtil();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while((choice = DiscountCalculatorUtil.menuList(sc)) != 0) {
			switch(choice) {
			case 1:
				util.acceptRecord(sc);
				break;
			case 2:
				util.printRecord();
				break;
			}
		}
		sc.close();	
	}
}
