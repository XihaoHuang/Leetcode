class Solution {
    public int findSubstringInWraproundString(String p) {
        int n=p.length();
        int[] dp=new int[26];
        int ans=0,count=1;
        for(int i=0;i<n;i++){
            if(i>0 && (p.charAt(i)-p.charAt(i-1)==1 || p.charAt(i)+25==p.charAt(i-1))){
                count++;
            }else{
                count=1;
            }
            int c=p.charAt(i)-97;
            dp[c]=Math.max(dp[c],count);
        }
        for(int i: dp)
            ans+=i;
        return ans;
    }
}