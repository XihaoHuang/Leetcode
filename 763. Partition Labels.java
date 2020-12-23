class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list=new ArrayList<>();
        int[] count=new int[26];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)-'a']=i;
        }
        int start=0,end=0;
        for(int i=0;i<S.length();i++){
            end=Math.max(end,count[S.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start=i+1;
            }
        }  
        return list;
    }
}