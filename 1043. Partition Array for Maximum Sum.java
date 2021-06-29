class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            int max=Integer.MIN_VALUE;
            for(int f=1;f<=k && i>=f;f++){
                max=Math.max(max,arr[i-f]);
                dp[i]=Math.max(dp[i],dp[i-f]+max*f);
            }
        }
        return dp[n];
    }
}