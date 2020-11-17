class Solution {
    public int calculate(String s) {
        Stack<Integer> ss=new Stack<>();
        int result=0;
        int number=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                number=number*10+(int)(c-'0');
            }else if(c=='+'){
                result+=sign*number;
                number=0;
                sign=1;
            }else if(c=='-'){
                result+=sign*number;
                number=0;
                sign=-1;
            }else if(c=='('){
                ss.push(result);
                ss.push(sign);
                sign=1;
                result=0;
            }else if(c==')'){
                result+=sign*number;
                number=0;
                result*=ss.pop();
                result+=ss.pop();
            }
        }
        return (number!=0) ? result+sign*number : result;
    }
}