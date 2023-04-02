package dsa;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 5;
        if (binarySearch(numbers,target)==-1){
            System.out.println("Value not found");
        }else System.out.printf("The target value of "+target+" " +
                "is found at index "+binarySearch(numbers,target));
    }
    public static int binarySearch(int[] numbers, int target){
        int first = 0;
        int last = numbers.length-1;

        while (first <= last){
            int mid = (first+last)/2;
            if (target==numbers[mid]){
                return mid;
            } else if (target < numbers[mid]) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return -1;
    }
}
