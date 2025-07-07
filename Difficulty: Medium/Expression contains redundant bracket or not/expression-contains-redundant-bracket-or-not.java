class Solution {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(ch == ')') {
                char top = st.pop();
                boolean operatorFound = false;
                
                while(top != '(') {
                    if(top == '+' || top == '-' || top == '*' || top == '/') {
                        operatorFound = true;
                    }
                    top = st.pop(); // remember
                }
                
                if(!operatorFound) {
                    return 1;
                }
            } else {
                st.push(ch);
            }
        }
        
        return 0;
    }
}
