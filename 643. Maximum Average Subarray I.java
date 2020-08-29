class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=-Double.MAX_VALUE;
        double res=0;
        for(int i=0;i<nums.length;i++){
                res+=nums[i];            
            if(i>=k){
                res-=nums[i-k];
            }
            if(i>=k-1)
                max=Math.max(max,res);
        }
        return max/1.0/k;
    }
}