class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] MinMax={-1,-1};
        MinMax[0]=findMinMax(nums,target,true);
        MinMax[1]=findMinMax(nums,target,false);
        return MinMax;
    }
    public int findMinMax(int[] nums,int target,boolean left){
        int ans=-1;
        int from=0;
        int to=nums.length-1;
        while(from<=to){
            int mid=(from+to)/2;
            if(nums[mid]>target){
                to=mid-1;
            }
            else if(nums[mid]<target){
                from=mid+1;
            }
          else{
            if(left){
                to=mid-1;
                ans=mid;
            }
            else{
                from=mid+1;
                ans=mid;
            }
          }
        }
        return ans;
    }
}