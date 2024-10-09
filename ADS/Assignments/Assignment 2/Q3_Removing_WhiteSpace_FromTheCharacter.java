package a2;
import java.util.*;

public class Q3_Removing_WhiteSpace_FromTheCharacter {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	        
	        String input = sc.nextLine();
	        
	        StringBuilder result = new StringBuilder(input);
	        
	        System.out.println(result.toString());
	        
	        for (int i=0; i<result.length(); i++){
	            if(result.charAt(i) == ' '){
	                continue;
	         }
	         System.out.print(result.charAt(i));
	        }
	}

}
