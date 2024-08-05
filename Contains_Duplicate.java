package codes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Contains_Duplicate {
	static int nums[] = {1,2,3,1,2,3};
	static int k = 2;
	public static void main(String[] args) {
	//	boolean s=containsNearbyDuplicate(nums,k);
	//	numJewelsInStones("aA","aAAAbb");
	//	longest("abcbca");
	//int[] num1 = {1,2}, num2 = {-2,-1}, num3 = {-1,2}, num4 = {0,2};
		//fourSumCount(num1,num2,num3,num4);
		//int []nums= {1,1,1,2,2,3};
		int k=2;		int []nums= {1,2,2,3,3};

	int arr[]=topKFrequent(nums,k);
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+" ");
	}
	    public static int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> cnt = new HashMap<>();
	        for (int x : nums) {
	            cnt.merge(x, 1, Integer::sum);
	        }
	        PriorityQueue<Map.Entry<Integer, Integer>> pq
	            = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
	        for (var e : cnt.entrySet()) {
	            pq.offer(e);
	            if (pq.size() > k) {
	                pq.poll();
	            }
	        }
	        return pq.stream().mapToInt(Map.Entry::getKey).toArray();
	    }
	
	    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
	        Map<Integer, Integer> cnt = new HashMap<>();
	        for (int a : nums1) {
	            for (int b : nums2) {
	                cnt.merge(a + b, 1, Integer::sum);
	            }
	        }
	        int ans = 0;
	        for (int c : nums3) {
	            for (int d : nums4) {
	                ans += cnt.getOrDefault(-(c + d), 0);
	            }
	        }
	        return ans;
	    }
			    public static boolean containsNearbyDuplicate(int[] nums, int k) {
	        Map<Integer, Integer> d = new HashMap<>();
	        for (int i = 0; i < nums.length; ++i) {
	            if (Math.abs(i - d.getOrDefault(nums[i], -1000000)) <= k) {
	                return true;
	            }
	            d.put(nums[i], i);
	        	//System.out.println(d.getOrDefault(nums[i],-1000000));

	        }
	        return false;
	    }
		 // O(S + J)time
		 // O(math.max(J,S))space
		 public static int numJewelsInStones(String J, String S) {
		     if (J == null || J.length() == 0) {
		         return 0;
		     }
		     int res = 0;
		     Map<Character, Character> map =  new HashMap<>();
		     char[] jArr = J.toCharArray();
		     for (char c : jArr) {
		         map.put(c,c);
		     }
		     char[] sArr = S.toCharArray();
		     for (char c : sArr) {
		         if (map.containsKey(c)) {
		             res++;
		         }
		     }
		     return res;
		 }
		 public static void longest(String input) {
			    int maxCnt = 0;
			if (input == null || input.length() == 0) {
			      return;
			    }
			  HashMap<Character, Integer> hm = new HashMap<>();
			    int start = 0;
			for (int i = 0; i < input.length(); i++) {
			      char ch = input.charAt(i);
			      if (hm.containsKey(ch)) {
			        maxCnt = Math.max(maxCnt, i - start);
			        start = Math.max(start, hm.get(ch) + 1);
			      }
			 hm.put(ch, i);
			    }
			    maxCnt = Math.max(maxCnt, input.length() - start);
			System.out.println( maxCnt);
			 
}
}
