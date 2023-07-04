package homework12.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileMain {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.print("Enter the file name: ");
        File path = new File("src/homework12/task2/" + scanner().nextLine());
        File validNumber = new File("src/homework12/task2/validNumber.txt");
        File notValidNumber = new File("src/homework12/task2/notValidNumber.txt");

        try {
            Scanner documentScanner = new Scanner(path);
            String firstLine = documentScanner.nextLine();
            FileWriter valid = new FileWriter(validNumber);
            FileWriter notValid = new FileWriter(notValidNumber);

            if (firstLine.length() == 15 && firstLine.startsWith("docnum")
                    || firstLine.startsWith("contract")) {
                valid.append(firstLine + "\n");
            }else notValid.append(firstLine + " - Does not start with \"contract\" or \"docnum\" " +
                    "and the length is not 15 but "+firstLine.length() + "\n");

            while (documentScanner.hasNext()) {
                String str = documentScanner.nextLine();
                if (str.length() == 15 && str.startsWith("docnum")
                        || str.startsWith("contract")) {
                    valid.append(str + "\n");
                }else notValid.append(str + " - Does not start with \"contract\" or \"docnum\" " +
                        "and the length is not 15 but "+firstLine.length() + "\n");
            }

            valid.close();
            notValid.close();
            documentScanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
