class Node{
    int key;
    int value;
    Node pre;
    Node next;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class LRUCache {
    public Map<Integer,Node> map=new HashMap<>();
    public int capacity,count=0;
    public Node head;
    public Node tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.pre=head;
    }
    
    public void deleteNode(Node node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
    public void addnodetohead(Node node){
        node.next=head.next;
        head.next.pre=node;
        node.pre=head;
        head.next=node;
    }
    public int get(int key) {
        if(map.get(key)!=null){
            deleteNode(map.get(key));
            addnodetohead(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.get(key)!=null){
            Node node=map.get(key);
            node.value=value;
            deleteNode(node);
            addnodetohead(node);
        }else{
            Node node=new Node(key,value);
            map.put(key,node);
            if(count<capacity){
                count++;
                addnodetohead(node);
            }else{
                map.remove(tail.pre.key);
                deleteNode(tail.pre);
                addnodetohead(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */