package assignment.Q3;
import java.util.Scanner;


class BMITracker {
	//fields
	private double weight;
	private double height;
	
	
	public BMITracker() {

	}
	public BMITracker(double weight, double height) {
		
		this.weight = weight;
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double bussinessLogic1(){
		double BMI = weight/(height*height);
		return BMI;
	}
	public void bussinessLogic2() {
		double BMI = bussinessLogic1();
		if(BMI < 18) {
			System.out.println("Person is Underwight.");
		}else if (BMI>=18 && BMI < 24.9) {
			System.out.println("The weight of the person is normal.");
		}else {
			System.out.println("Person is Overweight.");
		}
	}
}
class BMITrackerUtil {
	BMITracker bmit  = new BMITracker();
	//accept record
	public void acceptRecord(Scanner sc){
	System.out.println();	
	System.out.print("Weight:     ");
	bmit.setWeight(sc.nextDouble());
	System.out.print("Height:     ");
	bmit.setHeight(sc.nextDouble());
	System.out.println();
	}
	
	//print record
	public void printRecord(){
		double BMIValue = bmit.bussinessLogic1();
		System.out.print("BMI is:   "+ BMIValue);
		System.out.println();
		bmit.bussinessLogic2();
		System.out.println();
	}
	public static int menuList(Scanner sc){
		System.out.println("0. Exit");
		System.out.println("1. acceptRecord.");
		System.out.println("2. printRecord.");
		System.out.print("Enter choice:    ");
		int choice = sc.nextInt();
		return choice;
	}
}


public class Program {
	public static void main(String[] args) {
		BMITrackerUtil util = new BMITrackerUtil();
		Scanner sc = new Scanner(System.in);
		int choice;
		while((choice = BMITrackerUtil.menuList(sc)) != 0) {
			switch(choice) {
			case 1:
				util.acceptRecord(sc);
				break;
			case 2:
				util.printRecord();
			
			}
		}
		sc.close();
	}
}
