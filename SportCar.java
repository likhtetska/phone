package vehicles;

import details.Engine;
import professions.Driver;

public class SportCar extends Car{
    int speed;

    public SportCar (String nameCar, String classCar, int weightCar, Driver driver, Engine engine, int speed) {
        super(nameCar, classCar, weightCar, driver, engine);
        this.speed = speed;
    }


    @Override
    public void start() {
        System.out.println(" швидко поїхали");
    }

    @Override
    public void stop() {
        System.out.println(" швидко зупинилися");
    }

    @Override
    public void turnRight() {
         System.out.println(" швидко вправо");
    }

    @Override
    public void turnLeft() {
        System.out.println(" швидко вліво");
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
