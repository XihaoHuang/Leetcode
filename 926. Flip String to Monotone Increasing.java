class Solution {
    public int minFlipsMonoIncr(String s) {
        if(s==null) return 0;
        int flipcount=0,onecount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(onecount==0)
                    continue;
                else
                    flipcount++;
            }else{
                onecount++;
            }
            flipcount= flipcount>onecount? onecount:flipcount;
        }
    return flipcount;
    }
}