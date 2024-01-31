package twentyFour;

public class LengthOfLastWordReverseLoop {
    public int lengthOfLastWord(String s) {
        char[] sCharArray = s.toCharArray();
        int count = 0;
        int i = sCharArray.length -1;

        //Let's start at the end and go until we find the first non space
        //Then we keep counting until the next space OR we have traversed the whole list
        for (; i >= 0; i--) {
            // Keep going til we find a non-space
            if (sCharArray[i] == ' ') continue;
            else break;
        }

        // If we found a non-space keep counting til another space or we are at the begining
        while (i >= 0 && sCharArray[i] != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
