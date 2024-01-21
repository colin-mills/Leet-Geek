package twentyThree;

public class RemoveMoreThanTwoDupesTwoPointer {
    public int removeDuplicates(int[] nums) {
        int current =  1;
        int countDupes = 1;

        for (int front = 1; front < nums.length; front++) {
            // Move until we are at front, counting along the way
            if (nums[front] == nums[front - 1]) {
                countDupes++;

            } else { // If they are different reset dupe counter
                countDupes = 1;
            }

            if (countDupes < 3) {
                nums[current] = nums[front];
                current++;
            }

        }
        return current;

    }
}
