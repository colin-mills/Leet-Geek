package twentyTwo;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String one = "ab#c";
        String two = "ad#c";

        System.out.println(backspaceCompare(one,two));
    }
    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int countS = 0;
        int countT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0 && (countS > 0 || S.charAt(i) == '#')) {
                if (S.charAt(i) == '#') countS++;
                else countS--;
                i--;
            }
        char leftCh = i < 0 ? '#' : S.charAt(i);

        while (j >= 0 && (countT > 0 || T.charAt(j) == '#')) {
            if (T.charAt(j) == '#') countT++;
            else countT--;
            j--;
        }
        char rightCh = j < 0 ? '#' : T.charAt(j);

        if (leftCh != rightCh) return false;

        i--;
        j--;
    }
        return true;
    }
}
