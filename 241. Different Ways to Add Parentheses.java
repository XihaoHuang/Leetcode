class Solution {
    public List<Integer> diffWaysToCompute(String e) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<e.length();i++){
            if(e.charAt(i)=='-' || e.charAt(i)=='+' || e.charAt(i)=='*' ){
                List<Integer> left=diffWaysToCompute(e.substring(0,i));
                List<Integer> right=diffWaysToCompute(e.substring(i+1));
                for(int l:left){
                    int sum=0;
                    for(int r:right){
                        switch(e.charAt(i)){
                            case '+': sum=l+r;
                                break;
                            case '-': sum=l-r;
                                break;
                            case '*': sum=l*r;
                                break;
                        }
                    list.add(sum);
                    }
                }
            }
        }
        if(list.size()==0){
            list.add(Integer.parseInt(e));
        }
        return list;
    }
}