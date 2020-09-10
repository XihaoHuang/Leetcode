class Solution {
    public int numFriendRequests(int[] ages) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:ages)
            map.put(a,map.getOrDefault(a,0)+1);
        for(Integer k1:map.keySet()){
            for(Integer k2:map.keySet()){
                if(k1>0.5*k2+7 && k1<=k2)
                count+=map.get(k1)*(map.get(k2)-((k1==k2)?1:0));
            }
        }
        return count;
    }
}