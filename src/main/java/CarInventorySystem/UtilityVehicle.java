package CarInventorySystem;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo(String vehicleType) {
        System.out.println("\n--------" + vehicleType + "--------");
        return "VIN: " + getVinNumber() + "\nMake: " + getMake() + "\nModel: " + getModel() + "\nMileage: " + getMileage() + "\nFour Wheel Drive: " + this.fourWheelDrive;
    };
}
