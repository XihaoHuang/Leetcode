class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                int value=map.get(n);
                map.put(n,value+1);
            }else{
                map.put(n,1);
            }
                if(map.get(n)>nums.length/3 && !list.contains(n)) list.add(n);
        }
        return list;
    }
}