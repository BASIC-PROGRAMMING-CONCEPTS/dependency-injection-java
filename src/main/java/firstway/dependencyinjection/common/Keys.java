package firstway.dependencyinjection.common;

public enum Keys {
    /**
     * Key for petrol vehicles
     */
    PETROL_VEHICLE_KEY("PETROL_VEHICLE_KEY"),

    /**
     * Key for diesel vehicles
     */
    DIESEL_VEHICLE_KEY("DIESEL_VEHICLE_KEY"),

    /**
     * Key for electric vehicles
     */
    ELECTRIC_VEHICLE_KEY("ELECTRIC_VEHICLE_KEY");
    private String key;

    Keys(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
