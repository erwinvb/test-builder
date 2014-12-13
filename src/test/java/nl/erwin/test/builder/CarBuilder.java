package nl.erwin.test.builder;

import nl.erwin.car.Car;

public abstract class CarBuilder<T extends CarBuilder>  {
    protected String door = "door";
    protected String engine = "engine";

    //With cast, no need to cast it everytime in your code
    public T withDoor(String door) {
        this.door = door;
        return (T)this;
    }

    //Without cast, it has to be cast in your code everytime
    public CarBuilder withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public abstract <F extends Car> F build();
}
