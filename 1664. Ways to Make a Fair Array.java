class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;int[] left=new int[2];int[] right=new int[2];
        for(int i=0;i<n;i++)
            right[i%2]+=nums[i];
        int count=0;
        for(int i=0;i<n;i++){
            right[i%2]-=nums[i];
            if(left[0]+right[1]==left[1]+right[0])
                count++;
            left[i%2]+=nums[i];
        }
        return count;
    }
}