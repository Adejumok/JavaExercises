package chapterFour;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int citizenCount = 1;
        double taxRate = 0;
        while (citizenCount <= 3){
            System.out.print("Enter citizen's name: ");
            String citizenName = scanner.next();
            System.out.print("Enter citizen's earning: ");
            double citizenEarning = scanner.nextDouble();

            while (citizenEarning <= 0){
                System.out.print("Enter citizen's earning: ");
                citizenEarning = scanner.nextDouble();
            }

            if (citizenEarning <= 30000){
                taxRate = citizenEarning * 0.15;
                System.out.printf("%s's total tax is %.2f%n",citizenName,taxRate);
            }
            else{
                taxRate = citizenEarning * 0.20;
                System.out.printf("%s's total tax is %.2f%n",citizenName,taxRate);
            }

            citizenCount += 1;

        }

        System.out.println();

    }
}
