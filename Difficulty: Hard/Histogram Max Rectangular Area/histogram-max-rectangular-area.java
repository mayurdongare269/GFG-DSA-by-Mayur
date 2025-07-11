class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        
        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int elm = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                
                int width = nse - pse - 1;
                int area = width * arr[elm];
                
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        
        //reamaining
        while(!st.isEmpty()) {
                int elm = st.pop();
                int nse = n;
                int pse = st.isEmpty() ? -1 : st.peek();
                
                int width = nse - pse - 1;
                int area = width * arr[elm];
                
                maxArea = Math.max(area, maxArea);
        }
        
        return maxArea;
    }
}
