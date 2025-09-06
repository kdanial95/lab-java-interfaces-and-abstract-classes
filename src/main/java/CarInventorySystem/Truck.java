package CarInventorySystem;

public  class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo(String vehicleType) {
        System.out.println("\n--------" + vehicleType + "--------");
        return "VIN: " + getVinNumber() + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nMileage: " + getMileage() + "\nTowing Capacity: " + this.towingCapacity;
    };
}
