import java.util.*;
class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5};
        int n = 5;

        // Calculate expected sum and actual sum
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            actualSum += numbers[i];
        }

        // Find missing number
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}