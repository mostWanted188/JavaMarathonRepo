package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        /*int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(numbers));*/

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10001);
        }
        int sumMax = 0;
        int index = 0;
        for(int i = 0; i < numbers.length-2; i++){
            int sum = 0;
            for(int j = i; j < i + 3; j++){
                sum = sum + numbers[j];
                if(sumMax < sum){
                    sumMax = sum;
                    index = i;
                }
            }
        }
        System.out.println(sumMax);
        System.out.println(index);
    }
}
