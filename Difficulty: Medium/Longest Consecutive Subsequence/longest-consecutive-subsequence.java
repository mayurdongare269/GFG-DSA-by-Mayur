class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        int longest = 1;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        
        for(int it : set) {
            if(!set.contains(it-1)) {
                int cnt = 1;
                int x = it;
                
                while(set.contains(x+1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                
                longest = Math.max(longest, cnt);
            }
        }
        
        return longest;
        
    }
}