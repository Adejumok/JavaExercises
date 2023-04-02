package chapterFour;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int number) {
        int factV = 1;
        if (number <= 1){
            return number;
        }

        for (int i = 1; i <= number; i++) {
            System.out.println(i +"! = " + (factV *= i));
        }
        return factV;
    }
}
