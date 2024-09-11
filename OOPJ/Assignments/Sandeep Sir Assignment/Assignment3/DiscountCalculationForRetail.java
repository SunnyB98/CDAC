package assignment.sandeepSir;

import java.util.Scanner;

public class Dicount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Orignal Price: ");
		float originalPrice = sc.nextFloat();
		System.out.print("Enter Dicount Amount: ");
		float discountAmount = sc.nextFloat();
		float finalPrice  =  originalPrice - discountAmount;
		
		System.out.print("Dicount on Item: Rs. "+discountAmount+"\nFinal price: Rs. "+finalPrice );
		
	}

}
