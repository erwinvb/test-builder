package nl.erwin.test.builder;

import nl.erwin.car.Ferrari;

public class FerrariBuilder extends CarBuilder<FerrariBuilder> {
    private String spoiler = "spoiler";

    public FerrariBuilder withSpoiler(String spoiler) {
        this.spoiler = spoiler;
        return this;
    }

    public Ferrari build(){
        return new Ferrari(door, engine, spoiler);
    }
}
