// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        return set.size();
    }
}