import java.util.Stack;

class MinStack {
        Stack<Long> st = new Stack<>();
        long min=-1;

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }
        public MinStack() {}
    public void push(int val) {			//1,2,-3,0
            long x=(long)val;
            if(st.size()==0){
                st.push(x);
                min=x;
            }
            else if(x >= min){
                st.push(x);
            }
            else if(x < min) {
                st.push(2*x-min);
                min = x;
            }
        }
        public void pop() {
            if(st.size()==0){
                return;
            }
            else if(st.peek() >= min) st.pop();
            else if(st.peek()<min){
                long old = 2*min-st.peek();
                min = old;
                st.pop();
            }
        }
        public int top() {
            if(st.size()==0)   return -1;
            long q=st.peek();
            if(q >= min ) return (int)q;
            if(q < min ) return (int)min;
            return 0;
        }
        public int getMin() {
            if(st.size()==0){
                return -1;
            }
            return (int)min;
        }
    }






