using System;

class Calculator
{
    static void Main()
    {
        double num1, num2, result;
        char operation;

        Console.Write("Enter first number: ");
        num1 = Convert.ToDouble(Console.ReadLine());

        Console.Write("Enter an operator (+, -, *, /): ");
        operation = Convert.ToChar(Console.ReadLine());

        Console.Write("Enter second number: ");
        num2 = Convert.ToDouble(Console.ReadLine());

        switch (operation)
        {
            case '+':
                result = num1 + num2;
                Console.WriteLine("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                Console.WriteLine("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                Console.WriteLine("Result: " + result);
                break;
            case '/':
                if (num2 != 0)
                {
                    result = num1 / num2;
                    Console.WriteLine("Result: " + result);
                }
                else
                {
                    Console.WriteLine("Error: Division by zero is not allowed.");
                }
                break;
            default:
                Console.WriteLine("Invalid operator.");
                break;
        }

        Console.ReadLine(); // Pause the console
    }
}
