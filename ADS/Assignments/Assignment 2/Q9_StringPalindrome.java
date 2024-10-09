package a2;

public class Q9_StringPalindrome {
    
    public static void main(String[] args) {
        
        String s = "madam";
        String rev = "";
        
        // Corrected loop to start from s.length() - 1
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i); // Reverse the string
        }
        
        // Compare original and reversed strings
        if (s.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}
