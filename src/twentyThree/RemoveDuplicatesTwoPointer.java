package twentyThree;

public class RemoveDuplicatesTwoPointer {
    public int removeDuplicates(int[] nums) {
        // Another two pointer approach, very similar to RemoveElements
        int last = 1;
        for (int first = 1; first < nums.length; first++) {
            if (nums[first] != nums[first-1]) {
                nums[last] = nums[first];
                last++;
            }
        }
        return last;
    }
}
