package twentyFour;

public class IsPalindromeTwoPointer {
    public boolean isPalindrome(String s) {
        // Two pointer approach where we walk a front one forward and a back one backward
        // Need to run .toLower() on each Char for proper comparison
        // Edge cases: empty string, even, odd, non alphanumeric characters

        if (s.length() == 0) return true;

        char[] chars = s.toCharArray();
        int front = 0;
        int back = s.length() - 1;

        while (front <= back) {
            char currFront = chars[front];
            char currBack = chars[back];
            // Skip non-alphanumeric
            if (!Character.isLetterOrDigit(chars[front])) {
                front++;
            } else if (!Character.isLetterOrDigit(chars[back])) {
                back--;
            } else {
                if (Character.toLowerCase(currFront) != Character.toLowerCase(currBack)) {
                    return false;
                }
                // Next letters
                front++;
                back--;
            }

        }

        // Time complexity is O(N) where N is the length of the string
        // Space complexity is O(1) since only a constant extra space is used.

        return true;
    }
}
