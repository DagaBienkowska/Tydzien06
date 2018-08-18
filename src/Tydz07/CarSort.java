package Tydz07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarSort {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mazda", LocalDate.of(2008,4,8), new Car.Engine(120, 280)));
        cars.add(new Car("BMW", LocalDate.of(2007,2,10), new Car.Engine(100, 250)));
        cars.add(new Car("Ford", LocalDate.of(2012,7,1), new Car.Engine(120, 290)));
        cars.add(new Car("Fiat", LocalDate.of(2006,9,12), new Car.Engine(98, 240)));
        cars.add(new Car("Lancia", LocalDate.of(2008,4,8), new Car.Engine(115, 270)));
        cars.add(new Car("Mazda", LocalDate.of(2009,4,2), new Car.Engine(110, 275)));
        cars.add(new Car("Fiat", LocalDate.of(2009,2,1), new Car.Engine(112, 255)));
        cars.add(new Car("BMW", LocalDate.of(2011,2,4), new Car.Engine(130, 300)));

        List<Car> sortedByDate = sortedByDate(cars);
        System.out.println(sortedByDate);
        List<Car> sortedByHorsePower = sortedByHorsePower(cars);
        System.out.println(sortedByHorsePower);
        List<Car> sorted = sorted(cars);
        System.out.println(sorted);

    }

    public static List<Car> sortedByDate (List<Car> input){
        List<Car> sorted = input.stream()
                .sorted((o1, o2) -> o1.productionDate.compareTo(o2.productionDate))
                .collect(Collectors.toList());
        return sorted;
    }
    public static List<Car> sortedByHorsePower (List<Car> input){
        List<Car> sorted = input.stream()
                .sorted((o1, o2) -> o1.engine.horsePower - o2.engine.horsePower)
                .collect(Collectors.toList());
        return sorted;
    }
    public static List<Car> sorted (List<Car> input){
        List<Car> sorted = input.stream()
                .sorted((o1, o2) -> {
                    if (o1.productionDate.isEqual(o2.productionDate)){
                        if (o1.engine.horsePower == o2.engine.horsePower){
                            return o1.name.compareTo(o2.name);
                        }
                        return o1.engine.horsePower - o2.engine.horsePower;
                    } else {
                        return o1.productionDate.compareTo(o2.productionDate);
                    }
                })
                .collect(Collectors.toList());
        return sorted;
    }
}
