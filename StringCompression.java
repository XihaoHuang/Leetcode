class Solution {
    public int compress(char[] chars) {
        if(chars.length<2) return chars.length;
        int i=0;
        int j=0;
        int n=0;
        while(j<=chars.length){
            while(j<chars.length && chars[j]==chars[i])
                j++;
            int count=j-i;
            chars[n++]=chars[i]; 
            if(count>1){
                if(count>=10) chars[n++]=(char)(count/10+'0');
                chars[n++]=(char)(count%10+'0'); 
            }
            i=j;
            j++;
        }
        return n;
    }
}