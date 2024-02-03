package twentyFour;

import java.util.Arrays;

public class LongestCommonPrefixSorted {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++){
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
        // Runtime is O(m * log(n) + 2m) where n is the size of the array and m is average length of string
        // Memory usage is O(m) as we sort the array in place and the largest return value shall be m
    }
}
