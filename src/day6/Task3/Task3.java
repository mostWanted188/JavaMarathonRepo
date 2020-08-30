package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
    Student stud1 = new Student("Филипп");
    Teacher teach1 = new Teacher("Петров", "Павел", "Геннадьевич", "Физмат");
    String studName = stud1.getFio();
    teach1.evaluateStudent(studName);
    }
}
