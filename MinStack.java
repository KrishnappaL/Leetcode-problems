package code2;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		
		//  Your MinStack object will be instantiated and called as such:
		  MinStack obj = new MinStack();
		  obj.push(-2);
		  obj.push(0);
		  obj.push(-3);
		  int param_2=obj.getMin();
		  obj.pop();
		  int param_3 = obj.top();
		  int param_4 = obj.getMin();
		 


	}
	    public Stack<Integer> st;
	    public Stack<Integer> minSt;

	    public MinStack() {
	        st = new Stack<>();
	        minSt = new Stack<>();
	    }
	    
	    public void push(int val) {
	        st.push(val);
	        if (minSt.isEmpty() || val<=minSt.peek()) {
	            minSt.push(val);
	        }
	    }
	    
	    public void pop() {
	        if(st.peek().equals(minSt.peek()))
	        {
	           minSt.pop();
	        }
	    st.pop();

	   }
	    
	    public int top() {
	        return st.peek();
	    }
	    
	    public int getMin() {
	        return minSt.peek();
	    }
	}


