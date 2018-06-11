package systems.vostok.hybrid.onlyjava;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Integer wheels = 4;
    public Integer power;
    public String model;

    public Car(String model, Integer power) {
        this.model = model;
        this.power = power;
    }

    public void drive() {
        logger.info("Drive my car: {}, {}, {}", wheels, power, model);
    }
}
