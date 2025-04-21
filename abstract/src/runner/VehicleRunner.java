package runner;

import com.example.external.Car;
import com.example.external.Bicycle;
import com.example.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bicycle();

        System.out.println("=== Car ===");
        vehicle1.type();
        vehicle1.fuelType();
        vehicle1.speed();
        vehicle1.usage();
        vehicle1.maintenance();

        System.out.println("\n=== Bicycle ===");
        vehicle2.type();
        vehicle2.fuelType();
        vehicle2.speed();
        vehicle2.usage();
        vehicle2.maintenance();
    }
}
