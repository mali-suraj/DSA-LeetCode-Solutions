class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return possibleway(0,n,dp);
        
    }

    public int possibleway(int step,int n,int dp[]){
        if(step>n)return 0;

        if(step==n)return 1;
        if(dp[step]!=-1)return dp[step];

        int one=possibleway(step+1,n,dp);
        int two=possibleway(step+2,n,dp);
        return dp[step]=one+two;
    }
}