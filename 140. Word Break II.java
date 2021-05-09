class Solution {
    List<String> list=new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        wordsearch(s,"",wordDict);
        return list;
    }
    public void wordsearch(String s,String sb, List<String> w){
        if(s.length()==0){
            list.add(sb.substring(1));
            return;
        }
        for(int i=0;i<=s.length();i++)
            if(w.contains(s.substring(0,i)))
                wordsearch(s.substring(i),sb+" "+s.substring(0,i),w);
    }
}