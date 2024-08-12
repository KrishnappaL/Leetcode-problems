package codes;

import java.util.Arrays;

public class PerfectSquare {

	public static void main(String[] args) {
		numSquares(12);
	}

	/*
	 * public static int numSquares(int n) { int[] dp = new int[n+1]; dp[0] = 0;
	 * dp[1] = 1;
	 * 
	 * for(int i=2; i<=n; i++) { int min = Integer.MAX_VALUE;
	 * 
	 * for(int j=1; j*j<=i; j++) { int rem = i-j*j; if(dp[rem] < min) { min =
	 * dp[rem]; } } dp[i] = min + 1; } return dp[n]; }
	 */	        public static int numSquares(int n) {
	            int m = (int) Math.sqrt(n);
	            int[][] f = new int[m + 1][n + 1];
	            
	            for (var g : f) {
	                Arrays.fill(g, 1 << 30);
	            }
	        
	            f[0][0] = 0;
	            for (int i = 1; i <= m; ++i) {
	                for (int j = 0; j <= n; ++j) {
	                    f[i][j] = f[i - 1][j];
	                    if (j >= i * i) {
	                        f[i][j] = Math.min(f[i][j], f[i][j - i * i] + 1);
	                    }
	                }
	            }
	            return f[m][n];
	        }
	    }
	

