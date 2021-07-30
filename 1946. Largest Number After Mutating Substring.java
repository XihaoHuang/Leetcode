class Solution {
    public String maximumNumber(String num, int[] change) {
        int n=num.length();
        char[] ans=num.toCharArray();
        for(int i=0;i<n;i++){
            if(ans[i]-'0'<change[ans[i]-'0']){
                while(i<n && ans[i]-'0'<=change[ans[i]-'0']){
                    ans[i]=(char)(change[ans[i]-'0']+'0');
                    i++;
                }               
                break;
            }
        }
        return new String(ans);

    }
}