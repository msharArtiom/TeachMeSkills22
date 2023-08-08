import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static void main(String[] args) {

        String ipPatternString = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP-address: ");
        String address = scanner.nextLine();

        Pattern ipPattern = Pattern.compile(ipPatternString);
        boolean isValid = ipPattern.matcher(address).matches();

        if (isValid) {
            System.out.println("This address is valid - " + address);
        } else {
            System.out.println("This address is not valid - " + address);
        }
    }
}
