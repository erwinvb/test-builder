package nl.erwin.test.builder;

import nl.erwin.car.Ferrari;
import nl.erwin.car.Jeep;
import org.junit.Test;

public class BuilderCastTest {

    @Test
    public void withDoorAndSpoiler_noCastNecessary() throws Exception {
        Ferrari ferrari = new FerrariBuilder().withDoor("door").withSpoiler("spoiler").build();
        Jeep jeep = new JeepBuilder().withDoor("door").withTowingHook(4).build();
    }

    @Test
    public void withEngineAndSpoiler_castNessesary() throws Exception {
        Ferrari ferrari = ((FerrariBuilder)new FerrariBuilder().withEngine("door")).withSpoiler("spoiler").build();
    }
}
