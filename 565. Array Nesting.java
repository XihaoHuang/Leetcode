class Solution {
    public int arrayNesting(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int start=i;
            boolean[] check=new boolean[nums.length];
            while(!check[start]){
                count++;
                check[start]=true;
                start=nums[start];
            }
            max=(max>count) ? max : count;
        }
        return max;
    }
}