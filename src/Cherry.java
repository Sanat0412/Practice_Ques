class Solution {
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][][]=new int[n][m][m];
        for(int[][] t:dp)
        {
            for(int[] r:t)
            {
                Arrays.fill(r,-1);
            }
        }
        return solve(0,0,m-1,n,m,grid,dp);
        
    }

    private static int solve(int i,int j1,int j2,int n,int m,int[][] grid,int[][][] dp)
    {
        if(j1<0 || j2<0 || j1>=m || j2>=m)
        {
            return (int)-1e9;
        }
        if(i==n-1)
        {
            if(j1==j2)
            {
                return grid[i][j1];
            }
            else
            {
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1)
        {
            return dp[i][j1][j2];
        }
        int maxi=Integer.MIN_VALUE;
        
            for(int d1=-1;d1<=1;d1++)
            {
                for(int d2=-1;d2<=1;d2++)
                {
                    int ans=0;
                    if(j1==j2)
                    {
                        ans=grid[i][j1]+solve(i+1,d1+j1,d2+j2,n,m,grid,dp);
                    }
                    else
                    {
                    ans=grid[i][j1]+grid[i][j2]+solve(i+1,d1+j1,d2+j2,n,m,grid,dp);

                    }
                    maxi=Math.max(maxi,ans);
                }
            }
        return dp[i][j1][j2]=maxi;
    }
}
