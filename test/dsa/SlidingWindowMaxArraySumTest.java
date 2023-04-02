package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaxArraySumTest {
    private SlidingWindowMaxArraySum slidingWindowMaxArraySum;

    @Test
    void maxArray(){
        int[] x= new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        assertEquals(SlidingWindowMaxArraySum.maxArray(x,4), 39);
    }

}