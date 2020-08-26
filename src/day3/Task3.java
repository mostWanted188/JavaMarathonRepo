package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Введите через пробел делимое и делитель: ");
            double divident = sc.nextDouble();
            double divider = sc.nextDouble();
            System.out.println(divident/divident);
            if(divider == 0) {
                System.out.println("Деление на 0");
                i = 0;
                }
        }
    }
}
