class Solution {
    
    
    private int countStud(int arr[], int pages) {
        int n = arr.length; 
        int std = 1, pagesStu = 0;
        
        for(int i = 0; i < n; i++) {
            if(pagesStu + arr[i] <= pages) {
                pagesStu += arr[i];
            } else {
                std += 1;
                pagesStu = arr[i];
            }
        } 
        return std;
    }
    
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k > n) return -1;
        
        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for(int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            int noOfStud = countStud(arr, mid);
            if(noOfStud > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}