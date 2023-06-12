package homework8.figure;

class Main {
    public static void main(String[] args) {


        Figure[] figures = {
                new Circle(3.5),
                new Circle(6.9),
                new Circle(1.3),
                new Rectangle(4.4, 45),
                new Rectangle(7, 19),
                new Triangle(3, 8, 2),
                new Triangle(10, 6, 9)
        };

        double sumPerimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].perimeter());
            System.out.println(figures[i].square());
            sumPerimeter += figures[i].perimeter();
        }
        System.out.println("The sum of the perimeters is : " + sumPerimeter);
    }
}
