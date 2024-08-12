package codes;

import java.util.ArrayList;
import java.util.List;

public class Queue {
	List<Integer> data;
	int head;
	Queue(){
		data=new ArrayList<>();
		head=0;
	}
public static void main(String[] args) {
	Queue q=new Queue();
	q.enQueue(3);
	//
	//q.enQueue(8);
	//q.enQueue(5);
	if(q.isEmpty()==false) {
		System.out.println(q.front());
	}
	q.deQueue();
	if(q.isEmpty()==false) {
		System.out.println(q.front());
	}
}

private boolean deQueue() {
	if(isEmpty()==true) return false;
	head=head++;
	return true;
	
}

private int front() {
	return data.get(head);
	 
}

private boolean isEmpty() {
	// TODO Auto-generated method stub
	return head >= data.size();
}

private boolean enQueue(int i) {
	data.add(i);
	return true;
}
}
