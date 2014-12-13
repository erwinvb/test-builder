package nl.erwin.car;

public class Car {
    private String door;
    private String engine;

    public Car(String door, String engine) {
        this.door = door;
        this.engine = engine;
    }

    public String getDoor() {
        return door;
    }

    public String getEngine() {
        return engine;
    }

}
