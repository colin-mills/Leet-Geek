package twentyFour;

import java.util.HashMap;

public class RomanToIntHashMap {
    public int romanToInt(String s) {
        // We should buid a hashmap with symbols as keys with their corresponding values
        // We should convert String to char array
        // Run a for a loop and keep adding unless it should be negative (specific conditions)
        int value = 0;
        HashMap<Character, Integer> romanNumerals = getRomanNumeralHash();

        char[] sArray = s.toCharArray();

        for (int i = 0; i < sArray.length; i++) {
            int currentVal = romanNumerals.get(sArray[i]);

            // Determine if this value should be negative
            // Cannot be negative if it is the last key
            if (i != sArray.length - 1) {
                if (sArray[i] == 'I' && (sArray[i+1] == 'V' || sArray[i+1] == 'X')) {
                    currentVal *= -1;
                }

                if (sArray[i] == 'X' && (sArray[i+1] == 'L' || sArray[i+1] == 'C')) {
                    currentVal *= -1;
                }

                if (sArray[i] == 'C' && (sArray[i+1] == 'D' || sArray[i+1] == 'M')) {
                    currentVal *= -1;
                }
            }

            value += currentVal;
        }

        return value;
    }
    private HashMap<Character, Integer> getRomanNumeralHash() {
        HashMap<Character, Integer> romanNumeralHash = new HashMap<>();
        romanNumeralHash.put('I', 1);
        romanNumeralHash.put('V', 5);
        romanNumeralHash.put('X', 10);
        romanNumeralHash.put('L', 50);
        romanNumeralHash.put('C', 100);
        romanNumeralHash.put('D', 500);
        romanNumeralHash.put('M', 1000);

        return romanNumeralHash;
    }
}
