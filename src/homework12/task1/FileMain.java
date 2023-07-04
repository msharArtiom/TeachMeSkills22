package homework12.task1;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

class FileMain {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.print("Enter the file name: ");
        File path = new File("src/homework12/task1/" + scanner().nextLine());

        try {
            Scanner documentScanner = new Scanner(path);
            String firstLine = documentScanner.nextLine();

            if (firstLine.length() == 15 && firstLine.startsWith("docnum")
                    || firstLine.startsWith("contract")) {
                System.out.println(firstLine);
            }

            while (documentScanner.hasNext()) {
                String str = documentScanner.nextLine();
                if (str.length() == 15 && str.startsWith("docnum")
                        || str.startsWith("contract")) {
                    System.out.println(str);
                }
            }

            documentScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
