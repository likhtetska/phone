package vehicles;

import details.Engine;
import professions.Driver;

public class Main {

        public static void main(String[] args) {


            Driver lorryDriver = new Driver("Vania", 45,  "m", 10);
            Engine lorryEngine = new Engine(5000, "Tesla");
            Car Lorry = new Lorry("MAC", "J", 5000, lorryDriver , lorryEngine, 5000 );

            Driver sportDriver = new Driver("Nikita", 29,  "m", 3);
            Engine sportEngine = new Engine(300, "Tesla");
            Car SportCar = new SportCar("Tesla", "S", 100, sportDriver, sportEngine, 300);


        System.out.println(Lorry );
        System.out.println(SportCar);


    }




}
