package homework11.tas1;

import java.io.IOException;

public class Document {

    public static void printFirstTwoBlocks(String documentNumber) {
        System.out.print(documentNumber.substring(0, 4));
        System.out.println(documentNumber.substring(9, 13));
    }

    public static void printDocumentMasked(String documentNumber) {
        String text = documentNumber;
        String[] arr = text.split("-");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 3) {
                arr[i] = "***";
            }
        }
        String docNumber = String.join("-", arr);
        System.out.println(docNumber);
    }

    public static void printDocumentLetters(String documentNumber) {
        String[] parts = documentNumber.split("-");
        String result = parts[1].toLowerCase() + "/" + parts[3].toLowerCase() + "/" + parts[4].toLowerCase().charAt(1)
                + "/" + parts[4].toLowerCase().charAt(3);
        System.out.println(result);
    }

    public static void printDocumentLettersUpper(String documentNumber) {
        StringBuilder result = new StringBuilder("Letters:");
        String[] parts = documentNumber.split("-");
        String str = parts[1] + "/" + parts[3] + "/" + parts[4].charAt(1)
                + "/" + parts[4].charAt(3);
        String srt = result + str;
        System.out.println(srt.toUpperCase());
    }

    public static void containsAbc(String documentNumber) throws MyExceptions{

            if (documentNumber.toLowerCase().contains("abc")){
                System.out.println("Document number contains abc");
            } else{
                throw new MyExceptions("Document does not number contains abc: "+ documentNumber);
            }
    }

    public static void startsWith555(String documentNumber) throws StartNumberException{
        if (documentNumber.startsWith("555")) {
            System.out.println("Document number starts with 555.");
        } else {
            throw new StartNumberException("Document number does not start with 555: " + documentNumber);
        }
    }
    public static void endsWith1a2b(String documentNumber) throws EndsWith1a2bException{
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Document number ends with 1a2b.");
        } else {
            throw new EndsWith1a2bException("Document number does not end with 1a2b: " + documentNumber);
        }
    }
}
