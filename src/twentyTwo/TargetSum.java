package twentyTwo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TargetSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            if (nums.length == 2) {
                return new int[] {0,1};
            } else {
                
                HashMap<Integer,Integer> numMap= new HashMap<>();


                for (int i =0; i < nums.length; i++ ) {
                    Integer difference = (Integer)(target - nums[i]);
                    if (numMap.containsKey(difference)) {
                        return new int[] {numMap.get(difference), i };
                    }
                    numMap.put(nums[i], i);
                }

                //if you have gotten here you are SOL
                return null;
            }//else it is not so easy
        }
    }
}
