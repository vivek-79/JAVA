import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n =num.length();
        int low = 0;

        while( low<n){

            while( !st.isEmpty() && st.peek()>num.charAt(low) && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(low));
            low++;
        }

        while(!st.isEmpty() && k>0) st.pop();

        boolean leadingZero = true;
        for (char c : st) {
            if (leadingZero && c == '0') continue;
            leadingZero = false;
            sb.append(c);
        }

        return  sb.length() == 0 ? "0" : sb.toString();
    }
}