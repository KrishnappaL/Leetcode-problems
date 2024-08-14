package code2;

import java.util.Arrays;
import java.util.Deque;

public class TargetSum {
	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1}; int target = 3;
	//	System.out.println((findTargetSumWaya(nums,target)));
		
	}
	    public static int findTargetSumWays(int[] nums, int target) {
	        int s = Arrays.stream(nums).sum();
	        if (s < target || (s - target) % 2 != 0) {
	            return 0;
	        }
	        int m = nums.length;
	        int n = (s - target) / 2;
	        int[][] f = new int[m + 1][n + 1];
	        f[0][0] = 1;f[0][1]=1;
	        for (int i = 1; i <= m; ++i) {
	            for (int j = 0; j <= n; ++j) {
	                f[i][j] = f[i - 1][j];
	                if (j >= nums[i - 1]) {
	                    f[i][j] += f[i - 1][j - nums[i - 1]];
	                }
	            }
	        }
	        return f[m][n];
	    }

}
