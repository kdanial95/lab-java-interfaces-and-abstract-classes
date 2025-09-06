package CarInventorySystem;

/**
 * Suppose you are building a car inventory system. All cars have a vinNumber, make, model and mileage. But no car is just a car. Each car is either a Sedan, a UtilityVehicle or a Truck.
 * Create an abstract class named Car and define the following properties and behaviors:
 * vinNumber: a String representing the VIN number of the car
 * make: a String representing the make of the car
 * model: a String representing the model of the car
 * mileage: an int representing the mileage of the car
 * getInfo(): a method that returns a String containing all of the car's properties in a readable format
 * Create three classes that extend Car: Sedan, UtilityVehicle and Truck.
 * UtilityVehicle objects should have an additional fourWheelDrive property, a boolean that represents whether the vehicle has four-wheel drive.
 * Truck objects should have an additional towingCapacity property, a double that represents the towing capacity of the truck.
 */

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("123456789", "Ford", "Focus", 10000);
        System.out.println(sedan.getInfo("Sedan Info"));

        Car utilityVehicle = new UtilityVehicle("987654321", "Toyota", "Corolla", 10000, true);
        System.out.println(utilityVehicle.getInfo("Utility Vehicle Info"));

        Car truck = new Truck("012345678", "Chevrolet", "Camaro", 10000, 1000);
        System.out.println(truck.getInfo("Truck Info"));
    }
}
