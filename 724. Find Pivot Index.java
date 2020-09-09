class Solution {
    public int pivotIndex(int[] nums) {
        int total=0,value=0;
        for(int n:nums) total+=n;
        for(int i=0;i<nums.length;i++){
            if(value*2==total-nums[i]) return i;
            value+=nums[i];

        }
        return -1;
    }
}
