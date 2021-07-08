class Node{
    Node[] next;
    char val;
    boolean word;
    Node(){
    }
    Node(char c){
        next=new Node[26];
        val=c;
        word=false;
    }
}
class WordDictionary {
    Node root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root=new Node(' ');
    }
    
    public void addWord(String word) {
        Node cur=root;
        for(char c:word.toCharArray()){
            if(cur.next[c-'a']==null)
                cur.next[c-'a']=new Node(c);
            cur=cur.next[c-'a'];
        }
        cur.word=true;
    }
    
    public boolean search(String word) {
        Node cur=root;
        return dfs(cur,word);
    }
    public boolean dfs(Node cur,String word){
        if(word.length()==0) return cur.word;
        char c=word.charAt(0);
        if(c=='.'){
            for(int i=0;i<26;i++){
                if(cur.next[i]!=null){
                    if(dfs(cur.next[i],word.substring(1))){
                        return true;
                    }
                }
            }
        }else{
            return cur.next[c-'a']!=null && dfs(cur.next[c-'a'],word.substring(1));
        }
        return false;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */