package a2;

import java.util.Scanner;

public class Q4_ReverseFirstCharacterOfString {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Enter String: ");
	     String input = sc.nextLine();  
	     
	     StringBuilder sb = new StringBuilder(input);	 
//	     System.out.println(sb.toString());
	   
	     char c =sb.charAt(0);
	     sb.deleteCharAt(0);
	     
	     sb.append(c);
	     System.out.println(sb);
	     
	     }
	}


