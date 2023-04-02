package chapterFour;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CryptographyPrivacyDecrypt {
    public static void main(String[] args) {

        Scanner enc = new Scanner(System.in);
        System.out.println("Enter the encrypted four-digit");
        int[] endigit = new  int[4];

        for (int numberCount = 0; numberCount < endigit.length; numberCount++) {
            int number = enc.nextInt();
            endigit[numberCount] = number;
        }

        int temp= endigit[2];
        endigit[2] = endigit[0];
        endigit[0] = temp;

        int tempI = endigit[3];
        endigit[3] = endigit[1];
        endigit[1] = tempI;

        System.out.println((Arrays.toString(endigit)));

        for (int arrCount = 0; arrCount < endigit.length; arrCount++) {
            endigit[arrCount] = (endigit[arrCount] % 10 ) - 7;
            if (endigit[arrCount] < 0){
                endigit[arrCount] = endigit[arrCount] + 10;
            }
        }

        System.out.println((Arrays.toString(endigit)));
    }
}
