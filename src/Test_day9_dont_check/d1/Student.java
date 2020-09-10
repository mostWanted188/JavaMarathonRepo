package Test_day9_dont_check.d1;

public class Student extends Human{
    private String groupNum;
    private String name;

    public Student(String name, String nameStud, String  groupNum) {
        super(name);
        this.name = nameStud;
        this.groupNum = groupNum;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    @Override
    void printInfo() {
        System.out.println("Вывод для студента");
        super.printInfo();
        System.out.println("это студик с эминэм " + name);
    }
}
