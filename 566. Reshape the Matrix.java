class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c>nums.length*nums[0].length) return nums;
        int[][] matrix=new int[r][c];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                matrix[(i*nums[i].length+j)/c][(i*nums[i].length+j)%c]=nums[i][j];
            }
        }
        return matrix;
    }
}