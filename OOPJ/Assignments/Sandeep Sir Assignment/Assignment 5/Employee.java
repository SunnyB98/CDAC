// Employee.java
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // Static fields
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    // Constructors
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double getTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Setter method for updating salary
    public void updateSalary(double newSalary) {
        totalSalaryExpense -= salary; // Deduct old salary
        totalSalaryExpense += newSalary; // Add new salary
        this.salary = newSalary;
    }

    // Method to apply raise to all employees
    public static void applyRaise(double percentage) {
        double raiseAmount = totalSalaryExpense * (percentage / 100);
        totalSalaryExpense += raiseAmount;
    }

    // Method to calculate total salary expense
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // toString method for representation
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: $" + salary;
    }

    // Main method for testing
    public static void main(String[] args) {
        // You can create instances of Employee here and test the methods
        // For example:
        Employee emp1 = new Employee(101, "Bill Gates", 50000.0);
        Employee emp2 = new Employee(102, "Steve Jobs", 60000.0);

        // Apply a 25% raise to all employees
        Employee.applyRaise(25);

        // Update salary for an individual employee
        emp1.updateSalary(75000.0);

        // Display total information
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: $" + Employee.calculateTotalSalaryExpense());

        // Display individual employee details
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
