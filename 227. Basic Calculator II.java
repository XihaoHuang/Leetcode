class Solution {
    public int calculate(String s) {
        Stack<Integer> n=new Stack<>();
        int number=0;
        char sign='+';
        int result=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                number=10*number+(int)(c-'0');
            }
            if(!Character.isDigit(c) && c!=' ' || i==s.length()-1){
                    if(sign=='+')
                        n.push(number);
                    if(sign=='-')
                        n.push(-number);
                    if(sign=='*')
                        n.push(n.pop()*number);
                    if(sign=='/')
                        n.push(n.pop()/number);
                    number=0;
                    sign=c;
                }
            }
        while(!n.isEmpty()){
            result+=n.pop();
        }
        return result;
    }
}