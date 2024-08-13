package code2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackImplementation {
	/*
	 * int[] data=new int[5]; int j=0; int size=0; List<Integer> list=new
	 * ArrayList()<>(); public static void main(String[] args) { StackImplementation
	 * stack=new StackImplementation(); stack.push(5); stack.push(4); stack.pop(); }
	 * private void pop() { int val=size; data[val--]; } private void push(int val)
	 * { data[j++]=val; size++; }
	 */
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();

		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		if(!stack.isEmpty()) {
			System.out.println("not empty");
		}
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println("stack size"+stack.size());
		
	}
	}

