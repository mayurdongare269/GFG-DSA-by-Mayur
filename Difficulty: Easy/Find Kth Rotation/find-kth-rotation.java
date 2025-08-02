class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int low = 0, high = n - 1;
        
        while(low < high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
}