import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry=0;
		int ans;
		ListNode l3=new ListNode(0);
		ListNode l4=l3;
		while(l1!=null || l2!=null) {
			if(l1==null) l1=new ListNode(0);	
			if(l2==null) l2=new ListNode(0);
			ans=l1.val+l2.val+carry;
			if((ans)>9) {
				l4.next=new ListNode(ans%10);
				carry=ans/10;
			}else
			{
				l4.next=new ListNode(ans);
				carry=0;
			}	
			l1=l1.next;
			l2=l2.next;
			l4=l4.next;
		}
		if(carry>0)
			l4.next=new ListNode(carry);
		
		return l3.next;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        int[] nodeValues = stringToIntegerArray(input);
    
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new Solution().addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}