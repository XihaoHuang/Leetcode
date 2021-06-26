class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
            map.put(n,map.getOrDefault(n,0)+1);
        int max=-1;
        for(int k:map.keySet()){
            if(map.get(k)==1 && k>max)
                max=k;
        }
        return max;
    }
}