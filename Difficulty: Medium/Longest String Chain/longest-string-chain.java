class Solution {
    
    // private boolean checkPossible(String w1, String w2) {
    //     if(w1.length() != w2.length() + 1) return false;
        
    //     int i = 0, j = 0;
    //     while(i < w1.length()) {
            
            
    //         if(j < w2.length() && w1.charAt(i) == w2.charAt(j)) {
    //             i++;
    //             j++;
    //         } else {
    //             i++;
    //         }
         
    //     }
    //     return j == w2.length();
    // }
    
    public int longestStringChain(String words[]) {
        // code here
        Arrays.sort(words, Comparator.comparingInt(String::length));
        
        HashMap<String, Integer> dp = new HashMap<>();
        int ml = 1;
        
        for(String word : words) {
            int best = 1;
            
            for(int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                if(dp.containsKey(prev)) {
                    best = Math.max(best, dp.get(prev) + 1);
                }
            }
            
            dp.put(word, best);
            ml = Math.max(ml, best);
        }
        return ml;
        
        // int n = words.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, 1);
        
        // int maxi = 1;
        
        // for(int i = 0; i < n; i++) {
        //     for(int prev = 0; prev < i; prev++) {
        //         if(checkPossible(words[i], words[prev]) && dp[prev] + 1 > dp[i]) {
        //             dp[i] = dp[prev] + 1;
        //         }
        //     }
        //     maxi = Math.max(maxi, dp[i]);
        // }
        // return maxi;
    }
}