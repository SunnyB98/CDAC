import java.util.Stack;


import java.util.*;

public class BalancedParenthesis{

    public static boolean ispar(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            // Push the opening brackets onto the stack
            if (current == '(' || current == '{' || current == '[') {
                stk.push(current);
            } 
            // Handle closing brackets
            else if (current == ')' || current == '}' || current == ']') {

                // If the stack is empty, it means no matching opening bracket
                if (stk.isEmpty()) {
                    return false;
                }
                char top = stk.pop(); // Pop the last opening bracket

                // Check if the current closing bracket matches the opening bracket
                if ((current == ')' && top != '(') ||
                    (current == '}' && top != '{') || 
                    (current == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // The stack should be empty if the string is fully balanced
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string of brackets: ");
        String testCase = scanner.nextLine();

        if (ispar(testCase)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        scanner.close();
    }
}
