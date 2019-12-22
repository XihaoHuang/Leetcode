class Solution {
     public int search(int[] nums, int target) {
        int from=0;
        int to=nums.length-1;
        while(from<=to){
            int mid=from+(to-from)/2;
            if(nums[mid]==target) return mid;
            if(nums[from]<=nums[mid]){
                if(nums[from]<=target && target<=nums[mid]){
                    to=mid-1;
                }else from=mid+1;
            } else{
                if(nums[mid]<=target && nums[to]>=target){
                    from=mid+1;
                }else to=mid-1;
            }
        
        }
         return -1;
     }
}
