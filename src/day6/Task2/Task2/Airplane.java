package day6.Task2.Task2;

public class Airplane {
    private String producer;
    private int yearMade;
    private double length;
    private int weight;
    private int fuelInTank = 0;

    public void info() {
        if(yearMade == 0 && weight == 0){
            System.out.println("Изготовитель: " + producer + ", длина: " + length + ", объем топлива в баке: " + fuelInTank);
                } else {
            System.out.println("Изготовитель: " + producer + ", год выпуска: " + yearMade + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuelInTank);
        }
    }

/*    public void infoShort() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + yearMade + ", длина: " + length);
    }*/

    public void fillUp(int fuelQty) {
        fuelInTank += fuelQty;
        /*System.out.println("теперь топлива: " + fuelInTank);*/
    }

    Airplane(String producer, int yearMade, double length, int weight) {
        this.producer = producer;
        this.yearMade = yearMade;
        this.length = length;
        this.weight = weight;
        }

    public void setProducerAndLenght(String producer, double length){
        this.producer = producer;
        this.length = length;
    }

    Airplane(String producer, double length){
        this.producer = producer;
        this.length = length;
        }
    }