package homework10.task4;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());

        String str = "mom skdf asdas ks falsfj dad";
        String[] arr = str.split(" ");

        try {
            System.out.println(palindrome(arr[number - 1]));
        }catch (ArrayIndexOutOfBoundsException e) {
            if (number > arr.length) {
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
    }

    public static boolean palindrome(String str) {

        if (str.contentEquals((new StringBuilder(str)).reverse())) {
            return true;
        }
        return false;
    }
}
