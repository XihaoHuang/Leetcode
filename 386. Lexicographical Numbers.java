class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>(n);
        lexorder(n,list,0);
        return list;
    }
    public void lexorder(int n,List<Integer> list,int prefix){
        int start= prefix==0 ? 1 : 0;
        for(int i=start;i<10;i++){
            int val=prefix*10+i;
            if(val<=n){
                list.add(val);
                if(val*10<=n)
                    lexorder(n,list,val);
            }else{
                return;
            }
        }
    }
}