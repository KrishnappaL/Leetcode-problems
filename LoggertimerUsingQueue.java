package codes;

import java.util.*;

public class LoggertimerUsingQueue {
	List queue; Set s;
public LoggertimerUsingQueue() {
	 queue=new LinkedList<>();
	 s=new HashSet<>();
}
	public static void main(String[] args) {
		LoggertimerUsingQueue l=new LoggertimerUsingQueue();
		l.shouldPringMessage( 10, "foo");
	}
	private boolean shouldPringMessage(int timestamp, String message) {
		trimQueue(timestamp);
		if(!s.contains(message)) {
			s.add(message);
			queue.offer(new Pair<>(message,timestamp));
			return true;
		}
		return false;
	}
	private void trimQueue(int timestamp) {
		while(!queue.isEmpty()) {
			Pair<String,Integer> task=queue.peek();
			if(timestamp - task.getValue()<10) break;
			s.remove(task.getKey());
		}
	}


}
