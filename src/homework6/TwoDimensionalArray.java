package homework6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {

    public static void main(String[] args) {

        //System.out.println("Enter your number: ");
        //getArray(scanner().nextInt());

        //createChessBoard();

        //multiplyMatrices();

        //getSumArray();

        //getDiagonalsArray();

        //sortArray();
    }


    public static void getArray(int number) {

        Random random = new Random();
        int[][][] arr = new int[5][5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = random.nextInt(-11, 11);
                }
            }
        }

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i][j][k] += number;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void createChessBoard() {

        char[][] arr = new char[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = 'W';
                } else arr[i][j] = 'B';
            }

        }
        printArray(arr);
    }

    public static void multiplyMatrices() {

        int[][] arr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] result = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }

    public static void getSumArray() {

        Random random = new Random();
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(11);
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        printArray(arr);
        System.out.println("The sum of the array is: " + sum);
    }

    public static void getDiagonalsArray() {

        Random random = new Random();
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(11);
            }
        }

        printArray(arr);

        int[] firstDiagonals = new int[arr[0].length];
        int[] secondDiagonals = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    firstDiagonals[i] = arr[i][j];
                } else if ((i + j) == arr.length - 1) {
                    secondDiagonals[i] = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(firstDiagonals));
        System.out.println(Arrays.toString(secondDiagonals));
    }


    public static void sortArray() {

        int[][] arr = {
                {
                        1, 44, 5, 2, 2
                },
                {
                        1, 2, 7, 1, 2, 8
                },
                {
                        9, 2, 5, 1, 7, 90, 2
                },
                {
                        7, 2, 5, 3
                }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Arrays.sort(arr[i]);
            }
        }
        printArray(arr);

    }


    public static void printArray(int[][] arr) {

        for (int[] out : arr) {
            for (int in : out) {
                System.out.print(in + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(char[][] arr) {

        for (char[] out : arr) {
            for (char in : out) {
                System.out.print(in + "\t");
            }
            System.out.println();
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
