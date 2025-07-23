class Solution {
    public int countPS(String s) {
        // code here
        int n = s.length();
        int count = 0;
        
        for(int c = 0; c < 2*n-1; c++) {
            int left = c / 2;
            int right = left + c % 2;
            
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if(right - left + 1 >= 2) {
                    count++;
                }
                left--;
                right++;
            }
            
        }
        
        return count;
    }
}