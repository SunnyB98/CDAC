
public class AssignAnswer {

	public static void main(String[] args) {
		
		
//	1) Write a program that demonstrates widening conversion from int to double and prints 
//	   the result.

		 int num = 100;        // Integer value
	     double result = num;  // Widening conversion from int to double

	     System.out.println("Widening conversion from int to double: " + result);
		  
		  
//    2) Create a program that demonstrates narrowing conversion from double to int and 
//	   prints the result.	  
//		  
	     double num1 = 123.456;  // Double value
	     int result1 = (int) num1; // Narrowing conversion (casting) from double to int

	     System.out.println("Narrowing conversion from double to int: " + result1);
	     
//	   3)  Write a program that performs arithmetic operations involving different data types (int, double, float) and observes 
//	     how Java handles widening conversions automatically.	  
	     int intVal = 10;
	     float floatVal = 20.5f;
	     double doubleVal = 30.75;

	  // Performing arithmetic operations
	     double result2 = intVal + floatVal;   // int and float: float is widened to double
	     double result3 = floatVal + doubleVal; // float and double: float is widened to double
	     double result4 = intVal + doubleVal;   // int and double: int is widened to double

	     System.out.println("Result of int + float: " + result2);
	     System.out.println("Result of float + double: " + result3);
         System.out.println("Result of int + double: " + result4);	  
		  
//     4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)  
//		  and prints the result.
         
         int num3 = 42;

         // Widening conversion to double
         double doubleResult = num3;

         // Widening conversion to float
         float floatResult = num3;

         // Conversion to Boolean (boolean doesn't support widening from int directly, so we use a condition)
         boolean booleanResult = (num3 != 0);  // Any non-zero integer is treated as true, 0 as false

         // Conversion to String
         String stringResult = Integer.toString(num3);

         System.out.println("Widening conversion from int to double: " + doubleResult);
         System.out.println("Widening conversion from int to float: " + floatResult);
         System.out.println("Conversion from int to boolean: " + booleanResult);
         System.out.println("Conversion from int to string: " + stringResult);   
	}

}
