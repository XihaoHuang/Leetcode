class Solution {
    public boolean canWin(String c) {
        if(c==null && c.length()==1)
            return false;
        for(int i=1;i<c.length();i++){
            if(c.charAt(i)=='+' && c.charAt(i-1)=='+' && ! canWin(c.substring(0,i-1)+"--"+c.substring(i+1)))
                return true;
        }
        return false;
    }
}