package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите через пробел значения а, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        do {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
        } while (a < b);
    }
}