class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<speed.length;i++){
            map.put(target-position[i],speed[i]);
        }
        int fleet=0;
        double a=-1.0;
        for(int k : map.keySet()){
            double time=1.0*k/map.get(k);
            if(time>a){
                fleet++;
                a=time;
            }
        }
        return fleet;
    }
}