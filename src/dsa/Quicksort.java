package dsa;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] myArray = {6, 3, 8, 1, 7, 2, 5, 9, 4};
        Quicksort.sort(myArray);
        System.out.println(Arrays.toString(myArray)); // output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }

    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int left, int right) {
        int pivotIndex = partition(array, left, right);
        if (left < pivotIndex - 1) {
            quicksort(array, left, pivotIndex - 1);
        }
        if (right > pivotIndex) {
            quicksort(array, pivotIndex, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[left + (right - left) / 2]; // choose pivot as middle element
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
