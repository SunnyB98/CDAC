import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + circleArea);
                break;

            case 2:
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("The area of the square is: " + squareArea);
                break;

            case 3:
                System.out.println("Enter the length of the rectangle:");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;

            case 4:
                System.out.println("Enter the base of the triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + triangleArea);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid shape.");
        }

        scanner.close();
    }
}
