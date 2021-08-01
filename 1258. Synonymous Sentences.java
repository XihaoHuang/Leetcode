class Solution {
    public List<String> generateSentences(List<List<String>> s, String text) {
        Set<String> set=new TreeSet<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<s.size();i++){
            String key=s.get(i).get(0);
            String value=s.get(i).get(1);
            map.putIfAbsent(key,new LinkedList<String>());
            map.get(key).add(value);
            map.putIfAbsent(value,new LinkedList<String>());
            map.get(value).add(key);
        }
        Queue<String> q=new LinkedList<>();
        q.add(text);
        while(!q.isEmpty()){
            String t1=q.remove();
            set.add(t1);
            String[] t=t1.split(" ");
            for(int i=0;i<t.length;i++){
            if(!map.containsKey(t[i])) continue;
                for(String w:map.get(t[i])){
                    t[i]=w;
                    String newtext=String.join(" ",t);
                    if(!set.contains(newtext))
                        q.add(newtext);
                }
            }
        }
        return new ArrayList<>(set);
    }
}