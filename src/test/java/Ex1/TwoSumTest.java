package Ex1;


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
        // [10,2,35,42,53,61,9,15]  target = 11
        int[] tb2 = new int[]{1,3,5,6,7,51};
        assertArrayEquals(new int[]{3,4}, TwoSum.twoSum(tb2, 11));
    }
}