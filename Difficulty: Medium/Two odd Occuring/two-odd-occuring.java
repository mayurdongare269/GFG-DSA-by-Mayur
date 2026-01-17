class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        int n = arr.length;
        long xor= 0;
        for(int i : arr) {
            xor ^= i;
        }
        
        int rightmost = (int)(xor & -xor);
        
        int b1 = 0, b2 = 0;
        for(int i = 0; i < n; i++) {
            if((arr[i] & rightmost) != 0) {
                b1 = b1 ^ arr[i];
            } else {
                b2 = b2 ^ arr[i];
            }
        }
        
        // if(b1 < b2) return new int[]{b2, b1};
        // return new int[]{b1, b2};
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(b1 < b2) {
            ans.add(b2);
            ans.add(b1);
        } else {
            ans.add(b1);
            ans.add(b2);
        }
        
        return ans;
    }
}
