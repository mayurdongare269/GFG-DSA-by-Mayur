// User function Template for Java

class Solution {
    public int lowerBound(int row[], int m, int x) {
        int low = 0, high = m - 1;
        int ans = m;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(row[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        
        int cnt_max = 0;
        int ind = -1;
        
        for(int i = 0; i < n; i++) {
            int cnt_one = m - lowerBound(arr[i], m, 1);
            if(cnt_one > cnt_max) {
                cnt_max = cnt_one;
                ind = i;
            }
        }
        
        return ind;
    }
}