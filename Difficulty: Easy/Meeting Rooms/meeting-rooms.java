class Solution {
    static boolean canAttend(int[][] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        int n = arr.length;
        // int[] curr = -1;
        
        for(int i = 1; i < n; i++) {
            if(arr[i][0] < arr[i-1][1]) {
                return false;
            }
        }
        
        return true;
    }
}