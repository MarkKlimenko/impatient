package systems.vostok.hybrid.onlyjava;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Track extends Car {
    private static Logger logger = LoggerFactory.getLogger(Car.class);

    Integer wheels = 18;
    String trailer;

    public Track(String model, Integer power, String trailer) {
        super(model, power);
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        logger.info("Drive my track: {}, {}, {}, {}", wheels, power, model, trailer);
    }
}
