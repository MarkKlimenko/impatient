package systems.vostok.hybrid.onlyjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    static private Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        //driveCar();
        driveMyTrack();
    }

    private static void driveCar() {
        new Car("Toyota", 100).drive();
    }

    private static void driveMyTrack() {
       Car myTrack = new Track("Freightliner", 500, "6000pound");

        myTrack.drive();

        logger.info("{}", myTrack.wheels);
    }
}
