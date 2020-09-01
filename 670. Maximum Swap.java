class Solution {
    public int maximumSwap(int num) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        while(num>0){
            list.add(num%10);
            if(!map.containsKey(num%10)){
                map.put(num%10,list.size()-1);
            }
            num/=10;
        }
        for(int i=list.size()-1;i>=0;i--){
            int value=list.get(i);
            int swap=9;
            while(value<=swap ){
                if(map.containsKey(swap) && map.get(swap)<i){
                    list.set(i,swap);
                    list.set(map.get(swap),value);
                    break;
                }else{
                    swap--;
                }
            }
            if(list.get(i)!=value) break;
        }
        int res=0;
        for(int i=list.size()-1;i>=0;i--){
            res+=Math.pow(10,i)*list.get(i);
        }
        return res;
    }
}