class Solution {
   public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> List=new ArrayList<>();
        backtrack(List,new ArrayList(),k,n,1);
        return List;
    }
    private void backtrack(List<List<Integer>> List,List<Integer> L1,int k,int n,int start){
        if(n<0 || L1.size()>k) return;
        else if(L1.size()==k && n==0) List.add(new ArrayList(L1));
        else{
            for(int i=start;i<10 ;i++){
                L1.add(i);
                backtrack(List,L1,k,n-i,i+1);
                L1.remove(L1.size()-1);
            } 
        }
    }
}