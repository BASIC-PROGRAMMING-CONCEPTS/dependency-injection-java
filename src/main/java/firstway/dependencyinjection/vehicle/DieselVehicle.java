package firstway.dependencyinjection.vehicle;

import firstway.dependencyinjection.common.Keys;
import firstway.dependencyinjection.engine.Engine;

public class DieselVehicle implements Vehicle{
    private Engine engine;

    public DieselVehicle(Engine engine){
        this.engine = engine;
    }

    public void start(String key) {
        if (key.equals(Keys.DIESEL_VEHICLE_KEY.toString())) {
            engine.start();
        } else {
            System.out.println("key is not matching");
        }
    }
}
