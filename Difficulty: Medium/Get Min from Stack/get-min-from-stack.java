class Solution {
    private Stack<Integer> st;
    private int min;
    
    public Solution() {
        st = new Stack<>();
    }

    // Add an element to the top of Stack
    public void push(int x) {
        if(st.empty()) {
            st.push(x);
            min = x;
        } else {
            if(x >= min) {
                st.push(x);
            } else {
                st.push(2 * x - min);
                min = x;
            }
        }
        
    }

    // Remove the top element from the Stack
    public void pop() {
        if(st.empty()) {
            return;
        }
        int n = st.pop();
        if(n < min) {
            min = 2 * min - n;
        }
    }

    // Returns top element of the Stack
        
    public int peek() {
        if(st.empty()) {
            return -1;
        }
        int n = st.peek();
        if(n >= min) {
            return n;
        } else {
            return min;
        }
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        if(st.empty()) {
            return -1;
        }
        return min;
    }
}