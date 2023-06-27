package homework10.task3;

public class LongStr {

    public static void main(String[] args) {

        String string = "Do you have rude and moody teenage children living in your house? " +
                "Have you ever secretly wanted to throw them out? A Spanish couple, Mr and Mrs" +
                " Serrano, from Zaragoza in Spain, have done exactly that.";
        String[] words = string.split("\s+");

        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }

        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("The shortest word: " + shortestWord);
        System.out.println("The longest word: " + longestWord);
    }
}
