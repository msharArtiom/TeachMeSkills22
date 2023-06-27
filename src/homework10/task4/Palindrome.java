package homework10.task4;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());

        String str = "mom skdf asdas ks falsfj dad";
        String[] arr = str.split(" ");
        if (number > arr.length) {
            throw new Exception("Incorrect data entered");
        }

        System.out.println(palindrome(arr[number - 1]));
    }

    public static boolean palindrome(String str) {

        if (str.contentEquals((new StringBuilder(str)).reverse())) {
            return true;
        }
        return false;
    }
}
