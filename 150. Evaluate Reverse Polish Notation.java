class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String token :tokens){
            if(token.equals("+")){
                int second=s.pop();
                int first=s.pop();
                s.push(first+second);
            }else if(token.equals("/")){
                int second=s.pop();
                int first=s.pop();
                s.push(first/second);
            }else if(token.equals("*")){
                int second=s.pop();
                int first=s.pop();
                s.push(first*second);
            }else if(token.equals("-")){
                int second=s.pop();
                int first=s.pop();
                s.push(first-second);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }
}