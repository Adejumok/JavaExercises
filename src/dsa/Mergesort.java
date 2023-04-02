package dsa;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] myArray = {6, 3, 8, 1, 7, 2, 5, 9, 4};
        Mergesort.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int[] tempArray = new int[array.length];
        mergesort(array, tempArray, 0, array.length - 1);
    }

    private static void mergesort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(array, tempArray, left, mid);
            mergesort(array, tempArray, mid + 1, right);
            merge(array, tempArray, left, mid, right);
        }
    }

    private static void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
}

