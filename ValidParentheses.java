import java.util.*;
class ValidParentheses {
    public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		char[] ca=s.toCharArray();
		for(char c:ca) {
			if(c=='(' || c=='{' || c=='[')
				stack.push(c);
			else{
				if(stack.isEmpty()) return false;
				char c1=stack.pop();
				if(c==']' && c1!='[') return false; 
				if(c=='}' && c1!='{') return false;
				if(c==')' && c1!='(') return false; 
			}			
		}
		return stack.isEmpty();
        
    }
    public static void main(String[] args) {
    	String a="{[]}";
    	System.out.println(isValid(a));
    }
}