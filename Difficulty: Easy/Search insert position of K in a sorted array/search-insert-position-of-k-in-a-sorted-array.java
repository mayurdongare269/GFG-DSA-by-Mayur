class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
};