class Solution {
    int[] nums;
    public Solution(int[] nums) {
        this.nums=nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i]=nums[i];
        Random ran=new Random();
        for(int i=0;i<nums.length;i++){
            int r=ran.nextInt(nums.length);
            int temp=arr[r];
            arr[r]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */