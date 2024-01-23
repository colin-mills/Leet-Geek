package twentyThree;

public class MajorityElementMooreVotingAlgorithm {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {

            //Early exit opportunity
            if (count > nums.length) {
                return candidate;
            }

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
