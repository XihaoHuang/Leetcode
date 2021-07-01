class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0,n=nums.length,ans=0;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                ans+=++count;                
            }else{
                count=0;
            }
        }
        return ans;
    }
}