class Solution {
    public List<String> generatePossibleNextMoves(String c) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<c.length();i++){
            if(c.charAt(i-1)=='+' && c.charAt(i)=='+'){
                String s=c.substring(0,i-1)+"--"+c.substring(i+1);
                list.add(s);
            }            
        }
        return list;
    }
}