class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list=new ArrayList<>();
        Map<String,Integer> map=new TreeMap<>();
        for(String s:words)
            map.put(s,map.getOrDefault(s,1)+1);
        Queue<String> q=new LinkedList<>();
        for(String s:map.keySet()){
            Queue<String> temp=new LinkedList<>();
            while(!q.isEmpty() && map.get(s)<=map.get(q.peek()))
                    temp.add(q.poll());
            temp.add(s);
            while(!q.isEmpty())
                temp.add(q.poll());
            q=new LinkedList<>(temp);
            System.out.println(q);
        }
        for(int i=0;i<k;i++)
            list.add(q.poll());
        return list;
    }
}