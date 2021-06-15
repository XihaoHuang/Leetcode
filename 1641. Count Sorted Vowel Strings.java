class Solution {
    public int countVowelStrings(int n) {
        int[] dp=new int[5];
        dp[4]=1;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=1;
            for(int j=3;j>=0;j--){
                dp[j]+=dp[j+1];
                ans+=dp[j];
            }
        }
        return ans;
    }
}