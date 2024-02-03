package twentyFour;

public class TwoPointerNeedleInHaystack {
    public int strStr(String haystack, String needle) {
        // Slidig Window

        // window size of needle or the length of the needle that we need to find
        int k = needle.length();

        /*Two Pointers i and j initially pointing at same position in haystack
          assume 'i' is the left part of the window and 'j' is the right part of
          the window initially they both are pointing at same part */

        int j = 0;
        int i = 0;

        /*Since we know that we have to find the needle in the haystack so we
          focus only on the needle length i.e our window size.we will find the
          needle in haystack by expanding our window size (we will expand it by
          incrementing the right part) once we hit the window size we will check
          whether it contains needle or not if it contians then simply return the
          left part of the window beacuse we have to find the index of the first
          occurance and if it doesn't we have to increment the left part i.e 'i'
          beacuse we have to maintian that window
        */

        while(j<haystack.length()){

            /*As soon as we hit the window size we will start looking for our
              needle in haystack
            */
            if(j-i+1==k){

                // Searching our needle in haystack
                String s1 = haystack.substring(i,j+1);

                // Checking whether we found is same as our needle or not
                if(needle.equals(s1)){
                    return i;  // return the leftmost part of our window
                }
                i++; // Incrementing the left part
            }
            j++; // Expanding the window by incrementing right part
        }
        return -1; //If our needle is not present in haystack we simply return '-1'
    }
}
