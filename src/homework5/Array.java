package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Array {
    public static void main(String[] args) {

        //System.out.print("Enter number to search: ");
        //System.out.println(findNumber(scanner().nextInt()));

        //System.out.print("Введите число ");
        //deleteNumberFromArray(scanner().nextInt());

        //System.out.print("Enter array length: ");
        //getMaxMinAverageValue(scanner().nextInt());

        //createTwoArray();

        //createTowArrayFromEvenNumbersFirst();

        //System.out.print("Enter array length: ");
        //replaceOddIndex(scanner().nextInt());

        //cortNameArray();
    }

    public static boolean findNumber(int number) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(40);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return true;
        }
        return false;
    }

    public static void deleteNumberFromArray(int number) {

        int[] arr = createArray(10);
        System.out.println("Source array " + Arrays.toString(arr));

        //Determining the length of a new array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }

        int[] newArray = new int[arr.length - count];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                newArray[i - n] = arr[i];
            } else n++;
        }

        if (count != 0) {
            System.out.println("New Array" + Arrays.toString(newArray));
        } else {
            System.out.println("The number " + number + " is not in the array: ");
        }
    }

    public static void getMaxMinAverageValue(int length) {

        int[] arr = createArray(length);
        System.out.println("Source array " + Arrays.toString(arr));

        Arrays.sort(arr);

        int minValue = arr[0];
        int maxValue = arr[arr.length - 1];
        double average = findAverageValue(arr);
        System.out.println("min = " + minValue + "\n"
                + "max = " + maxValue + "\n"
                + "averageValue = " + average);
    }

    public static void createTwoArray() {

        int[] firstArray = createArray(5);
        int[] secondArray = createArray(5);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        float averageFirst = findAverageValue(firstArray);
        float averageSecond = findAverageValue(secondArray);

        String str = (averageFirst > averageSecond) ? "averageFirst > averageSecond " :
                (averageFirst < averageSecond) ? " averageFirst < averageSecond" : "averageFirst = averageSecond";

        System.out.println(str);

    }

    public static void createTowArrayFromEvenNumbersFirst() {

        int length;
        do {
            System.out.print("Enter length of array: ");
            length = scanner().nextInt();
            if (!(length > 4 && length < 11)) {
                System.out.println("length does not satisfy the condition ");
            }
        } while (!(length > 4 && length < 11));

        int[] firstArray = createArray(length);
        System.out.println(Arrays.toString(firstArray));

        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                count++;
            }
        }

        int[] newArray = new int[firstArray.length - count];
        int n = 0;
        if (count > 0) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 == 0) {
                    newArray[i - n] = firstArray[i];
                } else n++;
            }
            System.out.println(Arrays.toString(newArray));
        } else System.out.println("There are no even numbers in the first array");

    }

    public static void replaceOddIndex(int length) {

        int[] arr = createArray(length);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void cortNameArray() {

        String[] name = {"Artiom", "Marina", "Valera", "Vlad", "Vitia", "Nikita"};
        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }

    public static int[] createArray(int length) {
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        return arr;
    }

    public static float findAverageValue(int[] arr) {
        float averageValue = 0;
        for (int array : arr) {
            averageValue += (float) array / arr.length;
        }
        return averageValue;
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
