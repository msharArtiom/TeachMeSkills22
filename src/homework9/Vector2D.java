package homework9;

import java.util.Random;

public class Vector2D {

    private double x;
    private double y;

    static final String DESCRIPTION = "This is a vector for a 2D coordinate system";

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double dotProduct(Vector2D vector) {
        return x * vector.getX() + y * vector.getY();
    }

    public Vector2D addition(Vector2D vector) {
        return new Vector2D(x + vector.getX(), y + vector.getY());
    }

    public Vector2D subtraction(Vector2D vector) {
        return new Vector2D(x - vector.getX(), y - vector.getY());
    }

    public static Vector2D[] generateRandomVectors(int n) {
        Vector2D[] vectors = new Vector2D[n];
        for (int i = 0; i < n; i++) {
            double x = random().nextInt(-10, 10);
            double y = random().nextInt(-10, 10);
            Vector2D vector = new Vector2D(x, y);
            vectors[i] = vector;
        }
        return vectors;
    }

    public String toString() {
        return DESCRIPTION + ":  " + x + ", " + y + ")";
    }

    public boolean equals(Vector2D vector) {
        return (this.x == vector.getX() && this.y == vector.getY());
    }

    public static Random random() {
        return new Random();
    }
}
