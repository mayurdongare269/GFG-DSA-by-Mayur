class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int secLarg = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(largest < arr[i]) {
                secLarg = largest;
                largest = arr[i];
            } else if(secLarg < arr[i] && arr[i] < largest) {
                secLarg = arr[i];
            }
        }
        
        return secLarg;
    }
}