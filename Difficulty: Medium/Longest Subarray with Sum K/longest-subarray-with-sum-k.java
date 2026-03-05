// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLen = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(sum == k) {
                maxLen = i + 1;
            }
            
            if(map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
            
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return maxLen;
        
        
        
        
        // all below arw wrong
        // code here
        // int n = arr.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        
        // int sum = 0;
        // int ans = 0;
        
        // for(int i = 0; i < n; i++) {
        //     sum += arr[i];
            
        //     if(map.containsKey(sum - k)) {
        //         ans += map.get(sum-k);
        //     }
            
        //     map.put(sum, map.getOrDefault(sum, 0) + 1);
        // }
        
        // return ans;
        
        //method 2...
        // int n = arr.length;
        // int maxLen = 0;
        // int left = 0, right = 0;
        
        // int sum = arr[0];
        
        // while(right < n) {
        //     while(left <= right && sum > k) {
        //         sum -= arr[left];
        //         left++;
        //     }
            
        //     if(sum == k) {
        //         maxLen = Math.max(maxLen, right-left+1);
        //     }
            
        //     right++;
        //     if(right < n) {
        //         sum += arr[right];
        //     }
        // }
        
        // return maxLen;
    }
}
