class RandomizedSet {
    List<Integer> list;
    Set<Integer> set;
    /** Initialize your data structure here. */
    int size;
    Random ran;
    public RandomizedSet() {
        list=new ArrayList<>();
        set=new HashSet<>();
        ran=new Random();
        size=0;
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        set.add(val);
        list.add(val);
        size++;
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!set.contains(val)) return false;
        set.remove(val);
        for(int i=0;i<size;i++){
            if(list.get(i)==val){
                list.remove(i);
                break;
            }
        }
        size--;
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(ran.nextInt(size));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */