class Solution {
    public int pathSum(int[] nums) {
        int[][] path=new int[5][9];
        int res=0;
        for(int i=nums.length-1;i>=0;i--){
            int d=nums[i]/100;
            int p=nums[i]/10%10;
            int v=nums[i]%10;
            if(path[d][p]==0) path[d][p]=1;
            path[d-1][(p+1)/2]+=path[d][p];
            res+=v*path[d][p];
        }
        return res;
    }
}