package homework10.tast1;

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

    public static void containsAbc(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Document number contains abc.");
        } else {
            System.out.println("Document number does not contain abc.");
        }
    }

    public static void startsWith555(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Document number starts with 555.");
        } else {
            System.out.println("Document number does not start with 555.");
        }
    }
    public static void endsWith1a2b(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Document number ends with 1a2b.");
        } else {
            System.out.println("Document number does not end with 1a2b.");
        }
    }
}
