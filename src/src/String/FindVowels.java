package String;

import java.util.Locale;

public class FindVowels {
    public static void main(String[] args) {
        String word = "Hello World";

        String lowerCase = word.toLowerCase();


    }

    private static Boolean findAllVowers(String lowerCase) {
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < lowerCase.length(); i++) {
            if (vowels.contains(String.valueOf(lowerCase.charAt(i)))) {
                count++;
            }
        }

        if (count >= 2) {
            System.out.println("At least two vowels are present.");
            return true;
        } else {
            System.out.println("No two vowels are present.");
            return false;
        }
    }

}


