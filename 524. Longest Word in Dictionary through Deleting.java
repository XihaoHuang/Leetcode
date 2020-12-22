class Solution {
    public String findLongestWord(String s, List<String> d) {
        int maxlength=0;
        String longest="";
        for(String dic:d){
            int index=0;
            for(char c:s.toCharArray()){
                if(index<dic.length() && dic.charAt(index)==c)
                    index++;
            }
            if(index==dic.length() && dic.length()>=maxlength){
                if(dic.length()>maxlength || dic.compareTo(longest)<0){
                    maxlength=dic.length();
                    longest=dic;
                }
            }
        }
        return longest;
    }
}