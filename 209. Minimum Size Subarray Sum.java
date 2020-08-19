class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int i=0,start=0,min=Integer.MAX_VALUE,sum=0;
        while(i<nums.length){
            sum+=nums[i++];
            while(sum>=s){
                min=Math.min(min,i-start);
                sum-=nums[start++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}