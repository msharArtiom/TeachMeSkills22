package homework8.figure;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        System.out.print("The perimeter of the triangle is: ");
        return a + b + c;
    }

    @Override
    public double square() {
        System.out.print("The area of the triangle is: ");
        double p = perimeter() * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
