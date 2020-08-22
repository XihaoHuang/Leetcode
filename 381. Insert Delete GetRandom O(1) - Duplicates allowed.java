class RandomizedCollection {
    ArrayList<Integer> al;
    Map<Integer,Integer> map;
    int size;
    Random ran;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        al=new ArrayList<>();
        map=new HashMap<>();
        size=0;
        ran=new Random();
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        al.add(val);
        size++;
        if(map.containsKey(val)){
            int value=map.get(val);
            map.put(val,value+1);
            return false;
        }
        map.put(val,1);
        return true;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int value=map.get(val);
        value--;
        if(value==0){
            map.remove(val);
        }else{
            map.put(val,value);
        }
        for(int i=0;i<size;i++){
            if(al.get(i)==val){
                al.remove(i);
                size--;
                break;
            }
        }
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return al.get(ran.nextInt(size));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */