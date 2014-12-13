package nl.erwin.test.builder;

import nl.erwin.car.Jeep;

public class JeepBuilder extends CarBuilder<JeepBuilder> {
    private Integer towingHook = 2;

    public JeepBuilder withTowingHook(Integer towingHook) {
        this.towingHook = towingHook;
        return this;
    }

    public Jeep build(){
        return new Jeep(door, engine, towingHook);
    }
}
