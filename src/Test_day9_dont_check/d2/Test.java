package Test_day9_dont_check.d2;

public class Test {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 25, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (Figure f: figures) {
            if(f.getColor().equalsIgnoreCase("red")){
            sum = sum + f.perimeter();
        }
        }
        return sum;
    }
}

