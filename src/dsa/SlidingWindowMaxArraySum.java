package dsa;

import java.util.Arrays;

public class SlidingWindowMaxArraySum {
    static int maxArray(int[] arr, int k){
        int maxSum = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i >= k-1){
                maxSum = Math.max(maxSum, sum);
                sum -= arr[i-(k-1)];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println((maxArray(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4)));
    }
}
