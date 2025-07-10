
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) { // similar to nge
        // write code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> span = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            
            if(st.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - st.peek());
            }
            st.push(i);
        }
        
        return span;
    }
}