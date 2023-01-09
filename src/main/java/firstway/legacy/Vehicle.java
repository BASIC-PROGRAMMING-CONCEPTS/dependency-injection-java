package firstway.legacy;

public class Vehicle {
    private static final String KEY = "KEY";
    private Engine engine = new Engine();

    public void start(String key) {
        if (key.equals(KEY)) {
            engine.start();
        } else {
            System.out.println("key is not matching");
        }
    }
}
