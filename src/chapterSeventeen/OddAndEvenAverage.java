package chapterSeventeen;

import java.util.Random;

public class OddAndEvenAverage {
    public static void main(String[] args) {
        Random randomNumber= new Random();

        System.out.printf("Count of even numbers: %d%n",
                randomNumber.ints(10, 0,1000)
                .filter(num -> num % 2 ==0)
                        .count());

        System.out.printf("Count of odd numbers: %d%n",
                randomNumber.ints(10, 0,1000)
                        .filter(num -> num % 2 !=0)
                        .count());

        System.out.printf("Average of all numbers: %.2f%n",
                randomNumber.ints(10, 0,1000)
                        .average()
                        .getAsDouble());

        System.out.printf("Average of odd numbers: %.2f%n",
                randomNumber.ints(10, 0,1000)
                        .filter(num -> num % 2 !=0)
                        .average()
                        .getAsDouble());

        System.out.printf("Average of even numbers: %.2f%n",
                randomNumber.ints(10, 0,1000)
                        .filter(num -> num % 2 ==0)
                        .average()
                        .getAsDouble());

    }
}
