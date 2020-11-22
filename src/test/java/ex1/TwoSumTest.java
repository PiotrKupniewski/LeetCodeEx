package ex1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnTheSameIndicies(){
        //test1
        //[1,2,3,4,5,6,9,15]  target = 9
        int[] tb = new int[]{1,2,3,4,5,6,9,15};
        assertArrayEquals(new int[]{4,5},TwoSum.twoSum(tb, 9));

        // test1
        // [2,7,11,15]  target = 9
        int[] tb2 = new int[]{2,7,11,15};
        assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(tb2, 9));
    }
}