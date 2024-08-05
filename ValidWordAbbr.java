package codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ValidWordAbbr {
    Map<String, Set<String>> d = new HashMap<>();

	public static void main(String[] ar) {
String dictionary[]= {"deer", "door", "cake", "card"};
// Your ValidWordAbbr object will be instantiated and called as such:
  ValidWordAbbr obj = new ValidWordAbbr(dictionary);
  boolean param_1 = obj.isUnique("dear");
  System.out.println(param_1);
 
	}
    public ValidWordAbbr(String[] dictionary) {

        for (var s : dictionary) {
            d.computeIfAbsent(abbr(s), k -> new HashSet<>()).add(s);
        }
    }

    public boolean isUnique(String word) {
        var ws = d.get(abbr(word));
        return ws == null || (ws.size() == 1 && ws.contains(word));
    }

    private String abbr(String s) {
        int n = s.length();
        return n < 3 ? s : s.substring(0, 1) + (n - 2) + s.substring(n - 1);
    }
}
