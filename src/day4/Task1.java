package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int countMore8 = 0;
        int countEqual1 = 0;
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int SumOfElements = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.print(" [" + numbers[i] + "] ");
        }
        System.out.println();
//больше 8
        System.out.println("Длина массива: " + numbers.length);
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 8) {
                countMore8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + countMore8);
//равное 1
        for (int i = 0; i < n; i++) {
            if (numbers[i] == 1) {
                countEqual1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + countEqual1);
//четные числа
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        System.out.println("Количество четных чисел: " + countEvenNumbers);
//нечетные числа
        //for(int i = 0; i < n; i++){
        //  if(numbers[i]%2 == 1){
        //    countOddNumbers ++; }
        countOddNumbers = numbers.length - countEvenNumbers;
        System.out.println("Количество нечетных чисел: " + countOddNumbers);
//сумма элементов
        for (int i = 0; i < numbers.length; i++){
            SumOfElements += numbers[i];
        }
        System.out.println("Сумма всех элементов массива: " + SumOfElements);
        }
    }

