class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++) {
            int small = i;
            for(int j = i+1; j <= n-1; j++) {
                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            
            // swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}