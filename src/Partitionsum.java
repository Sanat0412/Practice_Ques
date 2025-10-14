class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int a:nums)
        sum+=a;
        if(sum%2!=0)
        return false;
        Boolean[][] dp=new Boolean[n][sum];
        return solve(n-1,sum/2,nums,dp);
    }
    private static boolean solve(int ind,int target,int nums[],Boolean[][] dp)
    {
        if(ind==0)
        {
            if(nums[0]==target)
            {
                return true;
            }
            return false;
        }
        if(dp[ind][target]!=null)
        return dp[ind][target];
        boolean not_take=solve(ind-1,target,nums,dp);
        boolean take=false;
        if(target>=nums[ind])
        {
            take=solve(ind-1,target-nums[ind],nums,dp);
        }
        return dp[ind][target]=take || not_take;
    }
}
