class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        backtrack(list,new ArrayList<Integer>(),nums,0);
        return list;
    }
    public void backtrack(List<List<Integer>> list,ArrayList<Integer> al,int[] nums,int start){
        if(al.size()<=nums.length && !list.contains(al)){
            list.add(new ArrayList<Integer>(al));
        }
        for(int i=start;i<nums.length;i++){
            int index;
            for(index=0;index<al.size();index++){
                if(al.get(index)>=nums[i]) break;
            }
                al.add(index,nums[i]);
            backtrack(list,al,nums,i+1);
            al.remove(index);
        }
    } 
}