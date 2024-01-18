package twentyThree;

public class MergeSortedArraysTwoPointers {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Thoughts
        // To avoid swapping, start at the end of nums1
        // Then use two pointers to point to the largest number in either array
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (nums2Pointer < 0 || nums1Pointer >= 0 && nums1[nums1Pointer] >= nums2[nums2Pointer]) {
                nums1[i] = nums1[nums1Pointer];
                nums1Pointer--;
            } else {
                nums1[i] = nums2[nums2Pointer];
                nums2Pointer--;
            }

        }

    }
}
