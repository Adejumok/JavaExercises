package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        int minimum = Integer.MIN_VALUE;
        int maximum= Integer.MAX_VALUE;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten (10) numbers: ");

        for (int numberCount = 1; numberCount <= 10 ; numberCount++){
            int number = input.nextInt();

            if (minimum < number){
                minimum =number;
            }

            if (maximum > number){
                maximum = number;
            }
        }
        System.out.println("Minimum: "+minimum);
        System.out.println("Maximum: "+maximum);

        int extremeSum = minimum + maximum;
        System.out.println("The sum of the minimum and maximum value is: " + extremeSum);
    }

}
