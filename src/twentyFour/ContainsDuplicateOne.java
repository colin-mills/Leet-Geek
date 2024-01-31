package twentyFour;

import java.util.HashMap;

public class ContainsDuplicateOne {
    HashMap<Integer, Integer> numFrequency = new HashMap<>();


    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numFrequency = new HashMap<>();
        for (int num : nums) {
            if (numFrequency.containsKey(num)) {
                return true;
            }
            numFrequency.put(num, 1);
        }
        return false;
    }
}
