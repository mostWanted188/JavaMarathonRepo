package day12.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(5);
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("KIA");
        cars.add("Lada");
/*        for (String c : cars) {
            System.out.println(c);
        } */
        printCars(cars);

        cars.add(2, "Skoda");
        cars.remove(0);
        System.out.println();

        printCars(cars);
/*        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        } */
    }

    public static void printCars(List<String> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
