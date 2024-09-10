
public class LeapYear {

	public static void main(String[] args) {
		
		int num = 2024;
		
		if (num % 400 == 0) {
			System.out.println(num+" is leap year.");
		}else if (num % 4 == 0 && num % 100 == 0) {
			System.out.println(num+" is leap year.");
		}else {
			System.out.println(num+" is not leap year.");
		}
		
		 

	}

}
