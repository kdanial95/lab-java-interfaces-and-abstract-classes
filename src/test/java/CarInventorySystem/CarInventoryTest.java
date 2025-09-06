package CarInventorySystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInventoryTest {
    private Sedan sedan;
    private Truck truck;
    private UtilityVehicle utilityVehicle;

    @BeforeEach
    void setUp() {
        sedan = new Sedan("123456789", "Ford", "Focus", 10000);
        truck = new Truck("123456789", "Ford", "Focus", 10000, 1000);
        utilityVehicle = new UtilityVehicle("123456789", "Ford", "Focus", 10000, true);
    }

    @Test
    void name() {
        assertEquals(true, sedan.getInfo("Sedan Info").contains("VIN: 123456789"));
        assertEquals(true, truck.getInfo("Truck Info").contains("Towing Capacity: 1000.0"));
        assertEquals(true, utilityVehicle.getInfo("Utility Vehicle Info").contains("Four Wheel Drive: true"));
    }
}