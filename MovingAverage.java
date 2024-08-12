package codes;

import java.util.ArrayList;
import java.util.LinkedList;

public class MovingAverage {

    int capacity;
    double sum;
	private LinkedList<Integer> queue;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.queue = new LinkedList<Integer>();
        this.capacity = size;
        this.sum = 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingAverage m=new MovingAverage(3);
	 m.next(1); 
	 m.next(10); 
	 m.next(3); 
	 m.next(5);
	}

    
    public double next(int val) {
        if(queue.size() == capacity){
            sum -= queue.poll();
        }
        sum += val;
        queue.offer(val);
        return sum / queue.size();
    }
}
