class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int[] res=new int[k];
        int n=res.length;
        for(int i=nums.length-1;i>=0;i--){
            if(--n>=0){
                res[n]=nums[i];
            }else{
                nums[i+k]=nums[i];
            }
        }
    for(int i=0;i<res.length;i++){
        nums[i]=res[i];
    }
    }
}