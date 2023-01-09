package firstway.dependencyinjection.vehicle;

import firstway.dependencyinjection.common.Keys;
import firstway.dependencyinjection.engine.Engine;

public class PetrolVehicle implements Vehicle {
    Engine engine;

    public PetrolVehicle(Engine engine) {
        this.engine = engine;
    }

    public void start(String key) {
        if (key.equals(Keys.PETROL_VEHICLE_KEY.toString())) {
            engine.start();
        } else {
            System.out.println("key is not matching");
        }
    }
}
