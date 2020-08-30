package day6.Task3;

import java.awt.*;

public class Teacher {
    private String secName;
    private String name;
    private String otch;
    private String lesson;

    Teacher(String secName, String name,String otch, String lesson){
        this.secName = secName;
        this.name = name;
        this.otch = otch;
        this.lesson = lesson;
    }

    void evaluateStudent(String student){
        int random = (int)(Math.random()*4 + 2);
        String mark = "";
        switch(random){
            case 2: mark = "неудовлетворительно";
                break;
            case 3: mark = "удовлетворительно";
                break;
            case 4: mark = "хорошо";
                break;
            case 5: mark = "отлично";
                break;
        }
        System.out.println("Преподаватель " + secName + " " + name + " " + otch + " оценил студента с именем " + student + " по предмету " + lesson + " на оценку " + mark);
    }
}
