package day7.Task1;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus", 34.5);
        Airplane plane2 = new Airplane("Boeing", 34.3);
        Airplane.planeLengthCompare(plane1, plane2);
        }
    }
