/**
 * Definition for singly-linked list.
 */


	public class RemoveNthfromEnd {
		int val;
		RemoveNthfromEnd next;
		RemoveNthfromEnd(int x) { 
			val = x; 
			}
    public static RemoveNthfromEnd removeNthFromEnd(RemoveNthfromEnd head, int n) {
    	int count=0;
    	RemoveNthfromEnd current=head;
    	while(current!=null) {
    		current=current.next;
    		count++;
    	}
    	if(count==n) {
    		head=head.next;
    		return head;
    	}
    	current=head;
    	for(int i=0;i<count-n-1;i++) {
    		current=current.next;
    	}
    	current.next=current.next.next;
    	return head;
        
    }
    public static void main(String[] args) {
    	RemoveNthfromEnd a=new RemoveNthfromEnd(1);
    	RemoveNthfromEnd b=new RemoveNthfromEnd(2);
    	RemoveNthfromEnd c=new RemoveNthfromEnd(3);
    	RemoveNthfromEnd d=new RemoveNthfromEnd(4);
    	RemoveNthfromEnd e=new RemoveNthfromEnd(5);
    	a.next=b;
    	b.next=c;
    	c.next=d;
    	d.next=e;
    	RemoveNthfromEnd current=a;
    	while(current!=null) {
    		System.out.print(current.val+" ");
    		current=current.next;
    	}
    	System.out.println();
    	 removeNthFromEnd(a,2);
    	current=a;
    	 while(current!=null) {
     		System.out.print(current.val+" ");
     		current=current.next;
     	}
    }

	}