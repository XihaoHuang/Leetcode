class Solution {
    int count;
    public int findTargetSumWays(int[] nums, int target) {
        count=0;
        backtrack(nums,target,0,0);
        return count;
    }
    public void backtrack(int[] nums,int target,int i,int sum){
        int n=nums.length;
        if(i==n){
            if(sum==target)
                count++;
            return;
        } 
        backtrack(nums,target,i+1,sum+nums[i]);
        backtrack(nums,target,i+1,sum-nums[i]);
    }
}