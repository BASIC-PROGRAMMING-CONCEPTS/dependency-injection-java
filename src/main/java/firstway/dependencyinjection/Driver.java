package firstway.dependencyinjection;

import firstway.dependencyinjection.common.Keys;
import firstway.dependencyinjection.injector.DieselVehicleInjector;
import firstway.dependencyinjection.injector.ElectricVehicleInjector;
import firstway.dependencyinjection.injector.PetrolVehicleInjector;
import firstway.dependencyinjection.injector.VehicleInjector;
import firstway.dependencyinjection.vehicle.Vehicle;

public class Driver {
    public static void main(String[] args) {

        /*
         *For electric vehicles
         */
        VehicleInjector vehicleInjector = new ElectricVehicleInjector();
        Vehicle electricVehicle = vehicleInjector.getVehicle();
        electricVehicle.start(Keys.ELECTRIC_VEHICLE_KEY.toString());

        /*
         *For diesel vehicles
         */
        vehicleInjector = new DieselVehicleInjector();
        Vehicle dieselVehicle = vehicleInjector.getVehicle();
        dieselVehicle.start(Keys.DIESEL_VEHICLE_KEY.toString());

        /*
         *For petrol vehicles
         */
        vehicleInjector = new PetrolVehicleInjector();
        Vehicle petrolVehicle = vehicleInjector.getVehicle();
        petrolVehicle.start(Keys.PETROL_VEHICLE_KEY.toString());

    }
}
