class Solution {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;
    }

    Node root = new Node();
    Boolean[] dp;
    
    public boolean wordBreak(String s, String[] dictionary) {
        // Build Trie
        for (String word : dictionary) {
            insert(word);
        }

        dp = new Boolean[s.length()];
        return solve(s, 0);
    }
    
    private boolean solve(String s, int start) {
        if (start == s.length()) return true;
        if (dp[start] != null) return dp[start];

        Node curr = root;

        for (int i = start; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (curr.children[idx] == null) break;

            curr = curr.children[idx];
            if (curr.eow && solve(s, i + 1)) {
                return dp[start] = true;
            }
        }

        return dp[start] = false;
    }
    
    private void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    // public boolean search(String key) {
    //     int n = key.length();
    //     Node curr = root;
        
    //     for(int i = 0; i < n-1; i++) {
    //         int idx = key.charAt(i) - 'a';
    //         if(curr.children(idx) == null) {
    //             return true;
    //         }
            
    //         curr = curr.children[idx];
    //     }
        
    //     return curr.eow == true;
    // }
}