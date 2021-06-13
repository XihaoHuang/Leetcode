class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(String b:banned)
            set.add(b);
        int max=0;String ans="";
        StringBuilder sb=new StringBuilder();
        paragraph=paragraph+" ";
        for(int i=0;i<paragraph.length();i++){
            char c=paragraph.charAt(i);
            if(c==' ' || c=='!' || c=='?' || c=='.' || c==',' || c==';' || c==39){
                String s1=sb.toString();
                if(s1.length()==0) continue;
                // System.out.println(s1);
                if(!set.contains(s1)){
                    map.put(s1,map.getOrDefault(s1,0)+1);
                    if(map.get(s1)>max){
                        max=map.get(s1);
                        ans=s1;
                    }
                }
                sb=new StringBuilder();
            }else{
                sb.append(c);
            }
        }
        return ans;
    }
}