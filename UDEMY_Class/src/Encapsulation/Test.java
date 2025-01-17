package Encapsulation;
import java.util.Scanner;

public class Test {

	
	 public int findLongestRepeatingSubsequence(String str) {
		 	int n = str.length();
	        int[][] dp = new int[n+1][n+1];
			
	        
	        for (int i=1; i<=n; i++)
	        {
	            for (int j=1; j<=n; j++)
	            {
	                if (str.charAt(i-1) == str.charAt(j-1) && i!=j)
	                    dp[i][j] =  1 + dp[i-1][j-1];
	                else
	                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
	            }
	        }
	        
	        
	        System.out.print(String.valueOf(dp[n][n]));
	        return n;
	    }


	
}
