class Student {
    private int studentId;	//declaring member functions
    private String name;
    private int age;

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;		//making it public
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);	//display details of student
    }
}

public class StudentDemo {	//main function and method
    public static void main(String[] args) {
        Student student = new Student(186, "Rahul Roy", 88);
        student.displayDetails();
    }
}