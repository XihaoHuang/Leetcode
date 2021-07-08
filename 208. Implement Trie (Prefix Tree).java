class Node{
    char val;
    Node[] next;
    boolean word;
    Node(){
    };
    Node(char c){
        next=new Node[26];
        val=c;
        word=false;
    }
}
class Trie {
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root=new Node(' '); 
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node cur=root;
        for(char c:word.toCharArray()){
            if(cur.next[c-'a']==null)
                cur.next[c-'a']=new Node(c);
            cur=cur.next[c-'a'];
        }
        cur.word=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node cur=root;
        for(char c:word.toCharArray()){
            if(cur.next[c-'a']==null) return false;
            cur=cur.next[c-'a'];
        }
        return cur.word;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node cur=root;
        for(char c:prefix.toCharArray()){
            if(cur.next[c-'a']==null) return false;
            cur=cur.next[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */