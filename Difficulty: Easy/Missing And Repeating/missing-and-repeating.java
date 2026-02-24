class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        // Approach 1 - O(2n) & O(n) 
        int n = arr.length;
        
        int hash[] = new int[n+1];
        
        for(int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        
        int repeating = -1;
        int missing = -1;
        
        for(int i = 1; i <= n; i++) { // numbers so start with 1
            if(hash[i] == 2) {
                repeating = i;
            } else if(hash[i] == 0) {
                missing = i;
            }
            
            if(repeating != -1 && missing  != -1) {
                break;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(repeating);
        ans.add(missing);
        
        return ans;
    }
}
