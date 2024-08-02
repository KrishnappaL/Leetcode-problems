package codes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Longest_Substring {

	public static void main(String[] args) {
		//lengthOfLongestSubstring("abcbwrt");
		//removeAdjacentDuplicates("abbcbaw");
		//findDuplicateCharacterInString("Butterbeer");
		//firstUniqueCharacter("adsfds");
		int[] nums1= {1,2,3,4};
		int nums2[]= {2,3};
		intersect(nums1,nums2);
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
		 Map<Integer, Integer> map = new HashMap<>();
		    //put first array to map
		    for (int i = 0; i < nums1.length; i++) {
		        if (!map.containsKey(nums1[i])) {
		            map.put(nums1[i], 1);
		        } else {
		            map.put(nums1[i], map.get(nums1[i]) + 1);
		        }
		    }
		ArrayList<Integer> result=new ArrayList<>();
		    //check all value in array two
		    for (int i = 0; i < nums2.length; i++) {
		        //if exist and value>1  then decrement value
		        //if value is 1 remove from map
		        if (map.containsKey(nums2[i])) {
		            result.add(nums2[i]);
		            if (map.get(nums2[i]) > 1) {
		                map.put(nums2[i], map.get(nums2[i]) - 1);
		            } else {
		                map.remove(nums2[i]);
		            }
		        }
		    }
	        return result.stream().mapToInt(Integer :: intValue).toArray();
	}
	
	 private static int firstUniqueCharacter(String s) {
		// TODO Auto-generated method stub

	        int maxIndexForRepeatedValues = 100000;
	        Map<Character, Integer> map = new HashMap<>();

	        for (int i = 0 ; i < s.length() ; i++) {

	            char key = s.charAt(i);
	            int resIndex = map.containsKey(key) ? maxIndexForRepeatedValues : i;
	            map.put(key, resIndex);

	        }

	        int minIndex = Collections.min(map.values());
	        return minIndex == maxIndexForRepeatedValues ? -1 : minIndex;
	}
	static void findDuplicateCharacterInString(String s){
	 Map <Character, Integer> map = new HashMap();
	    
	    String str = "ButterBeer";
	    
	    //if key already exists, we increment value by 1, else we set value = 1
	    for(char c: str.toCharArray()){
	      String newstr=" ";
		if (map.containsKey(c))
	        map.put(c, map.get(c) + 1);
	      else
              newstr=newstr+c;
	        map.put(c, 1);
	    }
	       //iterate through hashmap
	    Iterator <Map.Entry<Character, Integer>> entries = map.entrySet().iterator();
	    while (entries.hasNext()){
	      Map.Entry <Character, Integer> entry = entries.next();
	      if (entry.getValue() > 1)
	        System.out.println(entry.getKey() + " - " + entry.getValue());
	    }
	}
	private static String removeAdjacentDuplicates(String string) {
		StringBuilder sb=new StringBuilder();
	for( char c :string.toCharArray()) {
		if(sb.length()>0 && sb.charAt(sb.length()-1)==c) {
			sb.deleteCharAt(sb.length()-1);
		}
		else sb.append(c);
			
	}
	return sb.toString();
	}
	public static void lengthOfLongestSubstring(String s) {
		boolean[] ss = new boolean[120];
        int ans = 0;
        for (int i = 0, j = 0; j < s.length(); ++j) {
            char c = s.charAt(j);
            while (ss[c]) {
                ss[s.charAt(i++)] = false;
            }
            ss[c] = true;
            ans = Math.max(ans, j - i + 1);
        }
        System.out.println( ans);
    }

}
