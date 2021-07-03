class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[j][j]=1;
            for(int i=j-1;i>=0;i--){
                if(s.charAt(i)==s.charAt(j) && (dp[i+1][j-1]==1 || i==j-1)){
                    dp[i][j]++;
                }
            }
        }
        int sum=0;
        for(int[] i:dp)
            for(int j:i)
                sum+=j;
        return sum;
    }
}