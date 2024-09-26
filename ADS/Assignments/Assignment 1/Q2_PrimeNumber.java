package Que;

import java.util.Scanner;

public class Q2_PrimeNumber {
	
	static int primeNumber(int num, int i){
		if(i==1) {
			return 1;
		}
		if(num%i == 0 ) {
			return 0;
		}
		return primeNumber(num, i-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:  "); 
		int num = sc.nextInt();
		int p = primeNumber( num,  num/2);
		
		if(p==1) {
			System.out.println("Number is prime.");
		}else {
			System.out.println("Number is not prime.");
		}
		
		sc.close();

	}
}
