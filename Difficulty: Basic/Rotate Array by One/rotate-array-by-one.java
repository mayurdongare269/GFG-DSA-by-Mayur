// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;

        // k = k % n; //  nhi toh Runtime Error

        reverse(arr, 0, n-1);
        reverse(arr, 0, 1-1);
        reverse(arr, 1, n-1);
    }
    
    private void reverse(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}