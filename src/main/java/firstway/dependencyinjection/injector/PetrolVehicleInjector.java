package firstway.dependencyinjection.injector;

import firstway.dependencyinjection.engine.PetrolEngine;
import firstway.dependencyinjection.vehicle.PetrolVehicle;
import firstway.dependencyinjection.vehicle.Vehicle;

public class PetrolVehicleInjector implements VehicleInjector {
    public Vehicle getVehicle() {
        return new PetrolVehicle(new PetrolEngine());
    }
}
