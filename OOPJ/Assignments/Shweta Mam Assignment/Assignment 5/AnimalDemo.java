class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;		//member field function
    }

    public void eat() {
        System.out.println(name + " is eating.");	//function-properties of an animal
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {	//class dog in inherited in animal
        super(name);
    }

    public void bark() {
        System.out.println("Dog is barking.");	//dog own property
    }
}

public class AnimalDemo {	//main class-method
    public static void main(String[] args) {
        Animal animal = new Animal("Tiger");	//animal instance
        animal.eat();
        animal.sleep();

        Dog dog = new Dog("Rocky");	//dog instance
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}