class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(arr[mid] <= x) {
                ans = mid;
                
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return ans;
    }
}





// class Solution {

//     static int findFloor(int[] arr, int x) {
//         // write code here
//         for (int i=arr.length-1;i>=0;i--) {
//         if (arr[i]<=x) {
//             return i;
//         }
//     }
//     return -1;
//     }
// }