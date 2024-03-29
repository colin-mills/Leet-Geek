package twentyTwo;

public class HammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(12));
        System.out.println();
    }
    public static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones += (n & 1);
            n = n>>>1;
        }
        return ones;
    }
}
