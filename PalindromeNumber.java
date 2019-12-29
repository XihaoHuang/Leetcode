class Solution {
    public int strStr(String haystack, String needle) {
       if( haystack== null || needle==null || needle.length()==0) return 0;
       
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int a=i;
             
            for(int j=0;j<needle.length();j++){
            
                if(haystack.charAt(a)==needle.charAt(j)){
                    if(j==needle.length()-1)
                        return i;
                    a++;
                }else{
                    break;
                }
            }
        }
        return -1;
    }
}