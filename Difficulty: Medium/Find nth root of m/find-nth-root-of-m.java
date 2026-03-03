class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low = 0, high = m;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            int ans = 1;
            for(int i = 0; i < n; i++) {
                ans *= mid;
                if(ans > m) break;
            }
            
            if(ans == m) return mid;
            
            if(ans < m) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1;
    }
}