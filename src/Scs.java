class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        
        int i=n;
        int j=m;
        String ans="";
        while(i>0 && j>0)
        {
            if(str1.charAt(i-1)==str2.charAt(j-1))
            {
                ans=str1.charAt(i-1)+ans;
                i--;
                j--;
                
            }
            else if(dp[i-1][j]>dp[i][j-1])
            {
                ans=str1.charAt(i-1)+ans;
                i--;
            }
            else
            {
                ans=str2.charAt(j-1)+ans;
                j--;
            }
        }
        
        while(i>0)
        {
            ans=str1.charAt(i-1)+ans;
            i--;
        }
        while(j>0)
        {
            ans=str2.charAt(j-1)+ans;
            j--;
        }
        
        return ans;
        
    }
}
