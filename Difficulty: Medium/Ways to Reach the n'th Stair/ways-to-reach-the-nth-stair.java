class Solution {
    int countWays(int n) {
        // your code here
        if(n <= 2) return n;
        
        int first = 1;
        int second = 2;
        
        for(int i = 3; i <= n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }
        
        return second;
    }
}
