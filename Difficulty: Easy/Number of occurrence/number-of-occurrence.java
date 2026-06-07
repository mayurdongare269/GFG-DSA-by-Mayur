class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(target == arr[i]) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
