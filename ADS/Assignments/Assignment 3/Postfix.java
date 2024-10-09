package Questions;
import java.util.*;

//Postfix Expression using Stack

import java.util.Stack;

public class Postfix {

 static int evaluatePostfix(String exp) {

     Stack<Integer> stack = new Stack<>();
     for (int i = 0; i < exp.length(); i++) {

         char c = exp.charAt(i);

         if (Character.isDigit(c)) {
             stack.push(c - '0'); // Push the numeric value of the character
         } else {
             int val1 = stack.pop(); // Get the top of the stack
             int val2 = stack.pop(); // Get the second top of the stack

             switch (c) {
                 case '+':
                     stack.push(val2 + val1); // Add the two values
                     break;

                 case '-':
                     stack.push(val2 - val1); // Subtract val1 from val2
                     break;

                 case '/':
                     stack.push(val2 / val1); // Divide val2 by val1
                     break;

                 case '*':
                     stack.push(val2 * val1); // Multiply the two values
                     break;
             }
         }
     }
     return stack.pop(); // Return the final result
 }

 public static void main(String[] args) {
     String exp = "53+2*"; // Modified postfix expression to get 16
     System.out.println("Exp = " + evaluatePostfix(exp)); // Output should be 16
 }
}
