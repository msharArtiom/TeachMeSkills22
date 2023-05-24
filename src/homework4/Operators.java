package homework4;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //Task 1
        System.out.print("Enter a month: ");
        System.out.println(getSeason(scanner().nextInt()));
        //Task 2
        System.out.print("Enter a month: ");
        getSeasonWithIf(scanner().nextInt());
        //Task 3
        System.out.print("Enter number : ");
        checkNumber(scanner().nextInt());
        //Task 4
        System.out.print("Enter temperature: ");
        getTemperature(scanner().nextInt());
        //Task 5
        System.out.print("Enter color number: ");
        System.out.println(getColor(scanner().nextInt()));
        //Task 1
        getNotEvenNumber();
        System.out.println();
        //Task 2
        getNumberDescending();
        System.out.println();
        //Task 3
        System.out.print("Enter your number: ");
        System.out.println("The sum of the numbers is " + getSumOfNumbers(scanner().nextInt()));
        System.out.println();
        //Task 4
        getSubsequence();
        System.out.println();
        //Task 5
        System.out.print("Enter the number of first numbers in the sequence: ");
        getDescendingSequence(scanner().nextInt());
        System.out.println();
        //Task 6
        getSquareNumber();
        System.out.println();
        // Task **
        System.out.print("This is Fibonacci number : ");
        getFibonacciNumber();
        System.out.println("Enter your deposit and number of months: ");
        getSumContribution(scanner().nextFloat(), scanner().nextInt());
        System.out.println();
        getMultiplicationTable();
    }

    public static String getSeason(int month) {

        switch (month) {
            case 12, 1, 2:
                return "This is Winter";
            case 3, 4, 5:
                return "This is Spring ";
            case 6, 7, 8:
                return "This is Summer ";
            case 9, 10, 11:
                return "This is Autumn";
            default:
                return "There are 12 months in a year, not " + month;
        }
    }

    public static void getSeasonWithIf(int month) {

        if (month == 12 || month == 1 || month == 2)
            System.out.println("This is Winter");
        else if ((month == 3 || month == 4 || month == 5))
            System.out.println("This is Spring");
        else if ((month == 6 || month == 7 || month == 8))
            System.out.println("This is Summer");
        else if ((month == 9 || month == 10 || month == 11))
            System.out.println("This is Autumn");
        else System.out.println("There are 12 months in a year, not " + month);
    }

    public static void checkNumber(int number) {
        if (number % 2 == 0)
            System.out.println(number + " - it is even number ");
        else System.out.println(number + " - it is not even number ");
    }

    public static void getTemperature(int temperature) {

        if (temperature > -5)
            System.out.println("Warm");
        else if (temperature > -20)
            System.out.println("Normally");
        else System.out.println("coldly");
    }

    public static String getColor(int numberColor) {

        switch (numberColor) {
            case 1:
                return "This is red ";
            case 2:
                return "This is orange ";
            case 3:
                return "This is yellow";
            case 4:
                return "This is green ";
            case 5:
                return "This is blue ";
            case 6:
                return "This is indigo";
            case 7:
                return "This is violet";
            default:
                return "The rainbow has 7 colors, not " + numberColor;
        }
    }
    public static void getNotEvenNumber() {

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }

    public static void getNumberDescending() {

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static int getSumOfNumbers(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void getSubsequence() {
        int i = 7;
        while (i < 100) {
            System.out.print(i + " ");
            i += 7;
        }
    }

    public static void getDescendingSequence(int number) {
        int sequence = 0;
        for (int i = 0; i < number; i++) {
            System.out.print(sequence + " ");
            sequence -= 5;
        }
    }

    public static void getSquareNumber() {
        for (int i = 10; i <= 20; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
    }

    public static void getFibonacciNumber() {

        int number1 = 0;
        int number2 = 0;

        for (int i = 2; i <= 11; i++) {
            if (number1 == 0) {
                System.out.print(number1 + " ");
                number2 += 1;
            } else if (number2 == 1) System.out.print(number2 + " ");

            int number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
    }

    public static void getSumContribution(float contribution, int month) {

        float count = contribution;
        for (int i = 0; i < month; i++) {
            count += ((contribution * 7) / 100);
        }
        System.out.println(count);
    }

    public static void getMultiplicationTable() {

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
