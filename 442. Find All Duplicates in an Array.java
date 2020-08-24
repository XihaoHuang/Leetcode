class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int n:nums){
            if(map.containsKey(n)){
                int value=map.get(n);
                if(value<2)
                    list.add(n);
                
                map.put(n,value+1);
            }else{
                map.put(n,1);
            }
        }
        return list;
    }
}