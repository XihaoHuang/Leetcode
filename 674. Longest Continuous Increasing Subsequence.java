class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int max=1;
        int i=1;
        while(i<nums.length){
            int length=1;
            while(i<nums.length && nums[i]>nums[i-1]){
                i++;
                length++;
            }
            max=Math.max(max,length);
            i++;
        }
        return max;
    }
}