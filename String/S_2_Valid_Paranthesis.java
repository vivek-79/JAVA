import java.util.Stack;

public class S_2_Valid_Paranthesis {
    

    private static boolean solveValidParanthesis( String str){

        Stack<Character> st = new Stack<>();

        int start = 0;
        int end = str.length();

        while( start<end){

            char c = str.charAt(start);

            if(c == '(' || c=='{' || c == '['){
                st.push(c);
            }
            else{
                // If closing bracket but stack empty → invalid
                if (st.isEmpty())
                    return false;

                char top = st.peek(); // top of stack
                if ((c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '[')) {
                    st.pop(); // matched, remove
                } else {
                    return false; // mismatch
                }
            };

            start ++;
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        
        String str = "([{}])";

        boolean ans = solveValidParanthesis(str);
        System.out.println(ans);
    }
}
