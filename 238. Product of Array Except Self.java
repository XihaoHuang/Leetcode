class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int n=-1;
        while(set.contains(++n)){
        }
        return n;
    }
}