package Q5;

class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine is starting.");	//start vehicle
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping.");	//stop vehicle
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {		//classs car extends vehicle (Car is a vehicle)
        System.out.println("Car engine is starting with a key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is stopping.");		//override methods for car
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is starting with a button.");
    }

    @Override
    public void stopEngine() {	//override-method	(Motorcycle is a vehicle)
        System.out.println("Motorcycle engine is stopping.");
    }
}

public class VehicleDemo2 {	//main class and method
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}