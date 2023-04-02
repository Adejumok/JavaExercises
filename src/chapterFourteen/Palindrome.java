package chapterFourteen;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = in.next();
        System.out.println(checkPalindrome(word));
    }

    private static boolean checkPalindrome(String word){
        String original = "";
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            original = original.concat(String.valueOf(word.charAt(i)));
        }

        for (int j = word.length()-1; j >= 0 ; j--) {
            reverse = reverse.concat(String.valueOf(word.charAt(j)));
        }

        return original.equals(reverse);
    }
}
