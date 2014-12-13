package nl.erwin.car;

public class Jeep extends Car {
    private Integer towingHook;

    public Jeep(String door, String engine, Integer towingHook) {
        super(door, engine);
        this.towingHook = towingHook;
    }

    public Integer getTowingHook() {
        return towingHook;
    }
}
