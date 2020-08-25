package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество этажей: ");
        int floor = sc.nextInt();
        if(floor <= 0) {
            System.out.println("Введено некорректное значение");
        } else if(floor > 0 && floor <= 4){
            System.out.println("Малоэтажный дом");
        } else if(floor >= 5 && floor <= 8){
            System.out.println("Среднеэтажный дом");
        } else{
            System.out.println("Многоэтажный дом");
        }
    }
}