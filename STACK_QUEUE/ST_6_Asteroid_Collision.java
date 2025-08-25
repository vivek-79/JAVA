import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();

        for (int val : asteroids) {

            if (st.isEmpty() || val > 0) {
                st.push(val);
            } else {

                while (!st.isEmpty() && st.peek() > 0 && st.peek() < -val) {
                    st.pop();
                }

                if (!st.isEmpty() && st.peek() == -val) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(val);
                }
            }
        }

        int[] res = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            res[i] = st.get(i); // stack allows random access
        }
        return res;
    }
}