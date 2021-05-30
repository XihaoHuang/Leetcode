class Solution {
    public boolean checkValidString(String s) {
        int min=0,max=0;
        for(char c:s.toCharArray()){
            if(c=='(')
                min++;
            else
                min--;
            if(c==')')
                max--;
            else
                max++;
            if(max<0) return false;
            min=Math.max(0,min);
        }
        return min==0;
    }
}