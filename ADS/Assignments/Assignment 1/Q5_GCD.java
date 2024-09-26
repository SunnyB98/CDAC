package Que;

import java.util.Scanner;

public class Q5_GCD {
	static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}else {
			return gcd(b, a%b);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int a= sc.nextInt();
		System.out.println("Enter number 2: ");
		int b=sc.nextInt();
		
		int r = gcd(a,b);
		System.out.println("GCD is "+r);
		sc.close();

	}
}
