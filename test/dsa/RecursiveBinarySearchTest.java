package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveBinarySearchTest {
    @Test
    public void findNumber(){
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 5;
        assertEquals(4, RecursiveBinarySearch.recursiveBinary(numbers, target, 0, 6));
    }

    @Test
    public void findNonPresentNumber(){
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 12;
        assertEquals(-1, RecursiveBinarySearch.recursiveBinary(numbers, target,0,6));
    }

}