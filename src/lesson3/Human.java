package lesson3;

import java.util.Scanner;

class Human {
    public static void main(String[] args) {

        getDataHuman();
    }
    public static void getDataHuman() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Name: " + name + "\n"
                + "Surname: " + surname + "\n"
                + "Age: " + age + "\n"
                + "Height: " + height + "\n"
                + "Weight: " + weight + "\n");
    }
}
