class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    Node head;
    int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size=0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size) return -1;
        Node c=head;
        while(index>0){
            c=c.next;
            index--;
        }
        return c.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head==null){
            head=new Node(val);
        }else{
            Node node=new Node(val);
            node.next=head;
            head=node;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node c=head;
        if(c==null){
            head=new Node(val);
            size++;
            return;
        }
        while(c.next!=null){
            c=c.next;
        }
        Node node=new Node(val);
        c.next=node;
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        Node node=new Node(val);
        if(index==0){
            node.next=head;
            head=node;
        }else{
            Node c=head;
            while(index>1){
                c=c.next;
                index--;
            }
            node.next=c.next;
            c.next=node;
        }
        size++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>=size) return;
        if(index==0){
            head=head.next;
        }else{
            Node c=head;
            while(index>1){
                c=c.next;
                index--;
            }
            if(c.next!=null)
                c.next=c.next.next;
            else
                c.next=null;
        }
            size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */