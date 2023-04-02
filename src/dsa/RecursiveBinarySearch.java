package dsa;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 1;
        if (recursiveBinary(numbers,target,0,6)==-1){
            System.out.println("Value not found");
        }else System.out.printf("The target value of "+target+" " +
                "is found at index "+recursiveBinary(numbers,target,0,6));
    }

    public static int recursiveBinary(int[] numbers, int target, int first, int last){
        if(numbers.length <= 1){
            return 0;
        }

        if (first > last){
            return -1;
        }

        int mid = (first+last)/2;

        if (numbers[mid]==target){
            return mid;
        }
        if (numbers[mid] < target) {
            return recursiveBinary(numbers,target, mid + 1, last);
        }
        if (numbers[mid] > target){
            return recursiveBinary(numbers,target, first, mid - 1);
        }
        return -1;
    }
}
