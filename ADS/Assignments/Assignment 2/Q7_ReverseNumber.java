package a2;

import java.util.Scanner;

public class Q7_ReverseNumber {
	
	
    /* Iterative function to reverse 
    digits of num*/
//    static int reverseDigit(int num) 
//    { 
//        int rev_num = 0; 
//        while (num > 0) { 
//            rev_num = rev_num * 10 + num % 10; 
//            num = num / 10; 
//        } 
//        return rev_num; 
//    } 
//	
	
	static int reverseDigit(int num) {
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		num = Integer.parseInt(String.valueOf(sb));
		return num;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number:  ");
		int n =sc.nextInt();
		if(n < 0) {
			int b = reverseDigit(-1*n);
			System.out.println("-"+b);
		}else {
			System.out.println("Output:  "+reverseDigit(n));
		}
		sc.close();
		
	}

}






