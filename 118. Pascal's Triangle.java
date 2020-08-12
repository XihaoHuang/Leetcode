class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> al=new ArrayList<>();
        for(int r=0;r<numRows;r++){
            if(r==0){
                al.add(1);
                list.add(al);
            }
            else if(r==1){
                al=new ArrayList<>();
                al.add(1);
                al.add(1);   
                list.add(al);
            }
            else{
                List<Integer> temp=new ArrayList<>();
                temp.add(1);
                for(int i=0;i<=al.size()-2;i++){
                    temp.add(al.get(i)+al.get(i+1));
                }
                temp.add(1);
                list.add(temp);
                al=temp;
            }
        }
        return list;
    }
}