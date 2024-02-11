package twentyFour;

import java.util.HashMap;

public class ValidAnagramHashMap {
    public boolean isAnagram(String s, String t) {
        // Simple HashMap solution where we just cash the letters of s and loop through t
        // Edge case is that s and t must be of the same length

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char ch: s.toCharArray()) {
            //Put values here, get with increment
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch: t.toCharArray()) {
            // Get with decrement here, if we are at zero, return false
            int chLeft = frequency.getOrDefault(ch, 0);

            if (chLeft < 1) return false;

            frequency.put(ch, chLeft-1);
        }

        // Time Complexity is O(S+T) where S+T is the length of the strings
        // Space Complexity is (1) since we have a HashMap that will never exceed 26 keys (letters in the English alphabet)

        return true;
    }
}
