package chapterFourteen.textAnalysis;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kindly enter your text: ");
        String text = scanner.nextLine();
        int[] freq = new int[text.length()];
        String[] sText = text.split(", ");

        for(String t : sText){
            for (int c = 1; c <= t.length(); c++) {
                freq[t.charAt(c)] += 1;
            }
        }

        System.out.printf("%s%10s%n", "Letter", "Frequency");

        for (int count = 1; count < freq.length; count++) {
            System.out.printf("%4d%10d%n", count, freq[count]);
        }
    }
}
