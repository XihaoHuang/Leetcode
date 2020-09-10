class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] c=S.toCharArray();
        List<List<Integer>> list=new ArrayList<>();
        int i=1;
        while(i<c.length){
            List<Integer> arr=new ArrayList<>();
            int end=i;
            while(end<c.length && c[end]==c[end-1]){
                end++;
            }
            if(end-i>=2){
                arr.add(i-1);
                arr.add(end-1);
                list.add(arr);
            }
            i=end;
            i++;
        }
        return list;
    }
}