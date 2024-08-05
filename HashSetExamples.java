package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
	//	int num[]= {4,1,2,1,2};
		//System.out.println(singleNumber(num));
		//isHappy(19);
		String[] str={"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(str);
	}
	    public static int singleNumber(int[] nums) {
	        int ans = 0;
	        for (int v : nums) {
	            ans ^= v;
	        }
	        return ans;
	    }
	    public int[] intersection(int[] nums1, int[] nums2) {
	        Set set=new HashSet<Integer>();
	        int arr[];
	        for(int i:nums1)
	            set.add(i);
	        HashSet<Integer> intersection=new HashSet<>();
	        for(int n: nums2){ 
	            if(set.contains(n))
	                intersection.add(n);
	        }
	        return intersection.stream().mapToInt(i->i).toArray();              
	    }
	    
	    public static boolean isHappy(int n) {
	        Set<Integer> vis = new HashSet<>();
	        while (n != 1 && !vis.contains(n)) {
	            vis.add(n);
	            int x = 0;
	            while (n != 0) {
	                x += (n % 10) * (n % 10);
	                n /= 10;
	            }
	            n = x;
	        }
	        return n == 1;
	    }
	        public static List<List<String>> groupAnagrams(String[] strs) {
	            Map<String, List<String>> d = new HashMap<>();
	            for (String s : strs) {
	                char[] t = s.toCharArray();
	                Arrays.sort(t);
	                String k = String.valueOf(t);
	                d.computeIfAbsent(k, key -> new ArrayList<>()).add(s);
	            }
	            return new ArrayList<>(d.values());
	       }
	    }
	
