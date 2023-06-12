package homework8.figure;

public class Circle extends Figure {


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        System.out.print("The perimeter of the circle is: ");
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        System.out.print("The area of the circle is: ");
        return radius * Math.pow(Math.PI, 2);
    }


}
