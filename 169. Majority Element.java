class Solution {
    public int majorityElement(int[] nums) {
        int me=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.replace(nums[i],map.getOrDefault(nums[i],map.get(nums[i])) + 1);

            }else{
                map.put(nums[i],1);
            }

        }
        for(int key:map.keySet()){
            if(map.get(key)>(nums.length/2)){
                me=key;
                break;   
            }
        }
        return me;
    }
}