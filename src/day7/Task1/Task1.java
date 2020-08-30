package day7.Task1;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus", 34);
        Airplane plane2 = new Airplane("Boeing", 35);
        Airplane.planeLengthCompare(plane1, plane2);
        plane1.planeLengthCompare(plane1, plane2);
        }
    }
