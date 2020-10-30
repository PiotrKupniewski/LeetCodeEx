package Ex1;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i  =0; i < nums.length; i++){
            int comp =  target - nums[i];
            if(numsMap.containsKey(comp)){
                return new int[] {numsMap.get(comp), i};
            }
            numsMap.put(nums[i],i);
        }
        throw new UnsupportedOperationException("Not found two digits to sum!");
    }
}
