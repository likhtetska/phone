package vehicles;

import details.Engine;
import professions.Driver;

public class Lorry extends Car {
    int lift;

    public Lorry( String nameCar, String classCar, int weightCar, Driver driver, Engine engine, int lift) {
        super(nameCar, classCar, weightCar, driver, engine);
        this.lift = lift;

    }


    @Override
    public void start() {
        System.out.println(" вантажівка поїхала");
    }

    @Override
    public void stop() {
        System.out.println(" вантажівка зупинилася");
    }

    @Override
    public void turnRight() {
        System.out.println(" вантажівка вправо");
    }

    @Override
    public void turnLeft() {
        System.out.println(" вантажівка вліво");
    }

    @Override
    public String getNameCar() {
        return super.getNameCar();
    }

    @Override
    public String getClassCar() {
        return super.getClassCar();
    }

    @Override
    public int getWeightCar() {
        return super.getWeightCar();
    }

    @Override
    public Driver getDriver() {
        return super.getDriver();
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }
}
