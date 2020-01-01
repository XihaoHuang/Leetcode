class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> List=new ArrayList<>();
        backtrack(List,new ArrayList(),candidates,target,0);
        return List;
    }
    private void backtrack(List<List<Integer>> List, List<Integer> L1,int[] c,int target,int first){
    if(target<0) return;
    else if(target==0){
        Collections.sort(L1);
         if(!List.contains(L1))
            List.add(new ArrayList(L1));
    }        
    else{
        for(int i=first;i<c.length;i++){
            L1.add(c[i]);
            backtrack(List,L1,c,target-c[i],i+1);
            L1.remove(Integer.valueOf(c[i]));
        }
    }
    }
}
-------------------------------
fix speed
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> List=new ArrayList<>();
        backtrack(List,new ArrayList(),candidates,target,0);
        return List;
    }
    private void backtrack(List<List<Integer>> List, List<Integer> L1,int[] c,int target,int first){
    if(target<0) return;
    else if(target==0){
            List.add(new ArrayList(L1));
    }        
    else{
        for(int i=first;i<c.length;i++){
            if(i>first && c[i]==c[i-1]) continue;
            L1.add(c[i]);
            backtrack(List,L1,c,target-c[i],i+1);
            L1.remove(Integer.valueOf(c[i]));
        }
    }
    }
}

