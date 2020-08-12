class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al=new ArrayList<Integer>();
        for(int r=0;r<=rowIndex;r++){
            if(r==0){
                al.add(1);
            }
            else if(r==1){
                al=new ArrayList<>();
                al.add(1);
                al.add(1);   
            }else{
                List<Integer> temp=new ArrayList<>();
                temp.add(1);
                for(int i=0;i<=al.size()-2;i++){
                    temp.add(al.get(i)+al.get(i+1));
                }
                temp.add(1);
                al=temp;
            }
        }
        return al;
    }
}
