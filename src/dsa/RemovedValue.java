package dsa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemovedValue {
    public static void main(String[] args) {
        int[] list = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        int num = 4;
        System.out.println("The index of the value removed is: " + findValue(list, num));
    }

    private static int findValue(int[] arr, int number){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                temp[i] = arr[i];
                arr[i]= -1;
                return i;
            }
        }

        return -1;
    }
}
