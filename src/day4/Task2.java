package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10001);
        }
        int maxValue = numbers[0];
        int minValue = numbers[numbers.length-1];
//        System.out.println(Arrays.toString(numbers));
// наибольший элемент массива
        for (int x : numbers) {
            if (x > maxValue) {
                maxValue = x;
            }
        }
        System.out.println("Наибольший элемент массива: " + maxValue);
// наименьший элемент массива
        for (int x : numbers) {
            if (x < minValue) {
                minValue = x;
            }
        }
        System.out.println("Наименьший элемент массива: " + minValue);
// оканчивается на 0
// их сумма
        for (int x : numbers) {
            if (x%10 == 0) {
                count++;
                sum += x;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}