package Test_day9_dont_check.d2;

public class Triangle extends Figure{
    private double l1;
    private double l2;
    private double l3;
    double h = (l1+l2+l3)/2;

    public Triangle(String color, double l1, double l2, double l3) {
        super(color);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double area() {
       return Math.sqrt(h * (h-l1) * (h-l2) * (h-l3));
    }

    @Override
    public double perimeter() {
        return l1 + l2 + l3;
    }
}
