class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map=new HashSet<Integer>();
        for(int n:nums) map.add(n);
        int max=0;
        for(int n:nums){
            int sum=1;
            int val=n+1;
            while(map.contains(val++))
                sum++;
            max=Math.max(max,sum);
        }
        return max;
    }
    
}