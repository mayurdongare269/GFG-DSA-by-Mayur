// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here]
        int large = Integer.MIN_VALUE;
        
        for(int i = 2; i*i <= n; i++) {
            while(n % i == 0) {
                large = Math.max(i, large);
                n /= i;
            }
        }
        
        if(n > 1) {
            large = Math.max(n, large);
        }
        
        return large;
    }
}