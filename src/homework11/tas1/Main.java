package homework11.tas1;

import java.io.IOException;

import static homework11.tas1.Document.*;
public class Main {

    public static void main(String[] args) {

        String documentNumber = "xxxx-yyy-xxxx-yyy-xyxy";

        //printFirstTwoBlocks(documentNumber);
        //printDocumentMasked(documentNumber);
        //printDocumentLetters(documentNumber);
        //printDocumentLettersUpper(documentNumber);


        try {
            containsAbc(documentNumber);
        }catch (MyExceptions e){
            e.printStackTrace();
        }
        try {
            startsWith555(documentNumber);
        }catch (StartNumberException e){
            e.printStackTrace();
        }

        try {
            endsWith1a2b(documentNumber);
        }catch (EndsWith1a2bException e){
            e.printStackTrace();
        }
    }

}
