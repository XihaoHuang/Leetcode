class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i=S.length()-1,j=T.length()-1;
        int count1=0,count2=0;
        while(i>=0 || j>=0){
            while(i>=0 && (S.charAt(i)=='#' || count1>0)){
                if(S.charAt(i)=='#')
                    count1++;
                else
                    count1--;
                i--;
            }
            while(j>=0 && (T.charAt(j)=='#' || count2>0)){
                if(T.charAt(j)=='#')
                    count2++;
                else
                    count2--;
                j--;
            }
            if(i>=0 && j>=0 && S.charAt(i)==T.charAt(j)){
                i--;
                j--;
            }else
                return i==-1 && j==-1;
        }
        return true;
    }
}