package twentyFour;

import java.util.HashMap;

public class MajorityElementHashMap {
        public int majorityElement(int[] nums) {
            // First thought is using a hash map to store frequencies and if any of the frequencies
            // exceed n/2 then we break and report the value
            HashMap<Integer, Integer> numFrequency = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int currentFrequency = numFrequency.getOrDefault(nums[i], 0);
                if (currentFrequency + 1 > nums.length / 2) {
                    return nums[i];
                }
                numFrequency.put(nums[i], currentFrequency + 1);
            }
            return -1;
        }
}
