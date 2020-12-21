class FrontMiddleBackQueue {
    static class ListNode{
        ListNode prev;
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            prev=null;
            next=null;
        }
    }
    ListNode head;
    ListNode tail;
    int size;
    public FrontMiddleBackQueue() {
        head=new ListNode(-1);
        tail=new ListNode(-1);
        head.next=tail;
        tail.prev=head;
        size=0;
    }
    
    public void pushFront(int val) {
        size++;
        ListNode n=new ListNode(val);
        n.next=head.next;
        head.next.prev=n;
        n.prev=head;
        head.next=n;
    }
    
    public void pushMiddle(int val) {
        size++;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=tail && fast.next.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode n=new ListNode(val);
            n.next=slow.next;
            slow.next.prev=n;
            slow.next=n;
            n.prev=slow;
    }
    
    public void pushBack(int val) {
        ListNode n=new ListNode(val);
        n.prev=tail.prev;
        tail.prev.next=n;
        n.next=tail;
        tail.prev=n;
        size++;
    }
    
    public int popFront() {
        if(size==0) return -1;
        ListNode n=head.next;
        n.next.prev=head;
        head.next=n.next;
        size--;
        return n.val;
    }
    
    public int popMiddle() {
        if(size==0) return -1;
        ListNode fast=head.next;
        ListNode slow=head.next;
        while(fast.next!=tail && fast.next.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow.next.prev=slow.prev;
        slow.prev.next=slow.next;
        size--;
        
    return slow.val;
    }
    
    public int popBack() {
        if(size==0) return -1;
        ListNode back=tail.prev;
        back.prev.next=tail;
        tail.prev=back.prev;
        size--;
        return back.val;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */