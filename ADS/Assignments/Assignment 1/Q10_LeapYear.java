package Que;

import java.util.Scanner;

public class Q10_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year:  ");
		int year = sc.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
			System.out.println("Leap Year!!!");
		}else {
			System.out.println("Not leap year!");
		}
		sc.close();
	}

}
