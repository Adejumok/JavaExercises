package chapterFourteen;

import java.util.Scanner;

public class StringPortionComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String one = input.nextLine();
        System.out.print("Enter the second string: ");
        String two = input.nextLine();
        if (one.regionMatches(true, 0, two, 0, 4)){
            System.out.println("These inputs are equal with case ignored.");
        }else System.out.println("These inputs aren't equal.");
    }

}
