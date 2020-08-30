package day6.Task2.Task2;

public class Task2 {
    public static void main(String[] args) {
    Airplane plane = new Airplane("Airbus", 1986, 37.57, 61000);
    Airplane planeShort = new Airplane("Boeing", 31.24);
    plane.info();
    plane.fillUp(2500);

    planeShort.setProducerAndLenght("Боинг",33.3);
    planeShort.fillUp(3000);
    planeShort.fillUp(7000);
    planeShort.info();
    }
}
