package homework10.tast1;

import static homework10.tast1.Document.*;

class Main {

    public static void main(String[] args) {

        String documentNumber = "xxxx-abc-xxxx-yyy-xyxy";

        printFirstTwoBlocks(documentNumber);
        printDocumentMasked(documentNumber);
        printDocumentLetters(documentNumber);
        printDocumentLettersUpper(documentNumber);
        containsAbc(documentNumber);
        startsWith555(documentNumber);
        endsWith1a2b(documentNumber);
    }
}
