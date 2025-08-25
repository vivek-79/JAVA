import java.util.Stack;

class ST_1_Implement_Min_Stack{

    static class MinStack{

        int min =Integer.MAX_VALUE;
        Stack<Integer> st = new Stack<>();

        //Push
        public void push(int val){

            if( st.empty()){

                st.push(val);
                min = val;
            }
            else if(val>min){
                st.push(val);
            }
            else{
                int newVal = 2*val - min;
                st.push(newVal);
                min =val;
            }
        }

        //Top
        public int top(){

            if(st.peek() < min){
                return min;
            }
            else{
                return st.peek();
            }
        }

        //Pop
        public void pop(){

            if(st.peek() <min){

                int newMin = 2*min-st.peek();
                min = newMin;
                st.pop();
            }
            else{
                st.pop();
            }
        }

        //Get Min
        public int getMin(){
            return min;
        }

    }

    public static void main(String[] args) {
        
        MinStack st = new MinStack();

        st.push(10);
        st.push(8);
        st.push(12);
        System.out.println(st.top());
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
        st.pop();
        System.out.println(st.getMin());
        st.pop();

    }
}