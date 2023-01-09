package firstway.dependencyinjection.injector;

import firstway.dependencyinjection.engine.DieselEngine;
import firstway.dependencyinjection.vehicle.DieselVehicle;
import firstway.dependencyinjection.vehicle.Vehicle;

public class DieselVehicleInjector implements VehicleInjector {
    public Vehicle getVehicle() {
        return new DieselVehicle(new DieselEngine());
    }
}
