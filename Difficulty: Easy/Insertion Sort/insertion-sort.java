class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length; 
        
        for(int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i-1;
            
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            
            //insertion
            arr[prev + 1] = curr;
        }
    }
}