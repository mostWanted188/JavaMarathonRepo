package day7.Task1;

public class Airplane {
    private String producer;
    private int yearMade;
    private double length;
    private int weight;
    private int fuelInTank = 0;

    Airplane(String producer, int length){
        this.producer = producer;
        this.length = length;
    }

    public static void planeLengthCompare(Airplane p1, Airplane p2) {
        if (p1.length > p2.length) {
            System.out.println("самолет 1 длиннее");
        } else if (p1.length < p2.length) {
            System.out.println("самолет 2 длиннее");
        } else System.out.println("самолеты одинаковы по длине");
    }
}