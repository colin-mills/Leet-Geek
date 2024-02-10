package twentyFour;

import java.util.HashMap;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        // Naive approach would be to just iterate through ever solution
        // Instead what we should do is hash each number and then check to see if we have already found the solution
        // We must hash the number as the key and the index as the value

        HashMap<Integer,Integer> cachedNums = new HashMap<>();

        for (int i=0; i < nums.length; i++) {
            int targetMatch = target - nums[i];
            Integer foundMatchIndex = cachedNums.get(targetMatch);

            if (foundMatchIndex != null) {
                return new int[]{foundMatchIndex, i};
            } else {
                cachedNums.put(nums[i], i);
            }
        }

        return null;
        // Time complexity: O(n) where n is the length of nums
        // Space complexity: O(n) as we use a secondary structure that may have to hash every value

    }
}
