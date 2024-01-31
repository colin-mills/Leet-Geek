package twentyFour;

public class RemoveElementTwoPointers {
        public int removeElement(int[] nums, int val) {
            // So I am thinking this is a two pointer approach
            // We step them together until we find the bad value
            // Then the second pointer steps until the next non-bad value or the end
            // The first pointer then swaps with the last pointer until the last pointer falls off or first pointer is pointing to a non-bad value
            int first = 0;
            int last = 0;
            while (last != nums.length && first != nums.length) {
                while (first < nums.length && nums[first] != val) {
                    first++;
                }
                last = first;
                while (last < nums.length && nums[last] == val) {
                    last++;
                }

                // Make the swap if we didn't run out of elements
                if (first < nums.length && last < nums.length) {
                    nums[first] = nums[last];
                    // Do this so that value gets swapped out
                    nums[last] = val;
                }
            }
            // The position of first will align with how many elements are in the array
            return first;

        }
}
