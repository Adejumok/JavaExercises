package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalSum {
    public static void main(String[] args) {
        ArrayList<int[][]> x = new ArrayList<>();
        int[][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        x.add(a);
        System.out.println("The diagonal sum of the array is: "+ (findDiagonalSum(x)));
    }

    private static ArrayList<int[]> findDiagonalSum(ArrayList<int[][]> arr) {
        ArrayList<int[]> diagonalSum = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    diagonalSum.add(arr.get(i)[j]);
                }
            }
        }
        return diagonalSum;
    }
}
