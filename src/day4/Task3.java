package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args){
        int[][] numbers = new int[12][8];
                for(int i = 0; i < numbers.length; i++){
                    for(int j = 0; j < numbers[i].length; j++){
                        numbers[i][j] = (int) (Math.random() * 51);
                        //System.out.print(numbers[i][j] + " ");
                    } //System.out.println();
                }

        int sumMax = 0;
        int indexMax = 0;
        for(int i = 0; i < numbers.length; i++){
            int sum = 0;
            for(int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
                if(sum >= sumMax){
                    sumMax = sum;
                    indexMax = i;
                }
            }
        }  System.out.println("Индекс строки с максимальной суммой элементов: " + indexMax);

        /* konec zadaniR
        System.out.println("--------------------------------------------------------------------");

// ymnozhenie strok - OK
        int multiply = 0;
        int numStrMax = 0;
        for(int i = 0; i < numbers.length; i++){
            int multiplyMax = 1;
            for(int j = 0; j < numbers[i].length; j++) {
                multiplyMax = multiplyMax * numbers[i][j];
                if(multiplyMax > multiply){
                    multiply = multiplyMax;
                    numStrMax = i + 1;
                }
            }System.out.println("ymnozhenie strok: " + multiplyMax);
        }System.out.println("Наибольший результат умножения в " + numStrMax + "-й строке: " + multiply);

// ras4et summi po strokam - OK
// vivod stroki s min summoj
        int sumM = 0;
        int sumMin = 100000;
        int indexMin = 0;
        for(int i = 0; i < numbers.length; i++){
            int sum = 0;
            for(int j = 0; j < numbers[i].length; j++){
                sum = sum + numbers[i][j];
                sumM = sum;
                if (sum < sumMin) {
                    sumMin = sum;
                    indexMin = i + 1;
                }
            }System.out.println("summa strok: " + sumM);
        }System.out.println("Строка с минимальной суммой элементов: " + indexMin);
*/

    }
}