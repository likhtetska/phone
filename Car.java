package vehicles;

import details.Engine;
import professions.Driver;

public class Car {

    String nameCar;
    String classCar;
    int weightCar;
    Driver driver;
    Engine engine;

    public Car(String nameCar, String classCar, int weightCar, Driver driver, Engine engine) {
        this.nameCar=nameCar;
        this.classCar=classCar;
        this.weightCar=weightCar;
        this.driver=driver;
        this.engine=engine;
    }

    public String getNameCar() {
        return nameCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public int getWeightCar() {
        return weightCar;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }


    public void start() {
        System.out.println("Поїхали");
    }
    public void stop() {System.out.println("Зупиняємося");
    }
    public void turnRight() {System.out.println("Поворот направо");}
    public void turnLeft() {System.out.println("Поворот наліво");}

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weightCar=" + weightCar +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

}
