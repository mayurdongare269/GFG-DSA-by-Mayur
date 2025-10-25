class Solution {
    public int josephus(int n, int k) {
        // code here
        return helper(n, k) + 1;
        
    }
    
    private int helper(int n, int k) {
        if(n == 1) return 0;
        
        return (helper(n-1, k) + k)%n;
    }
}