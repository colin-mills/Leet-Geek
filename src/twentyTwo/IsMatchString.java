package twentyTwo;

public class IsMatchString {
    public static void main(String[] args) {
//        System.out.println(isMatch("",""));
//        System.out.println(isMatch("","a"));
//        System.out.println(isMatch("","*"));
//        System.out.println(isMatch("aa",""));
//        System.out.println(isMatch("aa","a"));
//        System.out.println(isMatch("aa","*b"));
//        System.out.println(isMatch("cb","?a"));
//        System.out.println(isMatch("cb","*****"));
//        System.out.println(isMatch("csdfssfsdffdb","c*b"));
//        System.out.println(isMatch("csdfssfsdffdbbbb","c*b*"));
        System.out.println(comparison("abcabczzzde","*abc???de*"));
        //"abcabczzzde"
        //"*abc???de*"
    }
    public static boolean isMatch(String s, String p) {
        int m=s.length(), n=p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;

        for(int j=1; j<=n; j++) {
            if(p.charAt(j-1)=='*'){
                dp[0][j] = true;
            } else {
                break;
            }
        }

        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if (p.charAt(j-1)!='*') {
                    dp[i][j] = dp[i-1][j-1] && (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?');
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }

    public static boolean comparison(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;
        while (s < str.length()){
            // advancing both pointers
            if (p < pattern.length()  && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))){
                s++;
                p++;
            }
            // * found, only advancing pattern pointer
            else if (p < pattern.length() && pattern.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
            // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1){
                p = starIdx + 1;
                match++;
                s = match;
            }
            //current pattern pointer is not star, last patter pointer was not *
            //characters do not match
            else return false;
        }

        //check for remaining characters in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;

        return p == pattern.length();
    }
}
