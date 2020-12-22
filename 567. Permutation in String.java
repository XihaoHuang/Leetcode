class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s1.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        int count=0;
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);   
                if(map.get(c)==0)
                    count++;
            }
            
            if(i>=s1.length()){
                char c1=s2.charAt(i-s1.length());
                if(map.containsKey(c1)){
                    if(map.get(c1)==0)
                        count--;
                    map.put(c1,map.get(c1)+1);
                }
            }
            if(count==map.size()) return true;
        }
        return false;
    }
}