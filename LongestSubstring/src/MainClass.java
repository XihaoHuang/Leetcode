import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static int solution(String s) {
        int size=s.length();
        int ans=0,temp=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<size;i++) {
        	if(map.containsKey(s.charAt(i))) {
        		temp=Math.max(temp, i+1);
        	}        	
        	ans=Math.max(ans, i-temp+1);
        	map.put(s.charAt(i), i+1);
        }
    return ans;
    }
		
	public static void main(String[] args) {
		String s="abcabcbb";
		String s1=" ";
		String s2="au";
		String s3="pwkkew";
		System.out.println(solution(s));
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
	}
}
