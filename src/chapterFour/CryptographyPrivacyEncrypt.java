package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class CryptographyPrivacyEncrypt {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter four digits");
        int digit=0;
        int[] digitArr= new int[4];

        for (int digitCount =0; digitCount <= digitArr.length-1; digitCount++){
            digit = entry.nextInt();

            digit = (digit + 7) % 10;

//            System.out.println(digit);

            digitArr[digitCount] = digit;

            System.out.printf("%s\t%s%n","Index", "Encrypted Value");

            System.out.printf("%d.%8d%n", (digitCount+1), digitArr[digitCount]);

        }

        System.out.println();

        int temp = digitArr[0];
        digitArr[0] = digitArr[2];
        digitArr[2] = temp;

        int temp1 = digitArr[1];
        digitArr[1] = digitArr[3];
        digitArr[3] =temp1;

        System.out.print("Encrypted four-digit integer: "+Arrays.toString(digitArr));

    }
}
