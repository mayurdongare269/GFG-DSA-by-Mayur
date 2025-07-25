// User function Template for Java

class Solution {
    public int longestPalinSubseq(String s) {
        // code here
        int n = s.length();
        int[][] dp = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        
        for(int c1 = 2; c1 <= n; c1++) {
            for(int i = 0; i <= n - c1; i++) {
                int j = i + c1 - 1;
                if(s.charAt(i) == s.charAt(j) && c1 == 2) {
                    dp[i][j] = 2;
                } else if(s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[0][n-1];
    }
}