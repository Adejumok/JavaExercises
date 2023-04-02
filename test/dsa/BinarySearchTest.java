package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void findNumber(){
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 5;
        assertEquals(4, BinarySearch.binarySearch(numbers, target));
    }

    @Test
    public void findNonPresentNumber(){
        int[] numbers = {1,2,3,4,5,6,7};
        int target = 12;
        assertEquals(-1, BinarySearch.binarySearch(numbers, target));
    }
}