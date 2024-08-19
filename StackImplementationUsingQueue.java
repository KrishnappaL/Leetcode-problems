package code2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StackImplementationUsingQueue {
   // private Deque<Integer> q1 = new ArrayDeque<>();
 //   private Deque<Integer> q2 = new ArrayDeque<>();
    Queue<Integer> que;
public static void main(String[] args) {
	StackImplementationUsingQueue stk=new StackImplementationUsingQueue();
	stk.push(1);stk.push(2);stk.pop();stk.push(4);stk.pop();stk.top();
}
/*
 * public void push(int x) { q2.offer(x); while (!q1.isEmpty()) {
 * q2.offer(q1.poll()); } Deque<Integer> q = q1; q1 = q2; q2 = q; }
 * 
 * public int pop() { return q1.poll(); }
 * 
 * public int top() { return q1.peek(); }
 * 
 * public boolean empty() { return q1.isEmpty(); }
 */
public StackImplementationUsingQueue() {
que=new LinkedList<>();

}
public void push(int x) {
que.add(x);
}
public int pop() {
	if(que.isEmpty()) {
		return -1;
	}
	for(int i=0;i<que.size()-1;i++) {
		que.add(que.poll());
	}
	return que.poll();
}
public int top() {
	if(que.isEmpty()) {
		return -1;
	}
	for(int i=0;i<que.size()-1;i++) {
		que.add(que.poll());
	}
	int topElement=que.poll();
	que.add(topElement);
	return topElement;
}
public boolean empty() {
	return que.isEmpty();
}
}   

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */