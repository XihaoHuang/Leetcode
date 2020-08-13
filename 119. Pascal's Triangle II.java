class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp=new int[triangle.size()];
        dp[0]=triangle.get(0).get(0);
        if(triangle.size()==1) return dp[0];
        return findmin(triangle,dp,1);

    }
    public int  findmin(List<List<Integer>> tr,int[] dp,int row){
        List<Integer> al=new ArrayList<>();
        al=tr.get(row);
        int left=dp[0],right;
        dp[0]+=al.get(0);
        for(int c=1;c<row;c++){
            right=dp[c];
            dp[c]=Math.min(left,right)+al.get(c);
            left=right;
        }
        dp[row]=left+al.get(row);
        // System.out.println(Arrays.toString(dp));
        if(row==tr.size()-1){
            int res=dp[0];
            for(int i=1;i<dp.length;i++){
                res=Math.min(res,dp[i]);
            }
            return res;
        }
    return findmin(tr,dp,row+1);
    }
}