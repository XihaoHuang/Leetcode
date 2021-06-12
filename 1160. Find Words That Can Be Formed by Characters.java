class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(String s:words){
            HashMap<Character,Integer> m=new HashMap<>(map);
            int size=0;
            for(char c:s.toCharArray()){
                if(m.containsKey(c) && m.get(c)>0){
                    m.put(c,m.get(c)-1);
                }else{
                    size=0;
                    break;
                }
                size++;
            }
            sum+=size;
        }
        return sum;
    }
}