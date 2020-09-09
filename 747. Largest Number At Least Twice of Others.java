class Solution {
    public int dominantIndex(int[] nums) {
        int first=0;
        int second=0;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                second=first;
                first=nums[i];
                index=i;
            }else if(nums[i]<first && nums[i]>second){
                second=nums[i];
            }
        }
        if(first>=second*2)
        return index;
        else return -1;
    }
}