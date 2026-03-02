class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        //Method 1: find minvalue and return its index...
        int n = arr.length;
        int minVal = arr[0];
        int minIdx = 0;
        
        for(int i = 1; i < n; i++) {
            if(minVal > arr[i]) {
                minVal = arr[i];
                minIdx = i;
            }
        }
        
        return minIdx;
        
        // Method
    }
}