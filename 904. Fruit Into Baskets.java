class Solution {
    public int totalFruit(int[] tree) {
        int first=-1;
        int second=-1;
        int lastcount=0;
        int max=0;
        int res=0;
        for(int fruit:tree){
            if(fruit==first || fruit==second){
                max++;
            }else{
                max=lastcount+1;
            }
            if(fruit==second){
                lastcount++;
            }else{
                lastcount=1;
                first=second;
                second=fruit;
            }
            res=Math.max(res,max);
        }
        return res;
    }
}