package DAY1_SOLID.Liskov_Substitution_Principle;

import java.util.ArrayList;
import java.util.List;

// Liskov Substitution Principle states that: put only very generic methods into the parent class.
// wrong way

// class Vehicle{
//    public Integer getNumberofWheels(){
//        return 2;
//    }
//    public Boolean hasEngine(){
//        return true;
//    }
// }
// class Motorcycle extends Vehicle{}
//----------------------- Here this method returns null value as the hasEngine won't mean for bicycle
// class Bicycle extends Vehicle{
//    public Boolean hasEngine(){
//        return null;
//    }
// }

// right way
// This is the parent class which has very generic methods that can be used by all the child classes without any breakpoint.
class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle {
    public boolean hasEngine() {
        return true;
    }
}

class Bicycle extends Vehicle {
    public void blowRing() {
        System.out.println("Tring Tring..");
    }
}

class Car extends EngineVehicle {
    public boolean hasMusicSystem() {
        return true;
    }
}

class Motorcycle extends EngineVehicle {
    public void startEngine() {
        System.out.println("Engine Started...");
    }
}

public class Automobile {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bicycle());
        vehicles.add(new Car());
        vehicles.add(new Motorcycle());

        for (Vehicle vehicle : vehicles) {
                System.out.println("Has Engine: " + ((EngineVehicle) vehicle).hasEngine());
        }
    }
} 
