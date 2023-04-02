package dsa;

import java.util.Arrays;

public class TwoDimArrIntersection {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] tempNums = new int[nums2.length];
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j] ){
                tempNums[j] = nums2[j];
                i++;
                j++;
            } else if (nums1.length > nums2.length) {
                i++;
            }else j++;
        }
        return tempNums;
    }
}
