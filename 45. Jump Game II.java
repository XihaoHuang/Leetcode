class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int step=0;
        int i=0;
        while(i<nums.length-1){
            if(i+nums[i]>=nums.length-1)
                return ++step;
            step++;
            i=findnextIndex(i,nums);
        }
        return step;
    }
    public int findnextIndex(int i,int[] nums){
        int nextindex=i+1;
        int value=nums[nextindex];
        for(int start=2;start<=nums[i];start++){
            value--;
            if(i+start<nums.length && nums[i+start]>=value){
                nextindex=i+start;
                value=nums[nextindex];
            }
        }
        return nextindex;
    }
}