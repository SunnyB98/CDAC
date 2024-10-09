import java.util.Scanner;
class ArrayMethods {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        acceptRecord(numbers);
        printRecord(numbers);
    }
    public static void acceptRecord(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }
    public static void printRecord(int[] numbers) {
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}