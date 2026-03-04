class Solution {
    boolean isPalindrome(String s) {
        // code here
        int n = s.length();
        int l = 0, h = n - 1;
        
        
        while(l < h) {
            if(s.charAt(l) != s.charAt(h)) {
                return false;
            }
            
            l++;
            h--;
            
        }
        
        return true;
    }
}