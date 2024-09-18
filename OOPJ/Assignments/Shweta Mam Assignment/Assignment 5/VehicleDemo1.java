class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getDetails() {
        return "Make: " + make + ", Year: " + year;
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Model: " + model;
    }
}

public class VehicleDemo1 {
    public static void main(String[] args) {
        Car car = new Car("Bullet", 2023, "ARK Version");
        System.out.println(car.getDetails());
    }
}