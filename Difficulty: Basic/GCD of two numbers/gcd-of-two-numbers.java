class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}
