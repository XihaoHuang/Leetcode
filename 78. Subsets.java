class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
		subset(list,new ArrayList<Integer>(),nums,0);
		return list;
	}

	private void subset(List<List<Integer>> list, ArrayList<Integer> al, int[] nums, int start) {
		if(al.size()<=nums.length)
			list.add(new ArrayList<Integer>(al));
		for(int i=start;i<nums.length;i++) {
			al.add(nums[i]);
			subset(list,al,nums,i+1);
			al.remove(al.size()-1);
			}
	}

}