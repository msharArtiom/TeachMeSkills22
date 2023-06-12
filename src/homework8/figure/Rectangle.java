package homework8.figure;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        System.out.print("The perimeter of the rectangle is: ");
        return 2 * (width + height);
    }

    @Override
    public double square() {
        System.out.print("The area of the rectangle is: ");
        return width * height;
    }
}
