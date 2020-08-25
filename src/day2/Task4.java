package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        System.out.print("Введите значение х: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = (x * x - 10)/(x + 7);
        double y1 = (x + 3)*(x * x - 2);
        if(x >= 5){
            System.out.printf("y = %.10f", y);
        } else if(x > -3 && x < 5){
            System.out.printf("y = %.10f", y1);
        } else{
            System.out.println(420);
        }
    }
}