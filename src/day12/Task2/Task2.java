package day12.Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> digits= new ArrayList<>();
        for(int i = 0; i <= 30; i++){
            if(i % 2 == 0){
                digits.add(i);
            }
        }
        for(int i = 300; i <= 350; i++){
            if(i % 2 == 0){
                digits.add(i);
            }
        }
        for(Integer x : digits) {
            System.out.println(x);
        }
    }
}
