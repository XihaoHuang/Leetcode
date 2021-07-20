class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++)
            nums[i]+=nums[i-1];
        for(int i=0;i<n;i++){
            if(nums[i]==goal) count++;
            for(int j=0;j<i;j++){
                if(nums[i]-nums[j]==goal)
                    count++;
                else if(nums[i]-nums[j]<goal)
                    break;
            }
        }
        return count;
    }
}