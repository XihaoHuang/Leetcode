class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]==0){
                movetoend(nums,start,end);
                end--;
            }else{
                start++;
            }
        }
    }
    public void movetoend(int[] n,int start,int end){
        for(int i=start;i<end;i++){
            n[i]=n[i+1];
        }
        n[end]=0;
    }
}