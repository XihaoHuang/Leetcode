class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int total=0,op=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                op++;
            }
            total+=op;
        }
        return total;
    }
}