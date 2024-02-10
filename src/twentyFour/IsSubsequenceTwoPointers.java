package twentyFour;

public class IsSubsequenceTwoPointers {
    public boolean isSubsequence(String s, String t) {
        // Classic two pointer solution
        // Loops from the beginning to the end of the first string, s, only advancing if
        // you have found a
        // match for the current sChar
        // Return true if we found a match for all of s, else
        // if we reached the end of t, we didn't find a substring

        // Edge case
        if (s.length() == 0) return true;

        int sChar = 0;
        for (int tChar = 0; tChar < t.length(); tChar++) {
            if (s.charAt(sChar) == t.charAt(tChar)) {
                // Found a match walk sChar forward
                sChar++;
            }

            // If we scanned all of sChar then we have a match and an early exit opportunity
            if (sChar == s.length()) {
                return true;
            }
        }

        return false;

        //Time complexity is O(s+t) where s is the lenght of s and t is the length of t
        //Space complexity is O(1) as this can be done with constant scratch space
    }
}
