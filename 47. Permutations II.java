class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(nums.length==0) return list;
        Arrays.sort(nums);
        boolean[] mark=new boolean[nums.length];
        premute(list,nums,mark,new ArrayList());
        return list;
    }
    public void premute(List<List<Integer>> list,int[] nums,boolean[] mark,List<Integer> al){
        if(al.size()==nums.length){
            list.add(new ArrayList(al));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(mark[i]) continue;
            if(i>0 && nums[i-1]==nums[i] && !mark[i-1]) continue;
            mark[i]=true;
            al.add(nums[i]);
            premute(list,nums,mark,al);
            mark[i]=false;
            al.remove(al.size()-1);
        }
    }
}