package assignment.sandeepSir;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height: ");
		float height = sc.nextFloat();
		
		System.out.println("Enter Weight: ");
		float weight = sc.nextFloat();
		
//		Frmula
		float BMI = weight/(height*height);
		
		System.out.println("BMI is: "+BMI);
		
//		Category
		if(BMI < 18) {
			System.out.println("Person is Underwight.");
		}else if (BMI>=18 && BMI < 24.9) {
			System.out.println("The weight of the person is normal.");
		}else {
			System.out.println("Person is Overweight.");
		}
		
	}

}
