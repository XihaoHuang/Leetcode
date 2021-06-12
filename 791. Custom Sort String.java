class Solution {
    public String customSortString(String order, String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        StringBuilder sb=new StringBuilder();
        for(char c:order.toCharArray()){
            if(map.containsKey(c)){
                int count=0;
                while(count<map.get(c)){
                    sb.append(c);
                    count++;
                }
                map.remove(c);
            }
        }
        for(Character c: map.keySet()){
            int count=0;
            while(count<map.get(c)){
                sb.append(c);
                count++;
            }           
        }
        return sb.toString();
    }
}