package day5.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car mustang = new Car();
        mustang.setYear(1967);
        mustang.setColor("black");
        mustang.setModel("Shelby GT 500");

        System.out.println(mustang.getYear());
        System.out.println(mustang.getColor());
        System.out.println(mustang.getModel());
    }
}
