package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Введите через пробел делимое и делитель: ");
            double divident = sc.nextDouble();
            double divider = sc.nextDouble();
            if(divider != 0){
            System.out.println(divident/divider);
            } else{
                break;
            }
        }
    }
}
