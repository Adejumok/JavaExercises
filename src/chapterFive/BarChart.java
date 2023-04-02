package chapterFive;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter five integers between 1 and 30");

        int reads = 5;
        int[] numbers = new int[reads];

        for (int integerCount =0; integerCount < reads; integerCount ++) {
            int integer = read.nextInt();
            numbers[integerCount] = integer;
        }

        for (int count = 0; count<reads; count++){
            for (int inCount = 0; inCount < numbers[count]; inCount++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
