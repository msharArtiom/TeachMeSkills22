package homework9;

import java.util.Random;
import java.util.Scanner;

public class Vector3D {

    public static final String DESCRIPTION = "This is a vector for a 3D coordinate system ";
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProduct(Vector3D vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    public Vector3D addition(Vector3D vector) {
        return new Vector3D(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    public Vector3D subtraction(Vector3D vector) {
        return new Vector3D(x - vector.getX(), y - vector.getY(), z - vector.getZ());
    }

    public static Vector3D[] generateRandomVectors(int n) {
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            double x = random().nextInt(-10, 10);
            double y = random().nextInt(-10, 10);
            double z = random().nextInt(-10, 10);
            Vector3D vector = new Vector3D(x, y, z);
            vectors[i] = vector;
        }
        return vectors;
    }

    public String toString() {
        return DESCRIPTION + ":  " + x + ", " + y + ", " + z + ")";
    }

    public boolean equals(Vector3D vector) {
        return (this.x == vector.getX() && this.y == vector.getY() && this.z == vector.getZ());
    }

    public static Random random() {
        return new Random();
    }
}