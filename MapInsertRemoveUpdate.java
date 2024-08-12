package codes;

import java.util.*;

public class MapInsertRemoveUpdate {

	private Random rnd = new Random();
	Map<Integer, Integer> d = new HashMap<>();
	List<Integer> q = new ArrayList<>();

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Your RandomizedSet object will be instantiated and called as such:
		MapInsertRemoveUpdate obj = new MapInsertRemoveUpdate();
		int val = 2;
		obj.insert(val);
		obj.remove(val);
		obj.getRandom();
	}

	public boolean insert(int val) {

		if (d.containsKey(val)) {
			return false;
		}
		d.put(val, q.size());
		q.add(val);
		return true;
	}

	public boolean remove(int val) {

		if (!d.containsKey(val)) {
			return false;
		}
		int i = d.get(val);
		d.put(q.get(q.size() - 1), i);
		q.set(i, q.get(q.size() - 1));
		q.remove(q.size() - 1);
		d.remove(val);
		return true;
	}

	public void getRandom() {

		System.out.println(q.get(rnd.nextInt(q.size())));
	}

}
