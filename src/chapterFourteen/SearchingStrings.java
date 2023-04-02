package chapterFourteen;

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = in.nextLine();
        System.out.print("Enter the character: ");
        String chr = in.next();
        System.out.println(charFrequency(text, chr));
    }

    private static int charFrequency(String text, String chr){
        int charFreq = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i==text.indexOf(chr, i)){
                charFreq += 1;
            }
        }
        return charFreq;
    }
}
