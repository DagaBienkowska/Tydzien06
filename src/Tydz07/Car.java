package Tydz07;

import java.time.LocalDate;

public class Car {
    String name;
    LocalDate productionDate;
    Engine engine;

    public Car(String name, LocalDate productionDate, Engine engine) {
        this.name = name;
        this.productionDate = productionDate;
        this.engine = engine;
    }



    public static class Engine {
        int horsePower;
        int maxSpeed;

        public Engine(int horsePower, int maxSpeed) {
            this.horsePower = horsePower;
            this.maxSpeed = maxSpeed;
        }

        @Override
        public String toString() {
            return
                    "horsePower=" + horsePower +
                    " maxSpeed=" + maxSpeed ;
        }
    }

    @Override
    public String toString() {
        return
                 name + " " + productionDate + " " + engine + "\n";
    }
}
