package day7.Task1;

public class Airplane {
    private String producer;
    private int yearMade;
    private double length;
    private int weight;
    private int fuelInTank = 0;

    Airplane(String producer, double length){
        this.producer = producer;
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public String getProducer() {
        return producer;
    }

    public static void planeLengthCompare(Airplane p1, Airplane p2) {
        if (p1.getLength() > p2.getLength()) {
            System.out.println(p1.getProducer() + " длиннее, чем " +  p2.getProducer());
        } else if (p1.getLength() < p2.getLength()) {
            System.out.println(p2.getProducer() + " длиннее, чем " + p1.getProducer());
        } else System.out.println("самолеты одинаковы по длине");
    }
}