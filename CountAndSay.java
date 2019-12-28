class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        
        String s=countAndSay(n-1);
        char[] c=s.toCharArray();
        StringBuilder value=new StringBuilder();
        int j=0;
        int count=0;
        for(int i=0;i<=c.length;i++){
            if(i<c.length && c[i]==c[j]){
                count++;
            }else{
                value.append(count).append(c[j]);
                j=i;
                count=1;
            }
        }
        return value.toString();
    }

}