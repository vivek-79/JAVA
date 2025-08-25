import java.util.Stack;

class StockSpanner {

    private class Pair<U, V> {

        U indx;
        V val;

        public Pair(U indx, V val) {
            this.indx = indx;
            this.val = val;
        }

        public U getIndx() {
            return this.indx;
        }

        public V getVal() {
            return this.val;
        }
    }

    Stack<Pair<Integer, Integer>> st = new Stack<>();
    int indx = -1;

    public StockSpanner() {
        indx = -1;
        st.clear();
    }

    public int next(int price) {

        indx += 1;

        while (!st.isEmpty() && st.peek().getVal() <= price)
            st.pop();

        int days = -1;
        if (st.isEmpty()) {
            days = indx + 1;
        } else {
            days = indx - st.peek().getIndx();
        }
        st.push(new Pair<>(indx, price));

        return days;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */