class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        Integer[][] dp=new Integer[n][amount+1];
        for(int i=0;i<=amount;i++)
        {
            if((i%coins[0])==0)
            {
            dp[0][i]=1;
            }
            else
            {
                dp[0][i]=0;
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                int not_take=dp[i-1][j];
                int take=0;
                if(coins[i]<=j)
                {
                    take=dp[i][j-coins[i]];
                }
                dp[i][j]=take+not_take;
            }
        }
        
        return dp[n-1][amount];
        
    }
    private static int solve(int ind,int[] coins,int amount,Integer[][] dp)
    {
        if(ind==0)
        {
            
            if((amount%coins[ind])==0)
            return 1;
            else 
            return 0;
        }
        if(dp[ind][amount]!=null) return dp[ind][amount];
        int not_take=solve(ind-1,coins,amount,dp);
        int take=0;
        if(coins[ind]<=amount)
        {
            take=solve(ind,coins,amount-coins[ind],dp);
        }
        return dp[ind][amount]=take+not_take;
    }
}
