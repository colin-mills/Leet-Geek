package twentyFour;

import java.util.ArrayList;
import java.util.List;

public class SummaryRangesTraversal {
    public List<String> summaryRanges(int[] nums) {
        // This is a classic two pointer solution
        // We walk the end pointer forward and keep asking, can I do better?
        // Once we find a non-contiguous number we store the result and move the back pointer forward

        List<String> results = new ArrayList<>();

        for (int i=0; i < nums.length; i++) {
            int start = nums[i];
            while (i+1 < nums.length && nums[i]+1 == nums[i+1]) {
                i++;
            }

            if (start != nums[i]) {
                results.add(start+"->"+nums[i]);
            } else {
                results.add(String.valueOf(start));
            }

        }

        return results;

        // Time complexity: O(n) to traverse array
        // Space complexity: O(n) as the result is a list of strings that could be equal to the length of nums

    }
}
