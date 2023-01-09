package firstway.dependencyinjection.injector;

import firstway.dependencyinjection.engine.ElectricEngine;
import firstway.dependencyinjection.vehicle.ElectricVehicle;
import firstway.dependencyinjection.vehicle.Vehicle;

public class ElectricVehicleInjector implements VehicleInjector {
    public Vehicle getVehicle() {
        return new ElectricVehicle(new ElectricEngine());
    }
}
