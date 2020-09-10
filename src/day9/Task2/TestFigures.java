package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green",10, 20, 30),
                new Triangle("Red",10, 25, 15),
                new Rectangle("Red",5, 10),
                new Rectangle("Orange",40, 15),
                new Circle( "Red",4),
                new Circle( "Red",10),
                new Circle("Blue",5)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
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

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red")) {
                sum = sum + f.area();
            }
        }
        return sum;
    }
}
