package assignment4.Q5;

import java.util.Scanner;

class TollBoothRevenueManager {
	float carRate;
	float truckRate;
	float motorCycleRate;
	
//	vehicle type
	float car;
	float truck;
	float motorCycle;
	
	public TollBoothRevenueManager() { 
		
	}
	
	
	public TollBoothRevenueManager(float carRate, float truckRate, float motorCycleRate, float car, float truck,
			float motorCycle) {
		this.carRate = carRate;
		this.truckRate = truckRate;
		this.motorCycleRate = motorCycleRate;
		this.car = car;
		this.truck = truck;
		this.motorCycle = motorCycle;
	}


	public float getCarRate() {
		return carRate;
	}
	public void setCarRate(float carRate) {
		this.carRate = carRate;
	}
	public float getTruckRate() {
		return truckRate;
	}
	public void setTruckRate(float truckRate) {
		this.truckRate = truckRate;
	}
	public float getMotorCycleRate() {
		return motorCycleRate;
	}
	public void setMotorCycleRate(float motorCycleRate) {
		this.motorCycleRate = motorCycleRate;
	}
	public float getCar() {
		return car;
	}
	public void setCar(float car) {
		this.car = car;
	}
	public float getTruck() {
		return truck;
	}
	public void setTruck(float truck) {
		this.truck = truck;
	}
	public float getMotorCycle() {
		return motorCycle;
	}
	public void setMotorCycle(float motorCycle) {
		this.motorCycle = motorCycle;
	}
	
	
//	formula
	public float calculateRevenue (){
		return (carRate*car)+(truckRate*truck)+(motorCycleRate*motorCycle);
	}
	
	public float totalVehicles() {
		return car+truck+motorCycle;
	}


	@Override
	public String toString() {
		return "TollBoothRevenueManager [carRate=" + carRate + ", truckRate=" + truckRate + ", motorCycleRate="
				+ motorCycleRate + ", car=" + car + ", truck=" + truck + ", motorCycle=" + motorCycle + "]";
	}
	
}

class TollBoothRevenueManagerUtil {
	TollBoothRevenueManager tbrmu = new TollBoothRevenueManager();
	
	public void acceptRecord(Scanner sc) {
		
		//number of vehicles of each type
		System.out.print("No. of car passed: ");
		tbrmu.setCar(sc.nextFloat());	
		System.out.print("No. of truck passed: ");
		tbrmu.setTruck(sc.nextFloat());	
		System.out.print("No. of motorCycle passed: ");
		tbrmu.setMotorCycle(sc.nextFloat());	
		System.out.println();
		
		//set Rate of each type
		System.out.print("Rate of Car:  ");
		tbrmu.setCarRate(sc.nextFloat());	
		System.out.print("Rate of Truck:   ");
		tbrmu.setTruckRate(sc.nextFloat());
		System.out.print("Rate of Motor Cycle:   ");
		tbrmu.setMotorCycleRate(sc.nextFloat()); 
	}
		
	public void printRecord() {
		System.out.println("----------------------------------");
		System.out.println("Total number of vehicles: "+tbrmu.totalVehicles()+"\nTotale Revenue collected is: "+tbrmu.calculateRevenue());
	}
	public static int menuList(Scanner sc){
		System.out.println("0. Exit");
		System.out.println("1. acceptRecord.");
		System.out.println("2. printRecord.");
		System.out.println("Enter choice:    ");
		int choice = sc.nextInt();
		return choice;
	}
}


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TollBoothRevenueManagerUtil util = new TollBoothRevenueManagerUtil();
		int choice;
		while((choice = TollBoothRevenueManagerUtil.menuList(sc)) != 0) {
			switch(choice) {
			case 1:
				util.acceptRecord(sc);
				break;
			case 2:
				util.printRecord();
				break;
			}
		}
		sc.close();	
	}
}
