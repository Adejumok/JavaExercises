package chapterFourteen;

import java.util.Scanner;

public class Token {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = in.nextLine();
        String[] tokens = text.split(" ");
        for (String token: tokens){
            if (Character.isUpperCase(token.charAt(0))){
                System.out.println(token);
            }
        }
    }
}
