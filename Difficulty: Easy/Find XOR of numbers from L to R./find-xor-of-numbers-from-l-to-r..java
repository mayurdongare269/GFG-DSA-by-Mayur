// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        return func(l-1) ^ func(r);
    }
    
    public static int func(int n) {
        if((n % 4) == 1) {
            return 1;
        } else if((n % 4) == 2) {
            return (n+1);
        } else if((n % 4) == 3) {
            return 0;
        } else if((n % 4) == 0) {
            return n;
        }
        return 0;
    }
}