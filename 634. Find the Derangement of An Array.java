class Solution {
    public int findDerangement(int n) {
        if(n==1) return 0; 
        long[] dp=new long[n+1];
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2])%(int)(Math.pow(10,9)+7);
        }
        return (int)dp[n];
    }
}