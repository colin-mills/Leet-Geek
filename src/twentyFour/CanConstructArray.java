package twentyFour;

public class CanConstructArray {
    public boolean canConstruct(String ransomNote, String magazine) {
        // So we should cache the frequencies of letters in a magazine
        // And then loop through the ransomNote and decrement the frequency of each used letter
        // Until we have reached the end of randomNote (success) or any given frequency is negative (failure)
        int[] magazineFrequency = new int[26];

        for (char currentChar : magazine.toCharArray()) {
            magazineFrequency[currentChar - 'a']++;
        }

        for (char currentChar : ransomNote.toCharArray()) {
            magazineFrequency[currentChar - 'a']--;
            if (magazineFrequency[currentChar - 'a'] < 0) {
                return false;
            }
        }

        return true;

        // Runtime linear (O(n)) technically O(n+m)
        // Memory is constant O(1) as we only need one fixed size array

    }
}
