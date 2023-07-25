package homework13;

import java.io.*;
import java.util.*;
public class MyMain {
    public static void main(String[] args) {

        File report = new File("src/homework13/report.txt");
        boolean flag = true;

        List<String> files = new ArrayList<>();
        Set<String> docNumber = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        while (flag) {
            System.out.print("Enter the file name: ");
            var str = scanner().nextLine();
            if (str.equals("0")) {
                flag = false;
            } else {
                files.add(str);
            }
        }

        for (int i = 0; i < files.size(); i++) {
            File path = new File(files.get(i));
            try {
                Scanner documentScanner = new Scanner(path);
                docNumber.add(documentScanner.nextLine());
                while (documentScanner.hasNext()) {
                    docNumber.add(documentScanner.nextLine());
                }
                documentScanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (String num : docNumber) {
            if (num.length() == 15 && (num.startsWith("docnum")
                    || num.startsWith("contract"))) {
                map.put(num, "Valid");
            } else if (num.length() != 15) {
                map.put(num, "length is not 15");
            } else if (!num.startsWith("docnum") || !num.startsWith("contract")) {
                map.put(num, "Does not start with docnum or contract");
            }
        }

        try {
            FileWriter writeReport = new FileWriter(report);
            for (Map.Entry<String, String> m : map.entrySet()) {
                writeReport.append(m.getKey() + " - " + m.getValue() + "\n");
            }
            writeReport.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
