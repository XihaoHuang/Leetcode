class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int count=0;
        int res=1;
        for(int i=0,j=0;i<nums.length;i++){
            res*=nums[i];
            while(j<=i && res>=k)
                res/=nums[j++];
            count+=i-j+1;
        }
        return count;
    }
}