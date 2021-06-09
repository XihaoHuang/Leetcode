class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> list=new ArrayList<>();
        backtrack(num,list,0);
        return list;
    }
    public boolean backtrack(String num,List<Integer> list,int start){
        if(start==num.length() && list.size()>=3) return true;
        for(int i=start;i<num.length();i++){
            if(num.charAt(start)=='0' && i>start)
                break;
            long n=Long.parseLong(num.substring(start,i+1));
            if(n>Integer.MAX_VALUE)
                break;
            int len=list.size();
            if(len>=2 && n>list.get(len-1)+list.get(len-2))
                break;
            if(len<=1 || n==list.get(len-1)+list.get(len-2)){
                list.add((int)n);
                System.out.println(list);
                if(backtrack(num,list,i+1))
                    return true;
                list.remove(list.size()-1);
            }
        }
        return false;
    }
}