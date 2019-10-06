
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.*;

public class EvaluateStack {
	public static Double Evaluate(String input) throws Exception {
		boolean allowOp = false;
		boolean nextareint = false;
		boolean convertsign=false;
		input = input.replaceAll("\\s", "");
		char[] s = input.toCharArray();
		Stack<Double> value = new Stack<>();
		Stack<Character> operator = new Stack<>();
		for (int i = 0; i < s.length; i++) {
			StringBuilder val = new StringBuilder();
			if ((s[i] >= 48 && s[i] <= 57) || Isnegative(i,s) || (convertsign==true && s[i] >= 48 && s[i] <= 57)) {
				//if its 5-3,change to 5+(-3),in case 5-3+1, 1+3=4, 5-4=1
				if(convertsign) {
					convertsign=false;
					val.append('-');
				}
				// convert negative sign
				if(Isnegative(i,s)) val.append(s[i++]);
				// the number is greater than 9
				while (i < s.length && ((s[i] >= 48 && s[i] <= 57) ||s[i]==46))
					val.append(s[i++]);
					i--;
				value.push(Double.parseDouble(val.toString()));
				//if the sign is * or / and next s[i] is number, allow to operator
				if (allowOp)	nextareint = true;
				}
				else if (s[i] == '*' || s[i] == '/' || s[i] == '+' || s[i] == '-') {
				// if s[i] is '-' and next value is number ,change to '+', next value become negative 
					if(s[i]=='-' && s[i+1] >= 48 && s[i+1] <= 57) {
						s[i]='+';
						convertsign=true;
					}
				operator.push(s[i]);
				if (s[i] == '*' || s[i] == '/')
					allowOp = true;
				}
				else if (s[i] == '(') {
				operator.push(s[i]);
				allowOp = false;
				convertsign=false;
				}
				else if (s[i] == ')') { 
				while (operator.peek() != '(') {
					value.push(StartOp(operator.pop(), value.pop(), value.pop()));
				}
				operator.pop();
				
				if (!operator.empty() &&(operator.peek() == '*' ||operator.peek() == '/'))
					value.push(StartOp(operator.pop(),value.pop(),value.pop()));
				
				}
			
			  if(allowOp && nextareint) {
			  value.push(StartOp(operator.pop(),value.pop(),value.pop()));
			  nextareint=false;
			  allowOp=false;
			  }
		}  
			while(!operator.empty()) {
				value.push(StartOp(operator.pop(),value.pop(),value.pop()));
			}
		return value.pop(); 

	}

// if '-' ,after */+-( or begin at first, which is negative sign not minus 
	private static boolean Isnegative(int i, char[] s) {
		if((i>0 && (s[i]=='+' || s[i] == '-') &&(s[i-1] == '*' || s[i-1] == '/' || s[i-1] == '+' || s[i-1] == '-' || s[i-1]=='(') ) || (i==0 && (s[i]=='+' || s[i] == '-'))){
			return true;
		}
		return false;
	}


	private static  Double StartOp(Character op, Double n2, Double n1) throws Exception {
		switch (op) {
		case '+':
			return n1 + n2;
		case '-':
			return n1 - n2;
		case '/':
			if (n2 == 0)
				throw new Exception("Demominator cannot be 0");
			return n1 / n2;
		case '*':
			return n1 * n2;
		}
		return (double) 0;
	}
	public static void main(String[] atgs) throws Exception {
		BufferedReader in= new BufferedReader(new FileReader("data.txt"));
		String line;
		DecimalFormat df = new DecimalFormat("#.##");
		  while((line=in.readLine())!=null) {
			  System.out.print(line+"=");
			  System.out.println(df.format(EvaluateStack.Evaluate(line))); 
			  	}
		  	 	 
	}
}
