package homework4;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {

        //Task 1
        getNotEvenNumber();
        //Task 2
        getNumberDescending();
        //Task 3
        System.out.print("Enter your number: ");
        System.out.println("The sum of the numbers is " + getSumOfNumbers(scanner().nextInt()));
        //Task 4
        getSubsequence();
        //Task 5
        System.out.print("Enter the number of first numbers in the sequence: ");
        getDescendingSequence(scanner().nextInt());
        //Task 6
        getSquareNumber();

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

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
