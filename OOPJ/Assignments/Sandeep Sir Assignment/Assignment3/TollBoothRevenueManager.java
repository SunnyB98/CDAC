package assignment.sandeepSir;

import java.util.Scanner;

public class TollBoothRevenueManager {

//	Vehicle Rate
	float carRate;
	float truckRate;
	float motorCycleRate;
	
//	vehicle type
	float car;
	float truck;
	float motorCycle;
	
	
	
	
//	car count/number of car passed
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of car passed: ");
		this.car = sc.nextFloat();		
		System.out.print("No. of truck passed: ");
		this.truck = sc.nextFloat();
		System.out.print("No. of motorCycle passed: ");
		this.motorCycle = sc.nextFloat(); 
		sc.close();
		
	}
	
//	Rate of each type of vehicle
	public void setTollRates(float carRate, float truckRate, float motorCycleRate) {
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.motorCycleRate=motorCycleRate;
	}
	
//	formula
	public float calculateRevenue (){
		return (carRate*car)+(truckRate*truck)+(motorCycleRate*motorCycle);
	}
	
	public float totalVehicles() {
		return car+truck+motorCycle;
	}
	
	public void printRecord(){
		System.out.println("----------------------------------");
		System.out.println("Total number of vehicles: "+totalVehicles()+"\nTotale Revenue collected is: "+calculateRevenue());
	}
	public static void main(String[] args) {
		TollBoothRevenueManager ref = new TollBoothRevenueManager();
		ref.setTollRates(50, 100, 30);
		ref.acceptRecord();
		ref.printRecord();
	}
}
