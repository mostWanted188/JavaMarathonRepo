package day6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(1967, "black","Shelby GT 500");
        Motorbike bike = new Motorbike(2020, "black", "R nineT Scramble");
        car.dasAuto();
        bike.dasMoto();
        System.out.println("авто_разница лет: " + car.difYears(100));
        System.out.println("мото_разница лет: " + bike.difYears(20));
    }
}
