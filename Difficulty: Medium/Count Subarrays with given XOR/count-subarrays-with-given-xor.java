class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // or add if condition in loop
        
        int n = arr.length;
        int xor = 0;
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            xor ^= arr[i];
            
            // if(xor == k) { // if map.put(0, 1) is not written on top
            //     cnt++;
            // }
            
            if(map.containsKey(xor ^ k)) {
                cnt += map.get(xor ^ k);
            }
            
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        
        return cnt;
    }
}