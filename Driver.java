package professions;

public class Driver extends Person{

       int drivingExperience;


    public Driver(String name, int age, String sex, int drivingExperience) {
        super(name, age, sex);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }


}
