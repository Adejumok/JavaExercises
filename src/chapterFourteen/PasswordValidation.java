package chapterFourteen;

import java.util.Scanner;

public class PasswordValidation {
    private static boolean checkValidity(String password){
        return password.matches("[a-zA-Z](?=.*[A-Z])(?=.*\\d).{8,15}");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kindly enter your password: ");
        String password = scanner.next();
        System.out.println(checkValidity(password));
    }
}
