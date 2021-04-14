class Solution {
    public int wiggleMaxLength(int[] nums) {
        int pos=1,neg=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>0)
                pos=neg+1;
            if(nums[i]-nums[i-1]<0)
                neg=pos+1;
        }
        return Math.max(pos,neg);
    }
}