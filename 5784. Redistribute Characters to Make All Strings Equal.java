class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        int n=words.length;
        for(String s:words){
            for(Character c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
                count++;
            }
        }
        if(count%n!=0) return false;
        for(Character c: map.keySet())
            if(map.get(c)%n!=0) return false;
        return true;
    }
}