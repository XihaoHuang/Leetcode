class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        int count=0;
        for(char c:t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    count++;
                if(map.get(c)<0)
                    return false;
            }
            else
                return false;
        }
        return count==map.size();
    }
}