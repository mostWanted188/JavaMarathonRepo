package Test_day9_dont_check.d1;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printInfo(){
        System.out.println("Вывод для чела");
        System.out.println("это челик с эминэм " + name);
    }
}
