class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(0,0);
        for(int i=0;i<profit.length;i++){
            map.put(difficulty[i],Math.max(profit[i],map.getOrDefault(difficulty[i],0)));
        }
        int max=0;
        for(Integer key:map.keySet()){
            max=Math.max(max,map.get(key));
            map.put(key,max);
        }
        int ans=0;
        for(int i:worker){
            System.out.println(map.floorKey(i));
            ans+=map.get(map.floorKey(i));
        }
        return ans;
    }
}