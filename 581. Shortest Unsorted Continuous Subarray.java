class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start=nums.length-1;
        int end=0;
        int min=nums[start];
        int max=nums[end];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max){
                end=i;
            }else{
                max=nums[i];
            }
            if(nums[nums.length-1-i]>min){
                start=nums.length-i-1;
            }else{
                min=nums[nums.length-i-1];
            }
                   
        }
        return end>start? end-start+1:0;
    }
}