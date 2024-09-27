package Que;

import java.util.Scanner;

public class Q9_IntegerPalindrome {

	static int pal(int n, int sum) {
		if(n==0) {
			return sum;
		}else {
			sum=(sum*10)+(n%10);
			return pal(n/10,sum);
		}
	}
	
	public static void main(String[] args) {
		int num,sum=0,p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number:  ");
		num=sc.nextInt();
		p=pal(num,sum);
		if(num==p) {
			System.out.println(num+" is a palindrome number.");
		}else {
			System.out.println(num+" is not a palindrome number.");
			
		}
		sc.close();
	}

}
