
import java.util.Stack;

class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        
        int count=0;
        stack.push(-1);
       
        for(int i=0;i<s.length();i++){
            if(stack.size()>1 && s.charAt(i)==')' && s.charAt(stack.peek())=='('){
                stack.pop();
                count=Math.max(count,i-stack.peek());
            }else
            stack.push(i);
            
        }
        return count;
    }
    public static void main(String[] args) {
    	String s="()";
    	System.out.println(longestValidParentheses(s));
    }
}