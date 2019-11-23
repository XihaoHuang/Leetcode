package letterCombinations;
import java.util.*;
public class lettercombinations {
	public static List<String> letterCombinations(String digits) {
		String[] letters= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> list=new ArrayList<>();
		   if(digits.length()==0) return list;
		backtrack(list,digits.toCharArray(),"",letters);
		return list;
        
    }
	private static void backtrack(List<String> list, char[] digit, String s, String[] letters) {
		int sl=s.length();
		if(sl==digit.length) {
			list.add(s);
			return;
		}
		int dig=digit[sl]-'0';
		for(char letter: letters[dig].toCharArray()) {
			backtrack(list,digit,s+Character.toString(letter),letters);
		}
		
	}
	public static void main(String[] args) {
		String a="23";
		String b="";
		System.out.println(letterCombinations(a));
		System.out.println(letterCombinations(b));
	}
}
