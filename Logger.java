package codes;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	Map<String,Integer> map;
public Logger() {
	map =new HashMap<>(); 
}
	public static void main(String[] args) {
		Logger logger=new Logger();
		System.out.println(logger.shouldPrintMessage(10,"foo"));
		System.out.println(logger.shouldPrintMessage(5,"foo"));
		logger.shouldPrintMessage(2, "bar");
	}

	private boolean shouldPrintMessage(int timestamp, String message) {
		if(!map.containsKey(message)) {
			map.put(message, timestamp);
			return true;
		} else if(timestamp- map.get(message) >=10) {
			map.put(message, timestamp);
			return true;
		}
		return false;
	}

}
