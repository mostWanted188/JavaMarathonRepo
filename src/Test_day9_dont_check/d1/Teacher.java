package Test_day9_dont_check.d1;

public class Teacher extends Human{
    private String lesson;

    public Teacher(String name, String lesson) {
        super(name);
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    void printInfo() {
        System.out.println("Вывод для препода");
        super.printInfo();
        System.out.println("это препод с именем " + getName());
    }
}
