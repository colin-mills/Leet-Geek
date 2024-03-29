package twentyTwo;

import java.util.HashSet;

public class SIngleNumberXOR {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
