package homework4;

import java.util.Scanner;

class AdditionalTask {
    public static void main(String[] args) {

        getFibonacciNumber();
        getSumContribution(scanner().nextFloat(), scanner().nextInt());
        getMultiplicationTable();
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
