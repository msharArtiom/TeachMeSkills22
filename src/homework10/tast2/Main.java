package homework10.tast2;

public class Main {

    public static void main(String[] args) {
        addSymbol("Hello");
    }

    public static void addSymbol(String s) {
        String text = "";
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            text += "" + symbol + symbol;
        }
        System.out.println(text);
    }
}
