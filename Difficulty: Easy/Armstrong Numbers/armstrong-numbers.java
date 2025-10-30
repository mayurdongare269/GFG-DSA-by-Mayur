// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        String s = String.valueOf(n);
        int k = s.length();
        
        int rem = 0;
        int x = n;
        int sum = 0;
        
        while(x != 0) {
            rem = x % 10;
            sum += Math.pow(rem, k);
            x/=10;
        }
        
        return sum == n;
    }
}