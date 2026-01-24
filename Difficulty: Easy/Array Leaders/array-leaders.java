class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] >= maxi) {
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}
