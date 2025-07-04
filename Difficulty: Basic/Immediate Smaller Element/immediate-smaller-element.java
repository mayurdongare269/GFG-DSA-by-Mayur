// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        // code here
        int n = arr.length;
        // int[] ans = new int[arr.length];
        
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                arr[i] = arr[i+ 1];
            } else {
                arr[i] = -1;
            }
        }
        
        arr[n - 1] = -1;
    }
}