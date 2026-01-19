class Solution {
    int search(int[] arr, int key) {
        // code here
        int n = arr.length; 
        int low = 0, high = n - 1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] == key) {
                return mid;
            }
            
            //mid on line 1
            if(arr[low] <= arr[mid]) {
                //case a: left
                if(arr[low] <= key && key <= arr[mid]) {
                    high = mid - 1;
                } else { // case b: right
                    low = mid + 1;
                }
            }
            // mied on line 2
            else {
                //case c: right
                if(arr[mid] <= key && key <= arr[high]) {
                    low = mid + 1;
                } else {  // case d: left
                    high = mid - 1;
                }
            }
            
            
        }
        
        return -1;
    }
}