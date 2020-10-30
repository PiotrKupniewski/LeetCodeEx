package Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnTheSameIndicies(){
        //test1
        //[1,2,3,4,5,6,9,15]  target = 9
        int[] tb = new int[]{1,2,3,4,5,6,9,15};
        assertEquals(TwoSum.twoSum(tb, 9),new int[]{1,5});

    }
}