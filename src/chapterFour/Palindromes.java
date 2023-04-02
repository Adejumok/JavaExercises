package chapterFour;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        String number= input.nextLine();

        String reversed= "";

        while (number.length() != 5) {
            System.out.println("This number is not  five digits");
            System.out.print("Enter a five digit number: ");
            number= input.nextLine();
        }

        for (int i =number.length() - 1; i >= 0 ; i--){
            reversed += number.charAt(i);
        }

        if (number.equals(reversed)){
            System.out.println("It is a palindrome.");
        }
        else System.out.println("It is not a palindrome.");
    }
}
