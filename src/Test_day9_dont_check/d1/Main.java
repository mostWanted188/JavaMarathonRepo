package Test_day9_dont_check.d1;

public class Main {
    public static void main(String[] args) {
        Human man = new Human("Man");
        Student stud = new Student("Stud","Bob","junior");
        Teacher prep = new Teacher("Prep", "karate");
        System.out.println(stud.getGroupNum());
        System.out.println(prep.getLesson());
        man.printInfo();
        stud.printInfo();
        prep.printInfo();
    }
}
