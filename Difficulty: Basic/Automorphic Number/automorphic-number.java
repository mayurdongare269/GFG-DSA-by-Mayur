class Solution {
    public String isAutomorphic(int n) {
        // code here
        
        int square = n * n;
        
        int temp = n;
        int digits = 0;
        while(temp > 0) {
            digits++;
            temp /= 10;
        }
        
        int lastD = square % (int) Math.pow(10, digits);
        
        if(lastD == n) {
            return "Automorphic";
        } else {
            return "Not Automorphic";
        }
    }
}