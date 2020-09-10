package Test_day9_dont_check.d2;

public class Circle extends Figure {
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

}
