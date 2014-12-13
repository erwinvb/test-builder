package nl.erwin.car;

public class Ferrari extends Car {

    private String spoiler;

    public Ferrari(String door, String engine, String spoiler) {
        super(door, engine);
        this.spoiler = spoiler;
    }

    public String getSpoiler() {
        return spoiler;
    }
}
