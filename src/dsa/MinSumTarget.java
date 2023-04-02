package dsa;

public class MinSumTarget {
    public static void main(String[] args) {
        int[] list = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        int num = 4;
        System.out.println((sumTarget(list, num)));
    }

    private static int sumTarget(int[] arr, int target){
        int minSize = arr.length;
        int start = 0;
        int sum = 0;
        for (int end = 0; end < arr.length; end++) {
           sum += arr[end];
           while (sum >= target){
                minSize = Math.min(minSize, end - start + 1);
                sum -= arr[start];
                start++;
           }
        }
        return minSize;
    }
}
