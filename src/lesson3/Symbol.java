package lesson3;

import java.util.Scanner;

class Symbol {
    public static void main(String[] args) {

        getSymbol();
    }

    public static void getSymbol() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your symbol: ");
        char symbol = scanner.next().charAt(0);
        System.out.println(symbol + " - " + (int) symbol);
    }
}
