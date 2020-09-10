package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Игорь", "1");
        Teacher teacher = new Teacher("Константин", "философия");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getLesson());

        student.printInfo();
        teacher.printInfo();
    }
}
