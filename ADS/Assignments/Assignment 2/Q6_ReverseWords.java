package a2;
import java.util.*;

public class Q6_ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string:  ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);	
		
        String[] words = str.split(" ");

//        System.out.println(Arrays.toString(words));
       
        for (int i = words.length-1; i>=0; i--) {
        	System.out.print(words[i]);        		
        	if(i != 0) {
        		System.out.print(" ");
        	}
        }		 
		
	}

}
