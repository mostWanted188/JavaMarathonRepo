package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите через пробел значения а, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a + 1;
        while(i > a && i < b){
            if(i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }
}