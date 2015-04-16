public class Solution {
    public int numDistinct(String S, String T) {
        if (S == null || T == null || S.length() < T.length()) {
            return 0;
        }
        int[] dp = new int[T.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= S.length(); i++) {
            for (int j = T.length(); j > 0; j--) {
                if (S.charAt(i - 1) == T.charAt(j - 1)) {
                    dp[j] += dp[j - 1];
                }
            }
        }
        return dp[T.length()];
    }
}