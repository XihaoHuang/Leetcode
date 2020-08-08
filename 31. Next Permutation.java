public class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                int j = nums.length - 1;
                for (; j >= i; j--) if (nums[j] > nums[i]) break;
                System.out.print("1."+j+Arrays.toString(nums));
                swap(nums, i, j);
                System.out.print("2."+Arrays.toString(nums));
                i++; j = nums.length - 1;
                while(i < j){
                swap(nums, i++, j--);
                System.out.print("3."+Arrays.toString(nums));    
                }
                return;
            }
        }
        int i = 0; int j = nums.length - 1;
        while(i < j){
        swap(nums, i++, j--);
        System.out.print("4."+Arrays.toString(nums));    
        } 
    }
    
    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}