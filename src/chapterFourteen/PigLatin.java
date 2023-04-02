package chapterFourteen;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String phrase = in.nextLine();
        String[] output = phrase.split(" \\s*");
        for (String s : output) {
            System.out.print(printLatin(s)+" ");
        }
    }

    private static String printLatin(String word){
        word = word.concat(String.valueOf(word.charAt(0)));
        word = word.substring(1);
        word = word.concat("ay");
        return word;
    }
}
