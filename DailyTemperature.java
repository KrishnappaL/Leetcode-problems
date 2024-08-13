package code2;

import java.util.Stack;

class DailyTemperature {
	public static void main(String[] args) {
		int temperature[]= {73,74,75,71,69,72,76,73};
		int arr[]=dailyTemperatures(temperature);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	    public static int[] dailyTemperatures(int[] temperatures) {
	        int n = temperatures.length;
	        int[] ans = new int[n];
	        Stack<Integer> stk = new Stack<>();
	        for (int i = 0; i < n; ++i) {
	            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {
	                int j = stk.pop();
	                ans[j] = i - j;
	            }
	            stk.push(i);
	        }
	        return ans;
	    }
	}
